import java.util.Scanner;

public class ArithmeticMeanFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число");
        int numberStart = scanner.nextInt();
        System.out.println("Введите второе число");
        int numberEnd = scanner.nextInt();

        int sum = 0;
        int totalNumbers = 0;
        int evenSum = 0;
        int evenTotalNumbers = 0;

        for (int i = numberStart; i <= numberEnd; i++) {
            if (i % 2 == 0) {
                evenSum += i;
                evenTotalNumbers++;
            }
            sum += i;
            totalNumbers++;
        }

        double arithmeticMean = (double) sum / totalNumbers;
        System.out.println("Среднее арифметичекое чисел: " + arithmeticMean);
        double arithmeticMeanEven = (double) evenSum / evenTotalNumbers;
        System.out.println("Среднее арифметическое четных чисел: " + arithmeticMeanEven);
    }

}
