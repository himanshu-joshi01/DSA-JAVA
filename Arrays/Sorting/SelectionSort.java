import java.util.*;

public class SelectionSort {
    public static void sort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
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
