package MaxSumOfSubArrays;
import java.util.*;

public class PrefixSum {
public static void MaxSubArraySum(int arr[]){
    int n=arr.length;
    int prefix[]=new int[n];
    prefix[0]=arr[0];

    //Calculate prefix array
    for(int i=1; i<n;i++){
        prefix[i]=prefix[i-1]+arr[i];
    }

    int currSum=0;
    int maxSum= Integer.MIN_VALUE;

    for(int i=0 ; i<n ; i++){
        int start=i;
        for(int j=i;j<n;j++){
            int end=j;
            currSum=start==0?prefix[end]:prefix[end]-prefix[start-1];
            if(currSum>maxSum)
            {
                maxSum=currSum;
            }
        }
    }
    
    System.out.println("max  sum of subarray is : "+maxSum);
    

}   

public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter No. of Elements in Array:");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter elements of array:");
    for(int i=0 ; i<n ; i++){
        arr[i]=sc.nextInt();
    }
    sc.close();
    MaxSubArraySum(arr);
}
}
