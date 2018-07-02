import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new FileInputStream("input.txt"))) {
            String[] stringArray = new String[5];

            int i = 0;
            while (scanner.hasNext()) {
                stringArray[i] = scanner.nextLine();
                i++;
            }

            for (String stringElement : stringArray) {
                System.out.println(stringElement);
            }
        }
    }
}
