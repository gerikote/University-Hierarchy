package homework.Task2;

public final class UndergraduateStudent extends Student implements Studyable {
    private int yearLevel;

    public UndergraduateStudent(String firstName, String lastName, String email, String major, int yearLevel) {
        super(firstName, lastName, email, major);
        this.yearLevel = yearLevel;
    }

    @Override
    public void study() {
        System.out.println("The grades for student " + getFirstName() + " " + getLastName() + " are :" + getGrades());
        System.out.println("The student just spent an entire day studying all his classes");
        for (Course course : super.getGrades().keySet()) {
            int currentGrade = super.getGrades().get(course);
            super.getGrades().put(course, currentGrade + 1);
        }
        System.out.println("The new grades for student " + getFirstName() + " " + getLastName() + " are :" + getGrades());
        System.out.println();

    }

    public int getYearLevel() {
        return yearLevel;
    }

    @Override
    public void introduceMyself() {
        System.out.println("Hello. My name is " + getFirstName() + ".\n" +
                "I am on the " + getYearLevel() + " year and my major is " + getMajor() + "\n");
    }
}