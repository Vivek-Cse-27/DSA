public class Combination {
    public static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printcomb(String str, int idx,String comb){
        if(idx==str.length()){
            System.out.println(comb);
            return ;
        }
        char current=str.charAt(idx);
        String mapping=keypad[current-'0'];
        for(int i=0;i<mapping.length();i++){
            printcomb(str,idx+1,comb+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str="66";
        printcomb(str, 0, "");
        // Time Complexity= O(4^n);
        // n= length of string
    }
}
