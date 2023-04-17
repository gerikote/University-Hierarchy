package homework.Task2;

import java.util.*;

public class Course {

    private String courseCode;
    private String courseName;
    private String[] prerequisites;
    private int maxStudents;
    private List<Students> enrolledStudents;

    public Course(String courseCode, String courseName, String[] prerequisites, int maxStudents) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.prerequisites = prerequisites;
        this.maxStudents = maxStudents;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String[] getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String[] prerequisites) {
        this.prerequisites = prerequisites;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public void setMaxStudents(int maxStudents) {
        this.maxStudents = maxStudents;
    }

    public void enrollStudent(Students student) {
        System.out.println("The student " + student.getFirstName() + " " +student.getLastName() + " was successfully enrolled in the course " + getCourseName() +"\n");
        enrolledStudents.add(student);
        student.getGrades().put(this, 5); //Set the grade 5 initially;
    }

    public void dropoutStudent(Students student) {
        enrolledStudents.remove(student);
        student.getGrades().remove(this);
    }

    public List<Students> getEnrolledStudents() {
        return enrolledStudents;
    }

    @Override
    public String toString() {
        return courseName;
    }
}
