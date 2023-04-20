package homework.Task2;

import java.util.ArrayList;
import java.util.Arrays;

public class AcademicStaff extends Staff {
    private ArrayList<Course> courses;

    public AcademicStaff(String staffID, String firstName, String lastName, String email) {
        super(staffID, firstName, lastName, email);
        this.courses = new ArrayList<>();
    }
public void addCourse(Course course){
        this.courses.add(course);
}
    public ArrayList<Course> getCourses() {
        return courses;
    }

    @Override
    public void introduceMyself() {
        System.out.println("Hello. My name is Professor " + getFirstName() + ".\n" +
                "and i teach the classes " + courses.toString() + "\n");
    }
}

