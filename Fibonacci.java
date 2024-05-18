package DSA;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the number to find Fibonacci");
        int n=scn.nextInt();
        fibonacci(n);
    }

    static void fibonacci(int n){
        int num1=0,num2=1,num3;
        for(int i=0;i<n;i++){
            System.out.println(num1+" ");
            num3=num1+num2;
            num1=num2;
            num2=num3;
        }
    }
}
