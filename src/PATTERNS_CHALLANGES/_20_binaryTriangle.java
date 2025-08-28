package PATTERNS_CHALLANGES;

import java.util.Scanner;

public class _20_binaryTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your number  : ");
        int num = input.nextInt();
        int temp = 0;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                if ( (i+j)%2==0) System.out.print(temp + 1 + " ");
                    else System.out.print(temp + " ");
            }
            System.out.println();
        }
    }
}
