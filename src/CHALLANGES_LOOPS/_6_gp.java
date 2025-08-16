package CHALLANGES_LOOPS;

import java.util.Scanner;

public class _6_gp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE ENTER YOUR NUMBER : ");
        int num = input.nextInt();
        int a = 1 , d = 2;
        System.out.print("AP IS : ");
        for(int i =1;i<=num;i++){
            System.out.print(a+" ");
            a*=d;
        }
    }
}
