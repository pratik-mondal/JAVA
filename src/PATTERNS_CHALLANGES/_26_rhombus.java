package PATTERNS_CHALLANGES;

import java.util.Scanner;

public class _26_rhombus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your number  : ");
        int num = input.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j <= num-i+1;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=num;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
