import java.util.Scanner;

public class CharacterCounting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String s = scanner.nextLine();

        int lettersCount = 0;
        int digitsCount = 0;
        int whitespacesCount = 0;
        int otherCharsCount = 0;

        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);

            if (Character.isLetter(c)) {
                lettersCount++;
            } else if (Character.isDigit(c)) {
                digitsCount++;
            } else if (Character.isWhitespace(c)) {
                whitespacesCount++;
            } else {
                otherCharsCount++;
            }
        }
        System.out.println("Количество букв в строке: " + lettersCount);
        System.out.println("Количество цифр в строке: " + digitsCount);
        System.out.println("Количество пробелов в строке: " + whitespacesCount);
        System.out.println("Количество остальных символов в строке: " + otherCharsCount);
    }
}
