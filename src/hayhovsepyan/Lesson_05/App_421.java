package hayhovsepyan.Lesson_05

class MyClass  {
    public static void main(String[ ] args) {
        int [][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int k = 2;
        int count = 0;

        for (int i = 0; i < a.length; i++){
            for (int j = 0; i > j; j++){
                if (a[i][j] % k == 0)

                    count = count + 1;
            }
        }
        System.out.println(count);
    }
}