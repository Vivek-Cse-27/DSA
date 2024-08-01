public class Xend {
    public static int count=0;
    public static void moveX(String str, int idx,String newstr){
        if(idx==str.length())
        {
            for(int i=0;i<count;i++)
            newstr+="x";
            System.out.println(newstr);
            return;
        }
        if(str.charAt(idx)=='x') 
        count++;
        else
        newstr+=str.charAt(idx);
        moveX(str,idx+1,newstr);
       
    }
    public static void main(String args[]){
        String str="abraxkaxdabraxxx";
        String res="";
        moveX(str,0,res);
    }
}
