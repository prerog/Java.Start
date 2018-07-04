public class QuickSort {
    public static void quickSort(int[] arr, int left, int right) {
        int i = left;
        int j = right;
        int x = arr[left];

        while (i <= j) {
            while (arr[i] < x) {
                i++;
            }

            while (arr[j] > x) {
                j--;
            }

            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        if (i < right) {
            quickSort(arr, i, right);
        }

        if (left < j) {
            quickSort(arr, left, j);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 4, 9, -5, 2, 3, 1};
        int left = 0;
        int right = array.length - 1;

        quickSort(array, left, right);

        for (int arrayElement : array) {
            System.out.println(arrayElement + "  ");
        }
    }
}
