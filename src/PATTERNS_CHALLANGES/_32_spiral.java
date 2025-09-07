package PATTERNS_CHALLANGES;

import java.util.Scanner;

public class _32_spiral {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your number  : ");
        int num = input.nextInt();
        for(int i =1;i<=2*num-1;i++){                   // NUMBER OF LINE PRINT USING THIS LOOP
            for (int j =1;j<=2*num-1;j++){
                int a=i,b=j;
                if (i>num) a=2*num-i;
                if (j>num) b=2*num-j;
                System.out.print(Math.min(a,b)+" ");
            }
            System.out.println();
        }
    }
}
