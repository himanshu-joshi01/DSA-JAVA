public class TransposeMatrix {
    public static void main(String[] args){
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
      transposeMatrix(matrix);
    }

    public static void transposeMatrix(int[][] matrix){
          int rows = matrix.length;
          int cols = matrix[0].length;
          int transpose[][] = new int[cols][rows];
          for(int i=0; i<rows; i++){    
            for(int j=0; j<cols; j++){
              transpose[j][i] = matrix[i][j];
            }
        }
        printTransposeMatrix(transpose);
    }

    public static void printTransposeMatrix(int[][] transpose){
        int rows = transpose.length;
        int cols = transpose[0].length;
        for(int i=0; i<rows; i++){    
          for(int j=0; j<cols; j++){
            System.out.print(transpose[i][j] + " ");
          }
          System.out.println();
      }
    }
}
