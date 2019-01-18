public class main6 {
    public static void main(String[] args) throws Exception{

        for(int day = 1; day < 366;day ++){

            for(int hours = 0; hours < 24; hours++ ) {
                for (int minutes = 0; minutes < 60; minutes++){
                    for(int second = 0; second < 60; second ++){
                        System.out.println("От старта прошло" + day + " дней, " + hours + "часов, " + minutes + "минут, " + second + "секунд, ");

                            Thread.sleep(1000);

                        }
                    }
                }
            }

    }
}
