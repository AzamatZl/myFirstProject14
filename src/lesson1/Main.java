package lesson1;

public class Main {
    public static void main(String[] args) {
       int sum = 1531;
       int toy = 52;
       int gum = 10;
       int candy = 2;

       int toyPay = sum / toy;
       int restAfterToyBy = sum % toy;
       int gumPay = restAfterToyBy / gum;
       int restAfterGumBy = restAfterToyBy % gum;
       int candyPay = restAfterGumBy /candy;
       int restAfterCandyBy = restAfterGumBy % candy;

        System.out.println(toyPay);
        System.out.println(gumPay);
        System.out.println(candyPay);
       System.out.println(restAfterCandyBy);

    }

}
