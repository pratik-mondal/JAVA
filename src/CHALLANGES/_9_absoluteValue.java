package CHALLANGES;

import java.util.Scanner;

public class _9_absoluteValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE ENTER YOUR NUMBER : ");
        int num = input.nextInt();
        if(num>=0){
            System.out.print("THE ABSOLUTE VALUE OF THAT INTEGER IS : "+num);
        }
        else{
            num = -(num);
            System.out.print("THE ABSOLUTE VALUE OF THAT INTEGER IS : "+num);
        }
    }
}
