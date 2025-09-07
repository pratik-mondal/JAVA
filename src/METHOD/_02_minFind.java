package METHOD;

import java.util.Scanner;

public class _02_minFind {
    public static int min(int num1, int num2, int num3){
        return   Math.min(num3,Math.min(num1,num2));

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your number : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        System.out.println(min(num1,num2,num3));
    }
}
