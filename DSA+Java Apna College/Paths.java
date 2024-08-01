//number of ways to move (i,j) to (n,m)
class Paths{
    public static int m=3,n=3;
    public static int count(int i, int j){
        if(i==n||j==m)
        return 0;
        if(i==n-1 && j==m-1)
        return 1;
        int downpaths=count(i+1,j);
        int rightpaths=count(i,j+1);
        return downpaths+rightpaths;
    }
    public static void main(String[] args){
        System.out.println("Number of ways to move from (0,0) to (2,2) are "+count(0,0));
    }
}