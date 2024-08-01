public class Rev {
    public static void printRev(String str, int i) {
        System.out.print(str.charAt(i));
        if(i==0)
        return;
        printRev(str,i-1);
    }
    public static void main(String[] args) {
        String str="abcd";
        printRev(str,str.length()-1);
    }
}
