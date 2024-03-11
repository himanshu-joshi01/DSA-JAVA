import java.util.*;

public class BubbleSort {
    public static void sort(int arr[]) {
        int n = arr.length;
        boolean swap;
        for (int i = 0; i < n - 1; i++) {
            swap = false;
            for (int j = 0; j < n-1 -i; j++) {
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if (swap == false)
                break;
        }

    }

    public static void print(int arr[]){
        int n = arr.length;
        System.out.println("The sorted array is: ");

        for (int i=0; i<n; i++){
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
