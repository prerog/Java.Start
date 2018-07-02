import java.util.Scanner;

public class ChainIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число: ");
        int numeric = scanner.nextInt();

        if (numeric > 0) {
            System.out.println("Данное число положительное");
        } else if (numeric == 0) {
            System.out.println("Данное число равно 0");
        } else {
            System.out.println("Данное число отрицательное");
        }
    }
}
