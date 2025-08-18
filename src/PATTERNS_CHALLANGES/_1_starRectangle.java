package PATTERNS_CHALLANGES;

import java.util.Scanner;

public class _1_starRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your row : ");
        int r = input.nextInt();
        System.out.print("please enter your column : ");
        int c = input.nextInt();
        for(int i =1;i<=r;i++){                   // NUMBER OF LINE PRINT USING THIS LOOP
            for (int j =1;j<=c;j++){              // NUMBER OF STAR PRINT USING THIS LOOP
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
