package homework.Task2;

public class UndergraduateStudent extends Student {
    private int yearLevel;

    public UndergraduateStudent(String firstName, String lastName, String email, String major, int yearLevel) {
        super( firstName, lastName, email, major);
        this.yearLevel = yearLevel;
    }

    public int getYearLevel() {
        return yearLevel;
    }

    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }
@Override
    public void introduceMyself() {
        System.out.println("Hello. My name is " + getFirstName() + ".\n" +
                "I am on the " + getYearLevel() + " year and my major is " + getMajor() + "\n");
    }
}