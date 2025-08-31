package PATTERNS_CHALLANGES;

import java.util.Scanner;

public class _27_doubleFlippedTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your number  : ");
        int num = input.nextInt();
        int i=1,j=1,k=1;
        for( i=1;i<=num;i++){
            for( j=1;j <=i;j++){
                System.out.print("  ");
            }
            for( k=1;k<=num+1-i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
