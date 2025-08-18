package PATTERNS_CHALLANGES;

import java.util.Scanner;

public class _15_alphabetHorizontallyFlipped {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your number  : ");
        int num = input.nextInt();
        for (int i = 1; i <= num; i++) {                   // NUMBER OF LINE PRINT USING THIS LOOP
            for (int j = 1; j <= num+1-i; j++) {              // NUMBER OF STAR PRINT USING THIS LOOP
                System.out.print((char)(j+96)+" ");
            }
            System.out.println();
        }
    }
}
