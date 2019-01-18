package Lesson6;

public class MatryxUtil {
    public static int[][] fillmatrix(int[][] matrix, int number) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = number;

            }
        }
        return matrix;
    }


    public static void printMatryx(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {

                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();

        }

    }


    public static void PrintMainDiaganal(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j) {
                    System.out.print(matrix[i][j] + " ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }


    public static int getIndexOfMassive(int[][] numbers,int indexRow,int indexCol){
        return numbers [indexRow] [indexCol];

    }


}




