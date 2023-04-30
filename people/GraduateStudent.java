package homework.Task2.people;

import homework.Task2.exceptions.InvalidAgeException;
import homework.Task2.exceptions.InvalidEmailException;
import homework.Task2.exceptions.InvalidNameFormatException;
import homework.Task2.interfaces.IStudyable;
import homework.Task2.people.Student;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class GraduateStudent extends Student implements IStudyable {
    private static final Logger logger = LogManager.getLogger(GraduateStudent.class);
    private String thesisTopic;
    private int thesisProgress;

    public GraduateStudent(String firstName, String lastName, String email, String major, String thesisTopic, int age) throws InvalidAgeException, InvalidNameFormatException, InvalidEmailException {
        super(firstName, lastName, email, major, age);
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