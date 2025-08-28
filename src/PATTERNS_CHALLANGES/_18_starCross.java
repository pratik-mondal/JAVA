package PATTERNS_CHALLANGES;

import javax.swing.*;
import java.util.Scanner;

public class _18_starCross {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your number  : ");
        int num = input.nextInt();
        for (int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
            if(i==j) System.out.print("* ");
            else if (i+j==num+1) System.out.print("* ");
            else   System.out.print("  ");
            }
            System.out.println();
        }
    }
}
