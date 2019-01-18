public class main3 {
    public static void main(String[] args) {
        int cash = 10000;
        int procent = 9;
        int years = 7;

        for (int i = 0; i < years; i++) {
            cash = cash + (cash / 100 * procent);

        }
        System.out.println(cash);
    }
}
