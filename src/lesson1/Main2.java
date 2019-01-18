package lesson1;

public class Main2 {
    public static void main(String[] args) {
        int priceTur = 1500;
        int mounths = 5;
        int cash = 200;
        boolean canBy = (mounths * cash) >= priceTur && priceTur < 2000;
        System.out.println(canBy);
    }
}
