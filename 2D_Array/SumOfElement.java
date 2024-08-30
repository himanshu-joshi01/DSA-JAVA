import java.util.*;
public class SumOfElement {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the row u wants sum of" );        
        int row = sc.nextInt();
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
          sum2ndRow(matrix , row);
        }
    public static void sum2ndRow(int[][] matrix , int row){
        int sum=0;
        int cols = matrix[0].length;
          for(int j=0 ; j<cols ; j++){
            sum = sum + matrix[row-1][j];
          }
        System.out.println("Sum of" + row + "nd row is : " + sum ); 
    }
 }

