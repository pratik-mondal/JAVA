package CHALLANGES_LOOPS;

import java.util.Scanner;

public class _3_tableOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE ENTER YOUR NUMBER : ");
        int num = input.nextInt();
        int res;
        for(int i=1;i<=10;i++){
            res = num*i;
            System.out.println(i+"X"+num+"="+res);
        }
    }
}
