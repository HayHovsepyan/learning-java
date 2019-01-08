package hayhovsepyan.Lesson_05;

public class App_429 {
    public static void main(String[ ] args) {
        int [][] a = {{0, 2, 3},{4, 0, 6}, {7, 8, 9}};
        int count = 0;

        int k = 5;
        for(int i  = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if (i >= j && a[i][j]%k==2 ){
                    count = count + 1;

                }
            }
        }
        System.out.print(count);
    }
}

public class App_430 {
    public static void main(String[ ] args) {
        int [][] a = {{0, 2, 3},{4, 0, 6}, {7, 8, 9}};
        int count = 0;
        int sum = 0;
        int k = 3;
        for(int i  = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if (i >= j && a[i][j]%2==0 ){
                    count = count + 1;
                    sum = sum +a[i][j];

                }
            }
        }
        System.out.print(sum/count);
    }
}