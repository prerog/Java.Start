import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 'a': ");
        double a = scanner.nextInt();
        System.out.println("Введите 'b': ");
        double b = scanner.nextInt();
        System.out.println("Введите 'c': ");
        double c = scanner.nextInt();
        double epsilon = 1.0e-10;

        if (Math.abs(a) <= epsilon) {
            if (Math.abs(b) <= epsilon) {
                if (Math.abs(c) <= epsilon) {
                    System.out.println("Корень - любое число.");
                } else {
                    System.out.println("Если 'a' и 'b' равны 0, то 'c' не может быть отличным от 0.");
                }
            } else {
                double root = -c / b;
                System.out.println("Корень 'x' равен: " + root);
            }
        } else {
            double discriminant = b * b - 4 * a * c;
            if (discriminant < -epsilon) {
                System.out.println("Корней нет.");
            } else if (Math.abs(discriminant) <= epsilon) {
                double root = -b / (2 * a);
                System.out.println("Корень 'x' = " + root);
            } else {
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("Корень 'x1' = " + root1);
                System.out.println("Корень 'x2' = " + root2);
            }
        }
    }
}