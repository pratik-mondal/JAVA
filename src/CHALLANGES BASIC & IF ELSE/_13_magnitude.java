package CHALLANGES;

import java.util.Scanner;

public class _13_magnitude {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE ENTER YOUR NUMBER : ");
        int num = input.nextInt();
        if(num<0){
            num = -(num);
        }
        if(num<69){
            System.out.print("magnitude is smaller then 69");
        }
        else{
            System.out.print("magnitude is not smaller then 69");
        }
    }
}
