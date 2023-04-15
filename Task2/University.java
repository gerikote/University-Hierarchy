package homework.Task2;


import java.util.ArrayList;
import java.util.Arrays;

public class University {

    private String name;
    private String address;
    private ArrayList<Students> students;
    private ArrayList<Staff> staff;
    private ArrayList<Course> courses;

    public University(String name, String address, ArrayList<Students> students, ArrayList<Staff> staff, ArrayList<Course> courses) {
        this.name = name;
        this.address = address;
        this.students = students;
        this.staff = staff;
        this.courses = courses;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Students> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Students> students) {
        this.students = students;
    }

    public ArrayList<Staff> getStaff() {
        return staff;
    }

    public void setStaff(ArrayList<Staff> staff) {
        this.staff = staff;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public void getDetails() {
        System.out.println("Welcome to " + getName() + "\n"
                + "Our university is located in " + getAddress() + "\n"
                + "The courses we offer are : " + getCourses() + "\n"
                + "Our wonderful staff includes our teachers : " + getStaff());
    }
}

