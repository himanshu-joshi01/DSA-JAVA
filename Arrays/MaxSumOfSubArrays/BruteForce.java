package MaxSumOfSubArrays;
import java.util.*;
public class BruteForce {
    public static void subArrays(int arr[]) {
        for(int i=0 ; i<arr.length ; i++){
            for(int j=i ; j<arr.length ; j++){
                System.out.print("[ ");
                for(int k=i;k<=j;k++){
                System.out.print(arr[k]+ " ");
            }
            System.out.print("]");
            System.out.println();
        }

    }
}

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. of Elements in Arrays:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Elements of arrays:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        subArrays(arr);
    }
}

// This is a brute force approach to find the maximum sum of any subarray in an array.  
// It works by considering all possible subarrays and calculating their sums, then keeping track 
// of the largest sum found so far. The time complexity of this method is O(n^3), which makes it  
// impractical for large arrays. However, it can be used as a baseline to compare against more efficient algorithms.
