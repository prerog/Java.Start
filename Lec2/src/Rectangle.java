import java.util.Locale;
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Введите длину прямоугольника: ");
        double rectangleLength = scanner.nextDouble();
        System.out.println("Введите ширину прямоугольника: ");
        double rectangleWidth = scanner.nextDouble();

        double rectangleSquare = rectangleLength * rectangleWidth;
        double rectanglePerimeter = 2 * (rectangleLength + rectangleWidth);
        System.out.printf("Длина: %f%nШирина: %f%nПлощадь: %f%nПериметр: %f", rectangleLength, rectangleWidth, rectangleSquare, rectanglePerimeter);
    }
}
