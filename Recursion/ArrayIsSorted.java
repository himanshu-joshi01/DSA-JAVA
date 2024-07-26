
import java.util.*;

public class ArrayIsSorted {

    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        return (arr[i] > arr[i + 1]) ? false : isSorted(arr, i + 1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");  // Input size of array.
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of array: ");  // Input elements of array.
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(isSorted(arr, 0) ? "Array is sorted" : "Array is not sorted");
    }

}
