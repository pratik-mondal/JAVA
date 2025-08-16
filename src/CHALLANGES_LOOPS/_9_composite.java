package CHALLANGES_LOOPS;

import java.util.Scanner;

public class _9_composite {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE ENTER YOUR NUMBER : ");
        int num = input.nextInt();
        for(int i =2;i<=num-1;i++){
            if(num%2==0) System.out.print("this is composite number ");
            break;
        }
    }
}
