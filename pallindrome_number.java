/**
 * pallindrome_number
 */
import java.util.Scanner;
public class pallindrome_number {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num,temp,sum=0,rem;
        System.out.println("Enter the number to check for pallindrome\t");
        num = scn.nextInt();
        temp=num;
        while(num > 0){
            rem = num % 10;
            sum = (sum*10)+ rem;
            num = num / 10;
        }
        if(temp==sum)
            System.out.println(temp+" is a pallindrome");
        else
            System.out.println(temp+" not a pallindrome");
        }  
    }