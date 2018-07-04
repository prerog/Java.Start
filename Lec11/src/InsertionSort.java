public class InsertionSort {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j;
            int tmp = arr[i];
            for (j = i - 1; j >= 0; j--) {
                if (tmp >= arr[j]) {
                    break;
                } else {
                    arr[j + 1] = arr[j];
                }
            }
            arr[j + 1] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 4, 9, -5, 2, 3, 1};

        insertionSort(array);

        for (int arrayElement : array) {
            System.out.println(arrayElement + "  ");
        }
    }
}