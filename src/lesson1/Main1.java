package lesson1;

public class Main1 {


    public static void main(String[] args) {
        double weightRoom = 4.5;
        double lengtsRoom = 3.5;

        double weightTable = 1;
        double lengtsTable = 1.5;

        double squareRoom = weightRoom * lengtsRoom;
        double squareTable = weightTable * lengtsTable;

        int itemTable = (int)(squareRoom / squareTable);
        System.out.println(itemTable);

    }
}




