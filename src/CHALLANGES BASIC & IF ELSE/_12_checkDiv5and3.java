package CHALLANGES;

import java.util.Scanner;

public class _12_checkDiv5and3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE ENTER YOUR NUMBER : ");
        int num = input.nextInt();
        if (num%3==0 && num%5==0) {
            System.out.print("this number is divisible by 3 & 5");
        }
        else if(num%5==0){
            System.out.print("this number is divisible by "+5);
        }
        else if (num%3==0) {
            System.out.print("this number is divisible by "+3);
        }
        else {
            System.out.print("this number is not divisible by 3 & 5");
        }
    }

}
