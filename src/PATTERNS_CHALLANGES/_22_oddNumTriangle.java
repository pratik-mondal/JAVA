package PATTERNS_CHALLANGES;

import java.util.Scanner;

public class _22_oddNumTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your number  : ");
        int num = input.nextInt();
        for (int i=0;i<=num;i++){
            for(int j=0;j<=i;j++){
               if(j%2==0) System.out.print(j);
               else System.out.print("");
            }
            System.out.println();
        }

    }
}
