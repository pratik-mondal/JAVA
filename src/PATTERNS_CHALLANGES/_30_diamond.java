package PATTERNS_CHALLANGES;

import java.util.Scanner;

public class _30_diamond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your number : ");
        int num = input.nextInt();
        int nsp = num-1;
        int nst =1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=nst;k++){
                System.out.print("* ");
            }
            nsp--;
            nst+=2;
            System.out.println();
        }
         nsp = 1;
         nst =2*num-3;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=nst;k++){
                System.out.print("* ");
            }
            nsp++;
            nst-=2;
            System.out.println();
        }
    }
}

