import java.util.Arrays;

public class ToUpperCase {
    public static void convertToUpperCase(String[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].toUpperCase();
        }
    }

    public static void main(String[] args) {
        String[] array = {"hello", "world"};
        convertToUpperCase(array);
        System.out.println(Arrays.toString(array));

    }
}
