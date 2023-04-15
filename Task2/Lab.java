package homework.Task2;

public class Lab extends Course {
    private Staff labAssistant;

    public Lab(String courseCode, String courseName, String[] prerequisites, int maxStudents, Staff labAssistant) {
        super(courseCode, courseName, prerequisites, maxStudents);
        this.labAssistant = labAssistant;
    }

    public Staff getLabAssistant() {
        return labAssistant;
    }

    public void setLabAssistant(Staff labAssistant) {
        this.labAssistant = labAssistant;
    }
}