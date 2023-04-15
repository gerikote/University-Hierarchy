package homework.Task2;

import java.util.Arrays;

public class AcademicStaff extends Staff {
    private Course[] courses;

    public AcademicStaff(String staffID, String firstName, String lastName, String email, Course[] courses) {
        super(staffID, firstName, lastName, email);
        this.courses = courses;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    public void introduceMyself() {
        System.out.println("Hello. My name is Professor " + getFirstName() + ".\n" +
                "and i teach the classes " + Arrays.toString(getCourses()));
    }
}

