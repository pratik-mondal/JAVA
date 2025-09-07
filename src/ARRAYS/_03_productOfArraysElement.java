package ARRAYS;

import java.util.Scanner;

public class _03_productOfArraysElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your array size : ");
        int num = input.nextInt();
        System.out.print("please enter your arrays elements : ");
        int[] arr = new int[num];
        for (int i=0;i<num;i++){
            arr[i]= input.nextInt();
        }
        int product =1;
        for (int i=0;i<num;i++){
            product*=arr[i];
        }
        System.out.print("the product is : "+product);
    }
}
