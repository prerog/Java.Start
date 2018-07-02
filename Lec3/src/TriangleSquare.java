import java.util.Locale;
import java.util.Scanner;

public class TriangleSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Введите x1: ");
        double x1 = scanner.nextDouble();
        System.out.println("Введите y1: ");
        double y1 = scanner.nextDouble();
        System.out.println("Введите x2: ");
        double x2 = scanner.nextDouble();
        System.out.println("Введите y2: ");
        double y2 = scanner.nextDouble();
        System.out.println("Введите x3: ");
        double x3 = scanner.nextDouble();
        System.out.println("Введите y3: ");
        double y3 = scanner.nextDouble();

        double a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double b = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double c = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));

        double p = (a + b + c) / 2;

        double epsilon = 1.0e-10;
        if (Math.abs(p - a) <= epsilon || Math.abs(p - b) <= epsilon || Math.abs(p - c) <= epsilon) {
            System.out.println("Точки лежат на одной прямой.");
        } else {
            double triangleSquare = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.println("Площадь треугольника: " + triangleSquare);
        }
    }
}
