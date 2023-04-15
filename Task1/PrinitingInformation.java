package homework.Task1;

import java.sql.SQLOutput;
import java.util.Scanner;


public class PrinitingInformation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the name : ");
        String firstName = input.next();

        System.out.println("Enter the last name:");
        String lastName = input.next();

        System.out.println("Enter the id:");
        String id = input.next();

        System.out.println("First name is : " + firstName + "\n"
                + "Last name is :" + lastName + "\n"
                + "and the student id is :" + id);


    }


}
