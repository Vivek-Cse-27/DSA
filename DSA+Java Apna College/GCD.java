public class GCD {
    public static void main(String[] args) {
        int a=60,b=20;
        int gd=0;
        for (int i = 1; i<=a&&i<=b; i++) {
            if(a%i==0 && b%i==0)
            gd=i;
        }
        System.out.println("Greatest Common Divisor: "+gd);
    }
}
