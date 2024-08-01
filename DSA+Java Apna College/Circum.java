import java.util.*;
public class Circum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float r=sc.nextFloat();
        float cir=(float)(2*3.14*r);
        float area=(float)(3.14*Math.pow(r,2));
        System.out.println("Circumference of Circle: "+cir+"\nArea of Circle: "+area);
        sc.close();
    }
}
