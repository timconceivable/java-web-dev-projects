package org.launchcode;
import java.util.Scanner;

public class Area {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter circle radius:");
        double radius = input.nextDouble();
        input.close();

        double area = Circle.getArea(radius);
        System.out.println("Circle area: " + area);
    }
}