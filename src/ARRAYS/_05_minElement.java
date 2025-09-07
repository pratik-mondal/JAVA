package ARRAYS;

import java.util.Scanner;

public class _05_minElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your array size : ");
        int n = input.nextInt();
        System.out.print("please enter your array element : ");
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        int min = arr[0];
        for (int i=0;i<n;i++){
           if(arr[0]>arr[i]) min=arr[i];
        }
        System.out.print(min);
    }
}
