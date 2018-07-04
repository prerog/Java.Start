import java.util.Arrays;

public class HeapSort {
    public static void heapSort(int[] array) {
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            toHeap(array, i, array.length);
        }

        for (int i = array.length - 1; i > 0; i--) {
            int tmp = array[i];
            array[i] = array[0];
            array[0] = tmp;

            toHeap(array, 0, i);
        }
    }

    public static void toHeap(int[] array, int i, int j) {
        int tmp = array[i];

        while (true) {
            int firstChildIndex = 2 * i + 1;
            int secondChildIndex = 2 * i + 2;
            int maxChildIndex = firstChildIndex;

            if (secondChildIndex < j) {
                maxChildIndex = array[firstChildIndex] > array[secondChildIndex] ? firstChildIndex : secondChildIndex;
            } else if (firstChildIndex >= j) {
                break;
            }

            if (array[maxChildIndex] > array[i]) {
                array[i] = array[maxChildIndex];
                array[maxChildIndex] = tmp;
                i = maxChildIndex;
            } else {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {3, 6, 8, 2, 23, 2, 10};
        heapSort(array);
        System.out.println(Arrays.toString(array));
    }
}
