import java.util.Scanner;

public class ArithmeticMean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число");
        int numberStart = scanner.nextInt();
        System.out.println("Введите второе число");
        int numberEnd = scanner.nextInt();

        int sum = 0;
        int totalNumbers = 0;
        int i = numberStart;

        while (i <= numberEnd) {
            sum += i;
            totalNumbers++;
            i++;
        }
        double arithmeticMean = (double) sum / totalNumbers;
        System.out.println("Среднее арифметичекое чисел: " + arithmeticMean);

        int evenSum = 0;
        int evenTotalNumbers = 0;
        int j = numberStart;

        while (j <= numberEnd) {
            if (j % 2 == 0) {
                evenSum += j;
                evenTotalNumbers++;
            }
            j++;
        }
        double arithmeticMeanEven = (double) evenSum / evenTotalNumbers;
        System.out.println("Среднее арифметическое четных чисел: " + arithmeticMeanEven);
    }
}
