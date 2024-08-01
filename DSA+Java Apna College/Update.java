//Write a program to toggle a bit a position = “pos” in a number “n”.
import java.util.*;
public class Update {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number and position: ");
    int n=sc.nextInt();
    int pos=sc.nextInt();
    int bitMask=1<<pos;
    System.out.println("Number after toggling is: "+(bitMask^n));
    sc.close();
 }
}