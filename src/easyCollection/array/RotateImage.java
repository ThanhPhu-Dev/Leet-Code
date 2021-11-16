package easyCollection.array;

import java.util.Arrays;

public class RotateImage {
    public static void rotate(int[][] matrix) {
        for(int i =0;i < matrix.length;i++){
            for(int j =0;j < matrix[0].length &&j != i ;j++){
                int temp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
        int i = 0;
        int j = matrix[0].length-1;
        while(i <j){
            for(int k =0;k < matrix[0].length;k++){
                int temp = matrix[k][i];
                matrix[k][i] = matrix[k][j];
                matrix[k][j] = temp;

            }
            i++;
            j--;
        }

    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(matrix);

    }
}
