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

    public void study() {
        System.out.println("The student just spent an hour studying");
        for (Course course : grades.keySet()) {
            int currentGrade = grades.get(course);
            grades.put(course, currentGrade + 1);
        }
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

