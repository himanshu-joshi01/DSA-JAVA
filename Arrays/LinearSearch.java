import java.util.*;
public class LinearSearch {
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {        
                return i; // Return the index of the element if it is found in array
            }
        }
        return -1;   // Return -1 if the element is not present in the array
    }
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array:");
        int n = sc.nextInt();
    
        int[] arr = new int[n]; 
            System.out.println("enter elements of array ") ;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }     
        System.out.print("Enter a search element : ");
        int key = sc.nextInt() ;
        sc.close(); 
        
        int index=linearSearch(arr,key);
        if(index==-1)
            System.out.println("Element not found.");   
        else
            System.out.println("Element is present at index "+index+".");    
    }         
}
    //Time complexity : O(N) as we are iterating through each element one by one to find the given element.
    //Space Complexity : O(1) as we are using only a constant amount of space.                      

