import java.util.Locale;
import java.util.Scanner;

public class ComparisonRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Введите первое вещественное число: ");
        double realNum1 = scanner.nextDouble();
        System.out.println("Введите второе вещественное число: ");
        double realNum2 = scanner.nextDouble();

        double epsilon = 1.0e-10;
        if (Math.abs(realNum1 - realNum2) <= epsilon) {
            System.out.println("Числа примерно равны");
        }
    }
}
