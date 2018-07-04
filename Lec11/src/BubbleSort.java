import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] array) {
        int i = 0;
        boolean needContinue = true;

        while (needContinue) {
            needContinue = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    needContinue = true;
                }
            }
            i++;
        }
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 4, 8, 23, 8, 5, 32, 1, 55, 0, -2};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
