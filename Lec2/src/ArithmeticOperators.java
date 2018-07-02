public class ArithmeticOperators {
    public static void main(String[] args) {
        int a = 7;
        int b = 2;
        int c;

        c = a + b;
        System.out.println("Результат работы оператора \"+\": " + c);

        c = a - b;
        System.out.println("Результат работы оператора \"-\": " + c);

        c = a * b;
        System.out.println("Результат работы оператора \"*\": " + c);

        c = a / b;
        System.out.println("Результат работы оператора \"/\": " + c);

        c = a % b;
        System.out.println("Результат работы оператора \"%\": " + c);

        c = a / b;
        System.out.println("Результат целочисленного деления: " + c);

        double d = (double)a / b;
        System.out.println("Результат вещественного деления: " + d);
    }
}
