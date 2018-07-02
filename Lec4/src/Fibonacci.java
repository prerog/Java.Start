import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое положительное число: ");
        int n = scanner.nextInt();
        int fibonacci0 = 0;
        int fibonacci1 = 1;

        if (n < 0) {
            System.out.println("Введено отрицательное число");
        } else if (n == 0) {
            System.out.println(fibonacci0);
        } else if (n == 1) {
            System.out.println(fibonacci1);
        } else {
            int i = 2;
            int fibonacciSum = 0;
            while (i <= n) {
                fibonacciSum = fibonacci1 + fibonacci0;
                fibonacci0 = fibonacci1;
                fibonacci1 = fibonacciSum;
                i++;
            }
            System.out.println(fibonacciSum);
        }
    }
}
