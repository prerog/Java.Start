public class TenNumbersInRow {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.printf("%5d", i);
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }
}





