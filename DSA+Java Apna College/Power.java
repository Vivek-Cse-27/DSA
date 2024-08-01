//Write a program to find if a number is a power of 2 or not.
import java.util.*;
class Power{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is power of 2: ");
        int n=sc.nextInt();
        if(n>=1&&(n&(n-1))==0)
        System.out.println(n+" is power of 2");
        else
        System.out.println(n+" is not power of 2");
        sc.close();
    }
}