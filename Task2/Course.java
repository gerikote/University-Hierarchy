package homework.Task2;

import java.util.*;

public class Course implements Enrollable,RevenueCalculatable {

    private String courseCode;
    private String courseName;
    private List<Student> enrolledStudents;
    protected static int courseCount = 0;
    protected static int totalEnrollments = 0;

    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
        courseCount++;
    }

    public static double averageAttendance() {
        double averageAttendance = (double) totalEnrollments / (double) courseCount;
        System.out.println("Average attendance is " + averageAttendance + " students/course");
        return averageAttendance;
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

    @Override
    public void enrollStudent(Student student) {
        if (enrolledStudents.size() < MAX_STUDENTS) {
            System.out.println("The student " + student.getFirstName() + " " + student.getLastName() + " was successfully enrolled in the course " + getCourseName() + "\n");
            enrolledStudents.add(student);
            student.getGrades().put(this, 5); //Set the grade 5 initially;
            student.enrollFromCourse(this);
            totalEnrollments++;
        } else {
            System.out.println("We apologize but this class has reached the maximum number of students." + "\n"
                    + "You can try again in the next semester.");
        }
    }

    @Override
    public void dropoutStudent(Student student) {
        enrolledStudents.remove(student);
        student.getGrades().remove(this);
    }

    public void printCourseRevenue() {
        double courseRev = (enrolledStudents.size() * TUITION);
        System.out.println("The revenue this course generated is : " + courseRev + "$");
    }
@Override
    public double getRevenue() {
        double courseRev = (enrolledStudents.size() * TUITION);
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
