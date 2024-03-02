import java.util.*;

public class SubArrays {
    public static void subArrays(int arr[]) {
        for(int i=0 ; i<arr.length ; i++){
            System.out.print("["+arr[i]+"]");
            for(int j=i+1 ; j<arr.length ; j++){
                System.out.print("["+arr[i]+","+arr[j]);
            }
            System.out.println();
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
