import java.util.Scanner;

public class DigitsNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число");
        int number = scanner.nextInt();

        int digitsSum = 0;
        int oddDigitsSum = 0;
        int maxDigit = 0;

        while (number % 10 != 0) {
            int digit = number % 10;
            digitsSum += digit;

            if (digit % 2 != 0) {
                oddDigitsSum += digit;
            }

            if (maxDigit < digit) {
                maxDigit = digit;
            }
            number = number / 10;
        }
        System.out.println("Сумма цифр числа: " + digitsSum);
        System.out.println("Сумма нечетных цифр числа: " + oddDigitsSum);
        System.out.println("Максимальная цифра числа: " + maxDigit);

    }
}
