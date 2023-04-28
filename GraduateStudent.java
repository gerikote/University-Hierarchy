package homework.Task2;

public final class GraduateStudent extends Student implements IStudyable {
    private String thesisTopic;
    private int thesisProgress;

    public GraduateStudent(String firstName, String lastName, String email, String major, String thesisTopic) {
        super(firstName, lastName, email, major);
        this.thesisTopic = thesisTopic;
        this.thesisProgress = 30;
    }

    @Override
    public void study() {
        printThesisProgress();
        if (thesisProgress < MAX_THESIS_PROGRESS) {
            thesisProgress += THESIS_PROGRESSION;
        }
        System.out.println("The student spent 1 hour studying!" + "\n"
                + "After the session the progress is at " + thesisProgress + "%" + "\n");

    }

    public void printThesisProgress() {
        System.out.println("The student " + super.getFirstName() + " " + super.getLastName() +
                " progress at his thesis is currently at " + thesisProgress + "%");
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