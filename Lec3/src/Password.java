import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите пароль: ");
        String enteredPassword = scanner.nextLine();

        String password = "1234";
        if (password.equals(enteredPassword)) {
            System.out.println("Пароль верный.");
        } else if (enteredPassword.length() > password.length()) {
            System.out.println("Пароль неверный. Строка слишком длинная.");
        } else if (enteredPassword.length() < password.length()) {
            System.out.println("Пароль неверный. Строка слишком короткая.");
        } else {
            System.out.println("Пароль неверный.");
        }
    }
}
