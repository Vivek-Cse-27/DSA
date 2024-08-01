public class Norep {
    public static boolean[] map = new boolean [26] ;
    public static void removeD(String str,int idx,String newstr){
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }
        char current=str.charAt(idx);
        if(map[current-'a'])
        removeD(str,idx+1,newstr);
        else{
            newstr+=current;
            map[current-'a']=true;
            removeD(str,idx+1,newstr);
        }
    }
    public static void main(String[] args) {
        String str="saraswati";
        removeD(str,0,"");
    }
}
