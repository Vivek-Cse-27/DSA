import java.util.HashSet;
public class Subsequence {
    public static void uniquesubs(String str,int idx,String newstr,HashSet<String> set){
        if(idx==str.length()){
            if(set.contains(newstr))
            return;
            else{
                System.out.println(newstr);
                set.add(newstr);
                return;
            }
        }
        uniquesubs(str,idx+1,newstr+str.charAt(idx),set);
        uniquesubs(str,idx+1,newstr,set);
    }
    public static void subs(String str,int idx,String newstr)
    {
        if(str.length()==idx)
        {
            System.out.println(newstr);
            return;
        }
        subs(str,idx+1,newstr+str.charAt(idx));
        subs(str,idx+1,newstr);
    }
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        String str="aaa";
        subs(str,0,"");
        System.out.println("---------------------------------------------------------------------------------------");
        uniquesubs(str,0,"",set);
    }
}
