package CHALLANGES_LOOPS;

import java.util.Scanner;

public class _10_primeNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE ENTER YOUR NUMBER : ");
        int num = input.nextInt();
        int count =0;
        for (int i = 1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count ==1) System.out.println("neither prime or composite");
        else if(count==2) System.out.println("the "+num+" number is prime");
        else  System.out.println("the "+num+"  number is not prime");
    }
}
