public class Permutation {
    public static void printPermu(String str, String permu){
        if(str.length()==0){
            System.out.println(permu);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char curr=str.charAt(i);
            String newstr=str.substring(0,i)+str.substring(i+1);
            printPermu(newstr, permu+curr);
        }
    }
    public static void main(String[] args) {
        String str="abc";
        printPermu(str, "");
    }
}