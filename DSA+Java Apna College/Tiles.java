//ways to place Tiles of 1 X m in a floor of size n X m (n=4,m=2)
public class Tiles {
    public static int placeTiles(int n,int m){
        if(n==m)
        return 2;//either horizontal or vertical
        if(n<m)
        return 1;//horizontal only
        int vertical=placeTiles(n-m, m);
        int horizontal=placeTiles(n-1, m);
        return vertical + horizontal;
    }
    public static void main(String[] args){
        int n=4,m=2;
        System.out.println("ways to place Tiles of 1 X (m=2) in a floor of size (n=4,m=2) are: "+placeTiles(n, m));
    }
}
