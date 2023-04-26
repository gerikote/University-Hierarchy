package homework.Task2;

public class Grade {
    private GradeCalculator gradeCalulator;

    public Grade() {
        this.gradeCalulator = new GradeCalculator();
    }

    public int calculateGPA(Student student) {
        System.out.print("The student's" + student.getFirstName() + " " + student.getLastName() + " gpa is : ");
        return gradeCalulator.calculateGrade(student);
    }

    public void setGradeCalulator(GradeCalculator gradeCalulator) {
        this.gradeCalulator = gradeCalulator;
    }
}
