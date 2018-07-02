import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputsNumber {

    public static int calculateInputsNumber(String inputLine, String checkLine) {
        String inputStr = inputLine.toLowerCase();
        String checkStr = checkLine.toLowerCase();
        int count = 0;
        int startIndex = inputStr.indexOf(checkStr, 0);

        while (startIndex != -1) {
            count++;
            startIndex += checkStr.length();
            startIndex = inputStr.indexOf(checkStr, startIndex);
        }

        return count;
    }

    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new FileInputStream("input.txt"))) {
            StringBuilder stringBuilder = new StringBuilder();

            while (scanner.hasNextLine()) {
                stringBuilder.append(scanner.nextLine());
                if (scanner.hasNext()) {
                    stringBuilder.append(System.lineSeparator());
                }
            }

            String resultString = stringBuilder.toString();
            System.out.println("Число вхождений проверяемой строки: " + calculateInputsNumber(resultString, "2"));
        }
    }
}