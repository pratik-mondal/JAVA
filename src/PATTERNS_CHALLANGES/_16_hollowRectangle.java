package PATTERNS_CHALLANGES;

import java.util.Scanner;

public class _16_hollowRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your row : ");
        int r = input.nextInt();
        System.out.print("please enter your column : ");
        int c = input.nextInt();
        for(int i =1;i<=r;i++){                   // NUMBER OF LINE PRINT USING THIS LOOP
            for (int j =1;j<=c;j++) {
                if (i == 1 || i == r || j == 1 || j == c) System.out.print("* "); // 3 LINES ELSE IF STATEMENT COMPRESS ONE LINE USING OR CONDITION
//                else if (i == r) System.out.print("* ");
//                else if (j == 1) System.out.print("* ");
//                else if (j == c) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();

        }
    }
}
