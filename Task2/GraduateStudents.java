package homework.Task2;

public class GraduateStudents extends Students {
    private String thesisTopic;

    public GraduateStudents(String studentID, String firstName, String lastName, String email, String major, String thesisTopic) {
        super(studentID, firstName, lastName, email, major);
        this.thesisTopic = thesisTopic;
    }

    public String getThesisTopic() {
        return thesisTopic;
    }

    public void setThesisTopic(String thesisTopic) {
        this.thesisTopic = thesisTopic;
    }

    public void introduceMyself() {
        System.out.println("Hello. My name is " + getFirstName() + ".\n" +
                "My major is " + getMajor() + " and my thesis topic is " + getThesisTopic() + "\n");
    }
}