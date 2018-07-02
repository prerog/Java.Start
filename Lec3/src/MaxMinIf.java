import java.util.Scanner;

public class MaxMinIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое целое число: ");
        int numeric1 = scanner.nextInt();
        System.out.println("Введите второе целое число: ");
        int numeric2 = scanner.nextInt();

        int min;
        int max;
        if (numeric1 < numeric2) {
            min = numeric1;
            max = numeric2;
        } else {
            min = numeric2;
            max = numeric1;
        }
        System.out.println("Наименьшее число: " + min);
        System.out.println("Наибольшее число: " + max);
    }
}
