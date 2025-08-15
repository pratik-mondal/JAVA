package BASICS;

import java.util.Scanner;

public class ternaryVarible {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE ENTER THE NUMBER : ");
        int num = input.nextInt();
        System.out.println((num%2==0 ? "this number is even" : "this number is odd"));  // TERNARY - CONDITION ? TRUE : FALSE
    }
}
