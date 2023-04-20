package homework.Task2;


import java.util.ArrayList;

public class University {

    private String name;
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

    public void addStudent(Student student){
        this.students.add(student);
    }

    public void addStaff(Staff staffMember){
        this.staff.add(staffMember);
    }

    public void addCourse(Course course){
        this.courses.add(course);
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

    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<Staff> getStaff() {
        return staff;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void calculateRevenue(){
        double totalRev=0;
        for(int i=0;i<courses.size();i++){
           totalRev+= courses.get(i).getCourseRevenue();
        }
        System.out.println("The total revenue for the University is : " + totalRev +"$");
    }

    public void printDetails() {
        System.out.println("Welcome to " + getName() + "\n"
                + "Our university is located in " + getAddress() + "\n"
                + "The courses we offer are : " + getCourses() + "\n"
                + "Our wonderful staff includes our teachers : " + getStaff() + "\n");
    }
}

