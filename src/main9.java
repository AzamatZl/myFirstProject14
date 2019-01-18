public class main9 {
    public static void main(String[] args) {
        char[] mass = {'a','b','c','d','e'};
        int glass = 0;
        for(int i = 0; i < 5;i++){
            if (mass[i] == 'a' || mass[i] == 'e' || mass[i]== 'r' || mass[i]== 't' || mass[i] == 'y') {
                glass ++;

            }
        }
        System.out.println(glass);

    }
}
