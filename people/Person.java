package homework.Task2.people;

import homework.Task2.exceptions.InvalidAgeException;
import homework.Task2.exceptions.InvalidEmailException;
import homework.Task2.exceptions.InvalidNameFormatException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Person {
    private static final Logger logger = LogManager.getLogger(Person.class);
    String firstName;
    String lastName;
    String email;
    int age;

    public Person(String firstName, String lastName, String email, int age) throws InvalidAgeException, InvalidEmailException, InvalidNameFormatException {
        if (age < 16 || age > 150) {
            throw new InvalidAgeException("Invalid age: " + age);
        }
        if (!isValidEmail(email)) {
            throw new InvalidEmailException("Invalid email address: " + email);
        }
        if (!isValidFirstName(firstName) || !isValidLastName(lastName)) {
            throw new InvalidNameFormatException("Name format is not valid.");
        }
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public static boolean isValidFirstName(String firstName) {
        String regex = "^[a-zA-Z\\-']+$";
        return firstName.matches(regex);
    }

    public static boolean isValidLastName(String lastName) {
        String regex = "^[a-zA-Z\\-']+(\\s[a-zA-Z\\-']+)*$";
        return lastName.matches(regex);
    }

    private boolean isValidEmail(String email) {
        String regex = "^[^@]+@[^@]+\\.[a-zA-Z]{2,}$";
        return email.matches(regex);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract void introduceMyself();

    @Override
    public String toString() {
        return (firstName + " " + lastName);
    }
}
