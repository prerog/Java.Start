import java.util.Scanner;

public class MinMaxTernaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое целое число: ");
        int numeric1 = scanner.nextInt();
        System.out.println("Введите второе целое число: ");
        int numeric2 = scanner.nextInt();

        if (numeric1 != numeric2) {
            int min = (numeric1 < numeric2) ? numeric1 : numeric2;
            int max = (numeric1 > numeric2) ? numeric1 : numeric2;
            System.out.println("Наименьшее число: " + min);
            System.out.println("Наибольшее число: " + max);
        }
    }
}
