package homework.Task1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Rectangle {

    public static double perimeter(double length, double width) {
        double per = (2 * length) + (2 * width);

        return per;
    }

    public static double area(double length, double width) {
        double area = length * width;
        return area;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rectangle length");
        double length = sc.nextDouble();

        System.out.println("Enter rectangle width");
        double width = sc.nextDouble();

        System.out.println("The perimeter of the rectangle is : " + perimeter(length, width) + "\n"
                + " and the area is : " + area(length, width));
    }
}
