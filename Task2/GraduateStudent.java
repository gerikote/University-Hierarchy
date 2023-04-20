package homework.Task2;

public class GraduateStudent extends Student {
    private String thesisTopic;

    public GraduateStudent( String firstName, String lastName, String email, String major, String thesisTopic) {
        super( firstName, lastName, email, major);
        this.thesisTopic = thesisTopic;
    }

    public String getThesisTopic() {
        return thesisTopic;
    }

    public void setThesisTopic(String thesisTopic) {
        this.thesisTopic = thesisTopic;
    }

    @Override
    public void introduceMyself() {
        System.out.println("Hello. My name is " + getFirstName() + ".\n" +
                "My major is " + getMajor() + " and my thesis topic is " + getThesisTopic() + "\n");
    }
}