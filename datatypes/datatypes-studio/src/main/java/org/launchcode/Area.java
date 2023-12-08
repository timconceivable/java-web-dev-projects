package org.launchcode;
import java.util.Scanner;

public class Area {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter circle radius:");
        double radius = input.nextDouble();
// TODO- use a do-while loop to validate whether input is a positive number
//        double radius;
//        do {
//            System.out.println("Please enter circle radius:");
//            radius = input.nextDouble();
//        } while (Double.isNaN(radius));
        input.close();

        double area = Circle.getArea(radius);
        System.out.println("Circle area: " + area);
    }
}