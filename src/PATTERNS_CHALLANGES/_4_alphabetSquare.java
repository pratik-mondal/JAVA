package PATTERNS_CHALLANGES;

import java.util.Scanner;

public class _4_alphabetSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your number  : ");
        int num = input.nextInt();
        for(int i =1;i<=num;i++){                   // NUMBER OF LINE PRINT USING THIS LOOP
            for (int j =1;j<=num;j++){              // NUMBER OF STAR PRINT USING THIS LOOP
                System.out.print((char)(j+64) +" ");
            }
            System.out.println();
        }
    }
}
