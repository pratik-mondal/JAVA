package ARRAYS;

import java.util.Scanner;

public class _02_SumOfArraysElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your array size : ");
        int num = input.nextInt();
        System.out.print("please enter your arrays element : ");
        int[] arr = new int[num];
        for(int i=0;i<num;i++){
            arr[i]=input.nextInt();
        }
        int sum =0;
        for(int i=0;i<num;i++){
        sum+=arr[i];
        }
        System.out.print("the sum is : "+sum);
    }
}
