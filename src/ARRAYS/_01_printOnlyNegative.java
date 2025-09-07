package ARRAYS;

import java.util.Scanner;

public class _01_printOnlyNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your array size : ");
        int num = input.nextInt();
        System.out.print("enter your array element : ");
        int[] arr = new int[num];
        // ARRAYS ELEMENTS INPUT
        for(int i =0;i<num;i++){
        arr[i] = input.nextInt();
        }
        // ARRAYS NEGATIVE ELEMENT PRINT
        for(int i =0;i<num;i++){
           if(0>arr[i]) System.out.print(arr[i]+" ");
        }
    }
}
