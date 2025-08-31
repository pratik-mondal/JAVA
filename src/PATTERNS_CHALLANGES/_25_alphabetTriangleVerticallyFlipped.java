package PATTERNS_CHALLANGES;

import java.util.Scanner;

public class _25_alphabetTriangleVerticallyFlipped {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your number  : ");
        int num = input.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j <= num-i+1;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++){
                System.out.print((char)(64+i)+" ");
            }
            System.out.println();
        }
    }
}
