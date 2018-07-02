import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число");
        int numberStart = scanner.nextInt();
        System.out.println("Введите второе число");
        int numberEnd = scanner.nextInt();

        int sum = 0;
        int totalNumbers = 0;
        int i = numberStart;

        do {
            sum += i;
            totalNumbers++;
            i++;
        } while (i <= numberEnd);
        double arithmeticMean = (double) sum / totalNumbers;
        System.out.println("Среднее арифметическое чисел :" + arithmeticMean);

        int evenSum = 0;
        int evenTotalNumbers = 0;
        int j = numberStart;

        do {
            if (j % 2 == 0) {
                evenSum += j;
                evenTotalNumbers++;
            }
            j++;
        } while (j <= numberEnd);
        double arithmeticMeanEven = (double) evenSum / evenTotalNumbers;
        System.out.println("Среднее арифметическое четных чисел: " + arithmeticMeanEven);
    }
}
