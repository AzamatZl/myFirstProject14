public class Main5 {
    public static void main(String[] args) {
        int [] massive = new int[7];
        int index = 0;
        int value = 7;
        for(int i = 0;i < 7; i++) {
            massive[index] = value;
            index++;
            value--;
        }
        for (int i = 0; i < 7; i++){
            System.out.println(massive[i]);
        }

        massive [0] = 6;
        massive [1] = 5;
        massive [2] = 4;
        massive [3] = 3;
        massive [4] = 2;
        massive [5] = 1;


    }
}
