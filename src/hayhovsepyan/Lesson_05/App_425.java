package hayhovsepyan.Lesson_05;

public class App_425 {
    public static void main(String[ ] args) {
        int [][] a = {{1, 2, 3},{4, 5, 6}, {7, 8, 9}};
        int count = 0;
        for(int i  = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if (i > j && a[i][j]%2==0 ){
                    count = count + 1;
                }
            }
        }
        System.out.print(count);
    }
}
