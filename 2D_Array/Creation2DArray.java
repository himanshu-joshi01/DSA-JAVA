
import java.util.*;

public class Creation2DArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int matrix[][]= new int[3][3];
        for(int i=0 ; i<3 ; i++){
          for(int j=0 ; j<3 ; j++){
            matrix[i][j] = sc.nextInt();
          }
          
        }
        showMatrix(matrix);
        sc.close();
    }

    public static void showMatrix(int[][] matrix){
        for(int i=0 ; i<3 ; i++){
            for(int j=0 ; j<3 ; j++){
              System.out.print(matrix[i][j] + " ");
            }
            System.out.println();           
          }

    }
}