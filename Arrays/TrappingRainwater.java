import java.util.*;

public class TrappingRainwater {
    public static int trappedWater(int bar_height[], int width) {
        int n = bar_height.length;

        int leftMax[] = new int[n];
        leftMax[0] = bar_height[0];

        int rightMax[] = new int[n];
        rightMax[n - 1] = bar_height[n - 1];
       
        int trappedWater = 0;
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], bar_height[i]);
        }

        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], bar_height[i]);
        }

        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += (waterLevel - bar_height[i])*width;
        }
        return trappedWater;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Bars:");
        int n = sc.nextInt();
        int bar_height[] = new int[n];
        System.out.println("Enter Bar width:");
        int width=sc.nextInt();
        System.out.println("Enter the heights of bars:");
        for (int i = 0; i < n; i++) {
            bar_height[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Trapped Water=" + trappedWater(bar_height,width));
    }
}