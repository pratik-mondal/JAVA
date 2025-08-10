package BASICS;

import java.util.Scanner;

public class inputAreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE ENTER YOUR RADIUS : ");
        double radius = input.nextFloat();
        double pi = 3.1415;
        double area = pi*radius*radius;
        System.out.println("RADIUS IS : "+ area);
    }
}
