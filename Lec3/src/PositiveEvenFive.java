import java.util.Scanner;

public class PositiveEvenFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число: ");
        int numeric = scanner.nextInt();

        if (numeric > 0) {
            System.out.println("Данное число - положительное");
        }

        if (numeric % 2 == 0) {
            System.out.println("Данное число - четное");
        }

        if (numeric % 5 == 0) {
            System.out.println("Данное число - кратно 5");
        }
    }
}
