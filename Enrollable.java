package homework.Task2;

public interface Enrollable {
    int MAX_STUDENTS = 25;

    void enrollStudent(Student student);

    void dropoutStudent(Student student);
}
