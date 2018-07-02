import java.util.Scanner;

public class TenNumbersInRowHard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int x = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int y = scanner.nextInt();
        System.out.println("Введите количество чисел в строке: ");
        int n = scanner.nextInt();
        int count = 1;

        for (int i = x; i <= y; i++) {
            System.out.printf("%5d", i);
            if (count % n == 0) {
                System.out.println();
            }
            count++;
        }
    }
}





