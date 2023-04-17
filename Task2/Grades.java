package homework.Task2;

public class Grades {
    private GradeCalculator gradeCalulator;

    public Grades() {
        this.gradeCalulator = new GradeCalculator();
    }

    public int calculateGPA(Students student) {
        System.out.print("The student's" + student.getFirstName() + " " + student.getLastName() + " gpa is : ");
        return gradeCalulator.calculateGrade(student);
    }

    public void setGradeCalulator(GradeCalculator gradeCalulator) {
        this.gradeCalulator = gradeCalulator;
    }
}
