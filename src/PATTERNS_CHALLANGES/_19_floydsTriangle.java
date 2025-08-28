package PATTERNS_CHALLANGES;

import java.util.Scanner;

public class _19_floydsTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your number  : ");
        int num = input.nextInt();
        int temp=1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(temp+" ");
                temp++;
            }
            System.out.println();
        }
    }
}
