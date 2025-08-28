package PATTERNS_CHALLANGES;

import java.util.Scanner;

public class _17_starPlus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your number  : ");
        int num = input.nextInt();
        if(num%2==1 && num>1) {
            for (float i = 1; i <= num; i++) {                   // NUMBER OF LINE PRINT USING THIS LOOP
                for (float j = 1; j <= num; j++) {              // NUMBER OF STAR PRINT USING THIS LOOP
                   if (i == (num / 2)+1) System.out.print(" *");
                    else if (j == (num / 2)+1) System.out.print(" *");
                    else  System.out.print("  ");
                }
                System.out.println();
            }
        }
        else System.out.print("please enter odd number &  grater than one, and try again later !");
    }
}
