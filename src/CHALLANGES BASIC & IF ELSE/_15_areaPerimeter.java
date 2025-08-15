package CHALLANGES;

import java.util.Scanner;

public class _15_areaPerimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE ENTER YOUR LENGTH NUMBER : ");
        double l = input.nextDouble();
        System.out.print("PLEASE ENTER YOUR BREADTH  NUMBER : ");
        double b = input.nextDouble();
        double area = l*b;
        double perimeter = 2*(l+b);
        if(area<perimeter){
            System.out.print("perimeter is greater then area");
        }
        else{
            System.out.print("area is greater then perimeter");
        }
    }
}
