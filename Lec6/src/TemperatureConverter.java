import java.util.Scanner;

public class TemperatureConverter {
    private static double convertToKelvin(double celsius) {
        return celsius + 273.15;
    }

    private static double convertToFahrenheit(double celsius) {
        return 9 * celsius / 5 + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите значение температуры по Цельсию: ");
        double celsius = scanner.nextDouble();

        System.out.println("Значение температуры по Кельвину: " + convertToKelvin(celsius));
        System.out.println("Значение температуры по Фаренгейту: " + convertToFahrenheit(celsius));
    }
}
