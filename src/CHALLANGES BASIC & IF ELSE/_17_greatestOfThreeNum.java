package CHALLANGES;

import java.util.Scanner;

public class _17_greatestOfThreeNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE ENTER YOUR 1ST NUMBER : ");
        int num1 = input.nextInt();
        System.out.print("PLEASE ENTER YOUR 2ND NUMBER : ");
        int num2 = input.nextInt();
        System.out.print("PLEASE ENTER YOUR 3RD NUMBER : ");
        int num3 = input.nextInt();
        if(num1>num2 && num1>num3){
            System.out.println("the greatest number is : "+num1);
        }
        else if(num2>num1 && num2>num3){
            System.out.println("the greatest number is : "+num2);
        }
        else if(num3>num2 && num3>num1)System.out.println("the greatest number is : "+num3);
        else if(num3==num2 && num3>num1)System.out.println("the greatest number is : "+num2);
        else System.out.println("the greatest number is : "+num1);
    }
}
