package CHALLANGES_LOOPS;

import java.util.Scanner;

public class _7_numSeries1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE ENTER YOUR NUMBER : ");
        int num = input.nextInt();                           //SERIES : 1,N,2,N-1,3,N-2....
        for(int i =1;i<=num;i++){
            System.out.println(i);
            System.out.println(num);
            num-=1;
        }
    }
}
