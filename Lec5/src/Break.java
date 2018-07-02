import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = "123";

        for (; ; ) {
            System.out.println("Введите строку: ");
            String s1 = scanner.nextLine();
            if (s1.equals(s)) {
                break;
            }
        }
    }
}
