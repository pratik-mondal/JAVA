package CHALLANGES_LOOPS;

import java.util.Scanner;

public class _11_countDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE ENTER YOUR NUMBER : ");
        int num = input.nextInt();
        if (num==0) num=1;
        int count=0;
        while (num!=0){
            num/=10;
            count++;
        }
        System.out.println(count);
    }
}
