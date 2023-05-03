package homework.Task2.people;

import homework.Task2.courses.Course;
import homework.Task2.exceptions.InvalidAgeException;
import homework.Task2.exceptions.InvalidEmailException;
import homework.Task2.exceptions.InvalidNameFormatException;
import homework.Task2.exceptions.NotEnrolledException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public abstract class Student extends Person {
    private static final Logger LOGGER = LogManager.getLogger(Student.class);
    private static int counter = 0;
    private String studentID;
    private String major;
    private Map<Course, Integer> grades;
    protected List<Course> enrolledCourses;

    public Student(String firstName, String lastName, String email, String major, int age) throws InvalidAgeException, InvalidNameFormatException, InvalidEmailException {
        super(firstName, lastName, email, age);
        this.studentID = generateStudentID();
        this.major = major;
        this.grades = new HashMap<>();
        this.enrolledCourses = new ArrayList<>();
    }

    public void enrollFromCourse(Course course) {
        enrolledCourses.add(course);
    }

    public double calculateTuition() {
        int totalTuition = 0;
        for (int i = 0; i < enrolledCourses.size(); i++) {
            totalTuition += enrolledCourses.get(i).TUITION;
        }
        LOGGER.info("The student is enrolled in the courses : " + enrolledCourses.toString() + "\n"
                + "and the total amount owed in tuition fees is : " + totalTuition + "$");

        return totalTuition;
    }

    public void payTuition() {
        LOGGER.info("The Student " + firstName + " " + lastName + " with student id : " + studentID + "\n"
                + " has successfully paid his total tuition of " + this.calculateTuition() + "$");
    }

    private final String generateStudentID() {
        counter++;
        String id = String.format("%05d", counter);
        return id;
    }

    public void study(Course course) {
        try {
            if (!enrolledCourses.contains(course)) {
                throw new NotEnrolledException("Student " + getFirstName() + " " + getLastName() + " is not enrolled in the " + course.getCourseName());
            }
            LOGGER.info("The grades for student " + getFirstName() + " " + getLastName() + " are :" + getGrades());
            LOGGER.info("The student is studying " + course.getCourseName());
            int currentGrade = grades.get(course);
            grades.put(course, currentGrade + 1);
            LOGGER.info("The new grades for student " + getFirstName() + " " + getLastName() + " are :" + getGrades() +"\n");
        } catch (NotEnrolledException ex) {
            LOGGER.info("Error: " + ex.getMessage());
        }
    }

    public final void takeExam(Course course) {

        try {
            if (!enrolledCourses.contains(course)) {
                throw new NotEnrolledException("Student " + getFirstName() + " " + getLastName() + " is not enrolled in the " + course.getCourseName());
            }
            LOGGER.info("The grades for student " + getFirstName() + " " + getLastName() + " are :" + getGrades());
            LOGGER.info("The student " + getFirstName() + " is ready to give a " + course.getCourseName() + " exam");
            int randomNumber = (int) (Math.random() * 101);
            LOGGER.info("Exam score is : " + randomNumber + "/100");
            if (randomNumber >= 50) {
                LOGGER.info("Congratulations!! Exam passed successfully! Course grade is going to increase by 1");
                int currentGrade = grades.get(course);
                grades.put(course, currentGrade + 1);
            } else {
                LOGGER.info("Exam failed.Course grade is going to decrease by 1");
                int currentGrade = grades.get(course);
                grades.put(course, currentGrade - 1);
            }
            LOGGER.info("The new grades for student " + getFirstName() + " " + getLastName() + " are :" + getGrades() + "\n");
        } catch (NotEnrolledException ex) {
            LOGGER.info(ex.getMessage());
        }
    }

    @Override
    public abstract void introduceMyself();

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setGrades(Map<Course, Integer> grades) {
        this.grades = grades;
    }

    public Map<Course, Integer> getGrades() {
        return grades;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || (obj instanceof Student)) {
            return false;
        }
        Student other = (Student) obj;
        if (!this.getFirstName().equals(other.getFirstName())) {
            return false;
        }
        if (!this.getLastName().equals(other.getLastName())) {
            return false;
        }
        if (!this.getEmail().equals(other.getEmail())) {
            return false;
        }

        return true;
    }
}

