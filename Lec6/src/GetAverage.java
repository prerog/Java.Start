import java.util.Scanner;

public class GetAverage {
    private static double getAverage(int begin, int end) {
        int sum = 0;
        int count = 0;

        for (int i = begin; i <= end; i++) {
            sum += i;
            ++count;
        }
        return (double) sum / count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int begin = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int end = scanner.nextInt();

        double average = getAverage(begin, end);
        System.out.println("Среднее арифметическое чисел равно: " + average);
    }
}
