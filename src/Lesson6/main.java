package Lesson6;

public class main {
    public static void main(String[] args) {
        int[][] massive = {{1, 2, 7}, {5, 3, 2}, {2, 1, 3}};
        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive.length; j++) {
                if (i == j) {
                    System.out.print(massive[i][j] + " ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
