public class Increasing {
    public static boolean isSorted(int arr[],int idx){
        if(idx==arr.length-1)
        return true;
        if(arr[idx]>=arr[idx+1])
        return false;
        return isSorted(arr,idx+1);
    }
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7,8,9};
       if( isSorted(arr,0))
       System.out.println("Strictly Increasing");
    }
}
