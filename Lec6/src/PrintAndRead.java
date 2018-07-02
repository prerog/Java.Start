import java.util.Scanner;

public class PrintAndRead {
    private static int printAndRead(String userLine) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(userLine);
        return scanner.nextInt();
    }

    public static void main(String[] args) {

        int a = printAndRead("Введите число: ");
        System.out.println(a);
    }
}
