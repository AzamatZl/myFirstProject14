package lesso5;

public class MathUtil1 {


    //метод
    public static int summaCisel(int chislo1, int chislo2) {
        int summa = chislo1 + chislo2;
        return summa;


    }
    public static int obshiiZnamenatel(int chislo1, int ObshiiZnamenatel2){
        for(int i  = 1; i <= chislo1*ObshiiZnamenatel2; i++ ){
            if(i % chislo1 == 0 && 1 % ObshiiZnamenatel2 == 0){
                return i;
            }
        }
        return 0;

    }

}
// Паблик єто модификатор доступа
// статичность


//  возвращаемый тип ( если ничего не возвращает VOID)



