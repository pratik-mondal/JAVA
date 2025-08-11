package CHALLANGES;

import java.util.Scanner;

public class _10_realNumIntOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE ENTER YOUR NUMBER : ");
        double num = input.nextDouble();
        if(num%1==0) System.out.print("THIS NUMBER IS INTEGER ");
        else System.out.println("THIS NUMBER IS NOT INTEGER");
    }
}
