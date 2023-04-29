package homework.Task2.people;

import homework.Task2.courses.Course;
import homework.Task2.exceptions.InvalidAgeException;
import homework.Task2.exceptions.InvalidEmailException;
import homework.Task2.exceptions.InvalidNameFormatException;
import homework.Task2.exceptions.NotEnrolledException;
import homework.Task2.interfaces.IStudyable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class UndergraduateStudent extends Student implements IStudyable {
    private static final Logger logger = LogManager.getLogger(UndergraduateStudent.class);
    private int yearLevel;

    public UndergraduateStudent(String firstName, String lastName, String email, String major, int yearLevel, int age) throws InvalidAgeException, InvalidNameFormatException, InvalidEmailException {
        super(firstName, lastName, email, major, age);
        this.yearLevel = yearLevel;
    }

    @Override
    public void study() {
        try {
            if (this.enrolledCourses == null) {
                throw new NotEnrolledException("Student " + getFirstName() + " " + getLastName() + " is not enrolled in any courses");
            }
            System.out.println("The grades for student " + getFirstName() + " " + getLastName() + " are :" + getGrades());
            System.out.println("The student just spent an entire day studying all his classes");
            for (Course course : super.getGrades().keySet()) {
                int currentGrade = super.getGrades().get(course);
                super.getGrades().put(course, currentGrade + 1);
            }
            System.out.println("The new grades for student " + getFirstName() + " " + getLastName() + " are :" + getGrades());
            System.out.println();
        } catch (NotEnrolledException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public int getYearLevel() {
        return yearLevel;
    }

    @Override
    public void introduceMyself() {
        System.out.println("Hello. My name is " + getFirstName() + ".\n" +
                "I am on the " + getYearLevel() + " year and my major is " + getMajor() + "\n");
    }
}