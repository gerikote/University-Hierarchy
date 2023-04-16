package homework.Task2;

public class Grades {
    private GradeCalculator gradeCalulator;

    public Grades() {
        this.gradeCalulator = new GradeCalculator();
    }

    public int calculateGrade(Students student) {
        return gradeCalulator.calculateGrade(student);
    }

    public void setGradeCalulator(GradeCalculator gradeCalulator) {
        this.gradeCalulator = gradeCalulator;
    }
}
