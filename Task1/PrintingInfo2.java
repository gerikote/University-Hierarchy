package homework.Task1;

import java.sql.SQLOutput;
import java.util.Scanner;


public class PrintingInfo2 {

    public static void printInfo(String firstName, String lastName, int id, String phoneNumber) {
        System.out.println("First name is : " + firstName + "\n"
                + "Last name is :" + lastName + "\n"
                + "id is :  " + id + "\n"
                + "phone number is : " + phoneNumber);


    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String firstName = input.next();

        System.out.println("Enter your last name:");
        String lastName = input.next();

        System.out.println("Enter your id:");
        int id = input.nextInt();


        System.out.println("Enter your phone number:");
        String phoneNumber = input.next();

        printInfo(firstName, lastName, id, phoneNumber);


    }
}
