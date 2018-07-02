import java.util.Arrays;

public class ArrayRotation {
    public static int[] rotateArray(int[] inputArray) {
        for (int i = 0; i < inputArray.length / 2; i++) {
            int temp = inputArray[i];
            inputArray[i] = inputArray[inputArray.length - i - 1];
            inputArray[inputArray.length - i - 1] = temp;
        }
        return inputArray;
    }

    public static void main(String[] args) {
        int[] numbersArray = {1, 2, 3, 4, 5, 6, 10};
        System.out.println(Arrays.toString(rotateArray(numbersArray)));
    }
}
