package Lesson8;

public class main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < 100000; i ++){
            System.out.println(i);


        }
        long endTime = System.currentTimeMillis();
        System.out.println("   Время выполнения    " + (endTime - startTime));







    }



}
