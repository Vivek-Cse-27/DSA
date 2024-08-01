import java.util.*;
public class Oddsum {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner in = new Scanner (System.in);
        int n=in.nextInt();
        int sum=0;
        for(int i=1;i<=n;i+=2)
        sum+=i;
        System.out.println("The sum of odd numbers up to "+n+" is: "+sum);
        in.close();
    }
}
