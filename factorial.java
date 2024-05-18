package DSA;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number to find its factorial");
        int n=scn.nextInt();
        System.out.println("Factorial of "+n+" is "+fact(n));
    }
    public static int fact(int n){
    if (n>=1)
        return n=n*fact(n-1);
    else
        return 1;
}
}
