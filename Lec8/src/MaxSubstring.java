import java.util.Scanner;

public class MaxSubstring {

    public static int calculateSubstringLength(String userLine) {
        if (userLine.isEmpty()) {
            return 0;
        }

        String s = userLine.toLowerCase();

        int substringCount = 0;
        int substringLength = 1;

        for (int i = 0; i < s.length(); ++i) {
            for (int j = i; j < s.length(); ++j) {
                char currentCharacter = s.charAt(i);
                char nextCharacter = s.charAt(j);

                if (currentCharacter == nextCharacter) {
                    substringCount++;
                } else {
                    break;
                }
            }

            if (substringCount > substringLength) {
                substringLength = substringCount;
            }
            substringCount = 0;
        }
        return substringLength;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку: ");
        String userLine = scanner.nextLine();
        int substringLength = calculateSubstringLength(userLine);

        if (substringLength == 0) {
            System.out.println("Ничего не найдено");
        } else {
            System.out.println("Длина максимальной подстроки: " + substringLength);
        }
    }
}


