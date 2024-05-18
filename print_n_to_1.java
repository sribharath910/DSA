package DSA;
import java.util.Scanner;
public class print_n_to_1 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
    System.out.println("Enter the value of n ");
    int n=scn.nextInt();
    for(int i=n;i>0;i--)
        System.out.print(i+" ");
    }
}
