import java.util.Scanner;

public class InsertionSort {
    {

    }

      public static void print(int arr[]) {
        int n = arr.length;
        System.out.println("The sorted array is: ");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of arrays");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        sort(arr);
        print(arr);
    }

}
    
