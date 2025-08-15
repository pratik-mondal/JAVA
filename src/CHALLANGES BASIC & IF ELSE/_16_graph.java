package CHALLANGES;

import java.util.Scanner;

public class _16_graph {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE ENTER YOUR  X AXIS VALUE : ");
        double x = input.nextDouble();
        System.out.print("PLEASE ENTER YOUR Y AXISS VALUE : ");
        double y = input.nextDouble();
        if(x==0 && y==0){
            System.out.print("this point is origin");
        }
        else if(x>0 && y==0){
            System.out.print("this point is belong to x axis and 1st quadrent");
        }
        else if(x==0 && y>0){
            System.out.print("this point is belong to y axis and 1st quadrent");
        }
        else if(x<0 && y==0){
            System.out.print("this point is belong to x axis and 2nd quadrent");
        }
        else if(x==0 && y<0){
            System.out.print("this point is belong to y axis and 2nd quadrent");
        }
        else if(x>0 && y>0){
            System.out.print("this point is belong to x,y axis and 1st quadrent");
        }
        else if(x<0 && y<0){
            System.out.print("this point is belong to -x,-y axis and 4th quadrent");
        }
        else if(x>0 && y<0){
            System.out.print("this point is belong to x,-y axis and 2nd quadrent");
        }
        else System.out.print("this point is belong to -x,y axis and 3rd quadrent");
    }
}
