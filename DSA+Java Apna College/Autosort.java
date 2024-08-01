import java.util.*;
class Autosort{
    public static void main(String[] args) {
        int[] arr={90,100,80,60,50,10};
       Arrays.sort(arr);
       System.out.println("The sorted array is: ");
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
        // Time complexity=O(nlog n);
    }
}