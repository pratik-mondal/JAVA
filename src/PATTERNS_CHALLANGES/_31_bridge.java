package PATTERNS_CHALLANGES;

import java.util.Scanner;

public class _31_bridge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your number : ");
        int num = input.nextInt();
        int nsp = 1;
        for(int j=1;j<=2*num-1;j++){
            System.out.print("* ");
        }
        System.out.println();
        for(int i=1;i<=num-1;i++){
            for(int j=1;j<=num-i;j++){
                System.out.print("* ");
            }
            for(int k=1;k<=nsp;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=num-i;j++){
                System.out.print("* ");
            }
            nsp+=2;
            System.out.println();
        }
    }
}
