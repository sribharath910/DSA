package DSA;
import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        int a,b,r;
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter two non negative integers");
        a=scn.nextInt();
        b=scn.nextInt();
        while (b!=0) {
            r=a%b;
            a=b;
            b=r;
        }
        System.out.println("GCD = "+a);

    }
}
