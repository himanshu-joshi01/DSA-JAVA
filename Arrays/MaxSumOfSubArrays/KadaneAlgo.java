package MaxSumOfSubArrays;
import java.util.*;
public class KadaneAlgo {
 public static void maxSumSubArray(int arr[]){
    int n=arr.length;
    int currSum=arr[0];
    int maxSum=Integer.MIN_VALUE;
    for(int i=1 ; i<n ; i++)
    {
        currSum+=arr[i];
        if(currSum<0){
        currSum=0;
        }
        maxSum= Math.max(currSum,maxSum);
    }
System.out.println("Max Sum of SubArray: "+maxSum);
 }
 public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no. Of Elements in Array:");
    int n =sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter Elements of array:");
    for(int i=0 ; i<n ; i++)
    {
        arr[i]=sc.nextInt();

    }
    sc.close();
    maxSumSubArray(arr);
 }
}
