import java.util.*;


public class ThreeSum {
    public static void threeSum(int arr[]){
    int n=arr.length;
    for(int i=0;i<n-2;i++){
       for(int j=i+1 ; j<n-1 ; j++){//If the element is
          for(int k=j+1 ; k<n ; k++){
            if((j != i && k != i && k != j )&&(arr[i]+arr[j]+arr[k]==9)){
                System.out.println("Triplet "+ "{" + arr[i] + " , " + arr[j]  +" , " + arr[k] + "}" );
            }
           }
      }
   }
}

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array: ");
       for(int i=0;i<arr.length;i++){
         arr[i] = sc.nextInt(); 
       }
       sc.close();
       threeSum(arr);
    }
}
