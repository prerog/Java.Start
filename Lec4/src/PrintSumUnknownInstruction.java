import java.util.Scanner;

public class PrintSumUnknownInstruction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите название команды: ");
        String enteredInstructionName = scanner.nextLine();

        switch (enteredInstructionName) {
            case "print":
                System.out.println("Введите строку: ");
                String userLine = scanner.nextLine();
                System.out.println(userLine);
                break;
            case "sum":
                System.out.println("Введите первое вещественное число: ");
                double numeric1 = scanner.nextDouble();
                System.out.println("Введите второе вещественное число: ");
                double numeric2 = scanner.nextDouble();
                System.out.printf("Сумма чисел равна: %f ", numeric1 + numeric2);
                break;
            default:
                System.out.println("Неизвестная команда");
        }
    }
}
