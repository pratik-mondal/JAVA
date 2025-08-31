package PATTERNS_CHALLANGES;

import java.util.Scanner;

public class _28_pyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your number : ");
        int num = input.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num+1-i;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
