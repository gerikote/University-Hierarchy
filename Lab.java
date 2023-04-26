package homework.Task2;

public class Lab extends Course {
    private Staff labAssistant;

    public Lab(String courseCode, String courseName, Staff labAssistant) {
        super(courseCode, courseName);
        this.labAssistant = labAssistant;
    }

    public Staff getLabAssistant() {
        return labAssistant;
    }

    public void setLabAssistant(Staff labAssistant) {
        this.labAssistant = labAssistant;
    }
}