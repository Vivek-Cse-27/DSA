import java.util.*;
class max{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int max=Math.max(a,b);
        int min=Math.min(a,b);
        System.out.println("The greatest number is: "+max+" and minimum number is: "+min);
        sc.close();
    }
}