package ARRAYS;

import java.util.Scanner;

public class _04_maxElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your array size : ");
        int num = input.nextInt();
        System.out.print("please enter your arrays elements : ");
        int[] arr = new int[num];
        for (int i=0;i<num;i++){
            arr[i]= input.nextInt();
        }
        int max= arr[0];
        for (int i=0;i<num;i++){
          if(arr[i]>arr[0]) max =arr[i] ;
        }
        System.out.println("maximum number is : "+max);
    }
}
