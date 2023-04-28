package homework.Task2;

import java.util.Map;

public class GradeCalculator {
    public int calculateGrade(Map<Course, Integer> grades) {
        //Calculate GPA formula
        int total = 0;
        for (int grade : grades.values()) {
            total += grade;
        }
        return total / grades.size();
    }

    public int calculateGrade(Student student) {
        //This is made just to call the method calculateGrade(Map<Course,Integer grades)
        //Could merge these methods in one
        return calculateGrade(student.getGrades());
    }
}
