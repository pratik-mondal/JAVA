package CHALLANGES;

import java.util.Scanner;

public class _8_divisibleCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE ENTER YOUR NUMBER : ");
        int num = input.nextInt();
        if(num%5==0){
            System.out.print("this number is divisible by five : "+num);
        }
        else{
            System.out.print("this number is not divisible by five : "+num);
        }
    }
}
