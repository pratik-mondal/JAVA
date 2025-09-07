package METHOD;

import java.util.Scanner;

public class _03_ncrNpr {
    public static int fact(int n){
        int fact =1;
          for(int i=1;i<=n;i++){
              fact*=i;
          }
          return fact;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int r = input.nextInt();
        int ncr = fact(n)/(fact(r)*fact(n - r));
        int npr = fact(n)/fact(n-r);
        System.out.println(ncr);
        System.out.println(npr);
    }
}
