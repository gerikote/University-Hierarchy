package homework.Task2.people;

import homework.Task2.exceptions.InvalidAgeException;
import homework.Task2.exceptions.InvalidEmailException;
import homework.Task2.exceptions.InvalidNameFormatException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Staff extends Person {
    private static final Logger logger = LogManager.getLogger(Staff.class);
    private static int counter = 0;
    private String staffID;

    public Staff(String firstName, String lastName, String email, int age) throws InvalidAgeException, InvalidNameFormatException, InvalidEmailException {
        super(firstName, lastName, email, age);
        this.staffID = generateStaffID();
    }

    private final String generateStaffID() {
        counter++;
        String id = String.format("%05d", counter);
        return id;
    }

    public String getStaffID() {
        return staffID;
    }

    public abstract void introduceMyself();

    @Override
    public boolean equals(Object obj) {
        if ((obj == null || !(obj instanceof Staff))) {
            return false;
        }
        Staff other = (Staff) obj;
        if (!super.equals(other)) {
            return false;
        }
        if (!this.getStaffID().equals(other.getStaffID())) {
            return false;
        }
        return true;
    }
}
