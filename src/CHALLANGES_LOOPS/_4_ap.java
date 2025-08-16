package CHALLANGES_LOOPS;

import java.util.Scanner;

public class _4_ap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE ENTER YOUR NUMBER : ");
        int num = input.nextInt();
        int a = 4 , d = 6;
        System.out.print("AP IS : ");
        for(int i =1;i<=num;i++){                       //AP FORMULA : an=a+(n-1)d => 2+(n-1)*3
            System.out.print(a+" ");
            a+=d;
        }
    }
}
