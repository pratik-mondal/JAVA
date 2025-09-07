package METHOD;

import java.util.Scanner;

public class _01_maxFind {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your four digit number : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        System.out.print("your greatest number is : " +Math.max(Math.max(num2,num1),Math.max(num4,num3)));
    }
}
