package homework.Task2;


import homework.Task2.courses.Course;
import homework.Task2.interfaces.IRevenueCalculatable;
import homework.Task2.people.Staff;
import homework.Task2.people.Student;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

public class University implements IRevenueCalculatable {
    private static final Logger logger = LogManager.getLogger(University.class);
    private final String name;
    private String address;
    private ArrayList<Student> students;
    private ArrayList<Staff> staff;
    private ArrayList<Course> courses;

    public University(String name, String address) {
        this.name = name;
        this.address = address;
        this.students = new ArrayList<>();
        this.staff = new ArrayList<>();
        this.courses = new ArrayList<>();

    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void dropoutStudent(Student student) {
        this.students.remove(student);
    }

    public void addStaff(Staff staffMember) {
        this.staff.add(staffMember);
    }

    public void addCourse(Course course) {
        this.courses.add(course);
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<Staff> getStaff() {
        return staff;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    @Override
    public double getRevenue() {
        double totalRev = 0;
        for (int i = 0; i < courses.size(); i++) {
            totalRev += courses.get(i).TUITION;
        }
        System.out.println("The total revenue for the University is : " + totalRev + "$");
        return totalRev;
    }

    public void printDetails() {
        System.out.println("Welcome to " + getName() + "\n"
                + "Our university is located in " + getAddress() + "\n"
                + "The courses we offer are : " + getCourses() + "\n"
                + "Our wonderful staff includes our teachers : " + getStaff() + "\n");
    }
}

