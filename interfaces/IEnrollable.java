package homework.Task2.interfaces;

import homework.Task2.exceptions.MaxStudentsReachedException;
import homework.Task2.people.Student;

public interface IEnrollable {
    int MAX_STUDENTS = 25;

    void enrollStudent(Student student) throws MaxStudentsReachedException;

    void dropoutStudent(Student student);
}
