package arsenkarapetyan.lesson_5;

import java.util.Random;

public class App_424 {

    public static void main(String[] args) {

        final int row = 9;
        final int column = 9;
        int sum = 0;
        int count = 0;

        Random num = new Random ();
        int [][] ars = new int [row][column];

        for (int i =0 ; i < row; i++) {
            for (int k = 0; k < column; k++) {

                ars[i][k] = (num.nextInt(90) + 10);
                System.out.print(ars[i][k] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < row; i++){
            for(int k = 0; k <= i; k++) {
                System.out.print(ars[i][k] + "\t");
                if (ars[i][k] % 2 != 0) {
                    sum = sum + ars[i][k];
                    count++;
                }
            }
            System.out.println();
        }
        System.out.println("kent tveri mijin tvabanakan arzheqe havasar e: " + sum/count);
    }
}
