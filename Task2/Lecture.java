package homework.Task2;

public class Lecture extends Course {
    private Staff lecturer;

    public Lecture(String courseCode, String courseName, Staff lecturer) {
        super(courseCode, courseName);
        this.lecturer = lecturer;
    }

    public Staff getLecturer() {
        return lecturer;
    }

    public void setLecturer(Staff lecturer) {
        this.lecturer = lecturer;
    }


}