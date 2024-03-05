import java.util.*;

public class MaxAndMin {

    public static int max(int arr[]){
        int max=Integer.MIN_VALUE;
       int n=arr.length;
       for(int i=1 ; i<n ; i++){
       max=Math.max(arr[i],max);
    }   
    return max;  
    }


    public static int min(int arr[]){
        int min=Integer.MAX_VALUE;
        int n=arr.length;
        for(int i=1 ; i<n ; i++){
        min=Math.min(arr[i],min);
   
    }
    return min;
    }
    
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements in array;");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int max = max(arr);
        int min = min(arr);
        System.out.println("Max element is " + max + "\nMin element is " + min);
    }
}
