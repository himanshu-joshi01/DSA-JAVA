import java.util.*;

public class OccurenceNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int key=7;
        int matrix[][] = new int[3][3];
        for(int i=0 ; i<3 ; i++){
            for(int j=0 ; j<3 ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        countOccurence(matrix , key);
    }

    public static void countOccurence(int[][] matrix , int key){
        int count=0;
             for(int i=0 ; i<3 ; i++){
                 for(int j=0 ; j<3 ; j++){
                    if(matrix[i][j] == key){
                        count++;
                    }
                 }
             } 
             System.out.println("Number of occurrences of " + key + " is: " + count);
    }
}
