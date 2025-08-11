package CHALLANGES;

import java.util.Scanner;

public class _7_evenOddCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE ENTER YOUR NUMBER : ");
        int num = input.nextInt();
        if(num%2==0){
            System.out.print("this number is even : "+num);
        }
        else{
            System.out.print("this number is odd : "+num);
        }
    }
}
