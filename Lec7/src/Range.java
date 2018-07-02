import java.util.Scanner;

public class Range {
    private double from;
    private double to;

    public Range(double from, double to) {
        this.from = from;
        this.to = to;
    }

    public void setTo(double to) {
        this.to = to;
    }

    public double getTo() {
        return to;
    }

    public void setFrom(double from) {
        this.from = from;
    }

    public double getFrom() {
        return from;
    }

    private double getLength() {
        return to - from;
    }

    private boolean isInside(double number) {
        return number >= from && number <= to;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите начало диапазона: ");
        double from = scanner.nextDouble();
        System.out.println("Введите конец диапазона: ");
        double to = scanner.nextDouble();
        System.out.println("Введите проверяемое число: ");
        double number = scanner.nextDouble();

        Range interval = new Range(from, to);

        interval.setFrom(from);
        interval.setTo(to);

        System.out.println("Числовой интервал: " + interval.getLength());

        if (interval.isInside(number)) {
            System.out.println("Проверяемое число в диапазоне");
        } else {
            System.out.println("Проверяемое число не в диапазоне");
        }
    }
}