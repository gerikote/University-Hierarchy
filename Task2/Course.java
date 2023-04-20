package homework.Task2;

import java.util.*;

public class Course {

    private String courseCode;
    private String courseName;
    private String[] prerequisites;
    private int maxStudents;
    private List<Student> enrolledStudents;

    private double tuition;

    public Course(String courseCode, String courseName, int maxStudents) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.maxStudents = maxStudents;
        this.enrolledStudents = new ArrayList<>();
        this.tuition=250d;
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

    public void enrollStudent(Student student) {
        System.out.println("The student " + student.getFirstName() + " " +student.getLastName() + " was successfully enrolled in the course " + getCourseName() +"\n");
        enrolledStudents.add(student);
        student.getGrades().put(this, 5); //Set the grade 5 initially;
        student.enrollFromCourse(this);
    }

    public double getTuition() {
        return tuition;
    }

    public void dropoutStudent(Student student) {
        enrolledStudents.remove(student);
        student.getGrades().remove(this);
    }

    public void printCourseRevenue(){
        double courseRev=(enrolledStudents.size()*tuition);
        System.out.println("The revenue this course generated is : " + courseRev +"$");
    }

    public double getCourseRevenue(){
        double courseRev=(enrolledStudents.size()*tuition);
        return courseRev;

    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    @Override
    public String toString() {
        return courseName;
    }
}
