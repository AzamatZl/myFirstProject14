package Lesson6;

public class test {
    public static void main(String[] args) {
        int[][] matrix = new int [4][5];

        int[][] resultFill = MatryxUtil.fillmatrix(matrix,7);
        MatryxUtil.printMatryx(resultFill);
        MatryxUtil.PrintMainDiaganal(resultFill);
      int result = MatryxUtil.getIndexOfMassive(resultFill,1,4);
        System.out.println(result);
    }
}
