//Write a program to count the number of 1’s in a binary representation of the number
import java.util.*;
public class Count {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a number to find number of 1's:");
        int n= ob.nextInt();
        int count=0;
        while(n>0){
            count+=(n&1);
            n=(n>>1);
        }
        System.out.println("The number of 1's are: "+count);
        ob.close();
    }
}
