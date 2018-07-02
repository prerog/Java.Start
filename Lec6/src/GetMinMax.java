import java.util.Scanner;

public class GetMinMax {
    private static int getMin(int a, int b) {
        return a < b ? a : b;
    }

    private static int getMax(int a, int b) {
        return a > b ? a : b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int number1 = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int number2 = scanner.nextInt();

        System.out.println("Минимум: " + getMin(number1, number2));
        System.out.println("Максимум: " + getMax(number1, number2));
    }
}
