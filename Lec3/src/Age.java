import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваш возраст: ");
        int age = scanner.nextInt();

        if (age < 1) {
            System.out.println("Вы слишком малы.");
        } else if (age > 112) {
            System.out.println("Вы слишком стары.");
        } else {
            String ageString = "лет";
            if (age / 10 % 10 != 1) {
                if (age % 10 == 1) {
                    ageString = "год";
                } else if (age % 10 == 2 || age % 10 == 3 || age % 10 == 4) {
                    ageString = "года";
                }
            }
            System.out.printf("Вам %d %s.", age, ageString);
        }

    }
}
