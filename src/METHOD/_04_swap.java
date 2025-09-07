package METHOD;

import java.util.Scanner;

public class _04_swap {
    public static void swap(int num1,int num2) {
        int temp =num1;
        num1=num2;
        num2= temp;
        System.out.println(num1);
        System.out.println(num2);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your first number : ");
        int num1 = input.nextInt();
        System.out.println("please enter your second number : ");
        int num2 = input.nextInt();
        swap(num1,num2);
    }
}
