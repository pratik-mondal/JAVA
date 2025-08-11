package CHALLANGES;

import java.util.Scanner;

public class _11_profitLoss {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE ENTER YOUR COSTING PRICE : ");
        int cp = input.nextInt();
        System.out.print("PLEASE ENTER YOUR SELLING PRICE : ");
        int sp = input.nextInt();
        if(sp>cp){
            System.out.print("the product is profitable in "+(sp-cp)+" rupee");
        }
        else if(cp>sp) {
            System.out.print("the product is loss in "+(cp-sp)+" rupee");
        }
        else {
            System.out.print("the product is no loss no profit");
        }
    }
}
