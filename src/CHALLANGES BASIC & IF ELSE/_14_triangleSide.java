package CHALLANGES;

import java.util.Scanner;

public class _14_triangleSide {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE ENTER YOUR FIRST NUMBER : ");
        double num1 = input.nextDouble();
        System.out.print("PLEASE ENTER YOUR SECOND  NUMBER : ");
        double num2 = input.nextDouble();
        System.out.print("PLEASE ENTER YOUR THIRD NUMBER : ");
        double num3 = input.nextDouble();
        if(num1+num2 > num3 && num2+num3>num1 && num3+num1>num2){
            System.out.print("the side valid of the triangle ");
        }
        else {
            System.out.print("the side not valid of the triangle ");
        }
    }
}
