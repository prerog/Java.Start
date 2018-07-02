import java.util.Scanner;

public class NextDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите день");
        int day = scanner.nextInt();
        System.out.println("Введите месяц");
        int month = scanner.nextInt();
        System.out.println("Введите год");
        int year = scanner.nextInt();
        int days = 0;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                if (year % 4 == 0 && (year % 400 == 0 || year % 100 != 0)) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
        }

        if (day > days) {
            System.out.println("Неправильная дата");
        } else if (day == days) {
            if (month == 12) {
                month = 1;
                year++;
            } else {
                month++;
            }
            day = 1;
        } else {
            day++;
        }
        System.out.printf("%02d.%02d.%02d", day, month, year);
    }
}
