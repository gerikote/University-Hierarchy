package homework.Task2;

import java.util.*;

public class Students extends Person {
    private String studentID;

    private String major;
    private Map<Course, Integer> grades;

    public Students(String studentID, String firstName, String lastName, String email, String major) {
        super(firstName, lastName, email);
        this.studentID = studentID;
        this.major = major;
        this.grades = new HashMap<>();
    }

    public void studyHard() {
        System.out.println("The grades for student " + getFirstName() + " " + getLastName() + " are :" + getGrades());
        System.out.println("The student just spent an entire day studying all his classes");
        for (Course course : grades.keySet()) {
            int currentGrade = grades.get(course);
            grades.put(course, currentGrade + 1);
        }
        System.out.println("The new grades for student " + getFirstName() + " " + getLastName() + " are :" + getGrades());
        System.out.println();

    }

    public void study(Course course) {
        System.out.println("The grades for student " + getFirstName() + " " + getLastName() + " are :" + getGrades());
        System.out.println("The student is studying " + course.getCourseName());
        int currentGrade = grades.get(course);
        grades.put(course, currentGrade + 1);
        System.out.println("The new grades for student " + getFirstName() + " " + getLastName() + " are :" + getGrades());
        System.out.println();

    }

    public void giveExam(Course course) {

        System.out.println("The grades for student " + getFirstName() + " " + getLastName() + " are :" + getGrades());
        System.out.println("The student " + getFirstName() + " is ready to give a " + course.getCourseName() + " exam");
        int randomNumber = (int) (Math.random() * 101);
        System.out.println("Exam score is : " + randomNumber);
        if (randomNumber >= 50) {
            System.out.println("Congratulations!! Exam passed with successfully! Course grade is going to increase by 1");
            int currentGrade = grades.get(course);
            grades.put(course, currentGrade + 1);
        } else {
            System.out.println("Exam failed.Course grade is going to decrease by 1");
            int currentGrade = grades.get(course);
            grades.put(course, currentGrade - 1);
        }
        System.out.println("The new grades for student " + getFirstName() + " " + getLastName() + " are :" + getGrades() + "\n");

    }

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


}

