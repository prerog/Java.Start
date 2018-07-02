// Решение квадратного уравнения 4x2+21x+5=0

public class Roots {
    public static void main(String[] args) {
        int a = 4;
        int b = 21;
        int c = 5;
        int discriminant = b * b - 4 * a * c;
        double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
        System.out.println("Корень x1 = " + root1 + System.lineSeparator() + "Корень x2 = " + root2);
    }
}
