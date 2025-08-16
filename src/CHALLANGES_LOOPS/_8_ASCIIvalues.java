package CHALLANGES_LOOPS;

import java.util.Scanner;

public class _8_ASCIIvalues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.print("PLEASE ENTER YOUR NUMBER : ");
//        int num = input.nextInt();
        for(int i =1;i<=122;i++){
            System.out.print((char)i);
            System.out.println(" "+i);
        }
    }
}
