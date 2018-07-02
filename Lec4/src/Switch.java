import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int operand1 = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int operand2 = scanner.nextInt();
        System.out.println("Введите код команды: ");
        int instructionCode = scanner.nextInt();

        switch (instructionCode) {
            case 1:
                System.out.println(operand1 + operand2);
                break;
            case 2:
                System.out.println(operand1 - operand2);
                break;
            case 3:
                System.out.println(operand1 * operand2);
                break;
            case 4:
                System.out.println(operand1 / operand2);
                break;
            default:
                System.out.println("Неизвестная операция");
        }
    }
}
