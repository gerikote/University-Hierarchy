package homework.Task2;

public class UndergraduateStudents extends Students {
    private int yearLevel;

    public UndergraduateStudents(String studentID, String firstName, String lastName, String email, String major, int yearLevel) {
        super(studentID, firstName, lastName, email, major);
        this.yearLevel = yearLevel;
    }

    public int getYearLevel() {
        return yearLevel;
    }

    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }

    public void introduceMyself() {
        System.out.println("Hello. My name is " + getFirstName() + ".\n" +
                "I am on the " + getYearLevel() + " year and my major is " + getMajor() + "\n");
    }
}