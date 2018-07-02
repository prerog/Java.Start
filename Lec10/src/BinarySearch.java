public class BinarySearch {
    public static int getResultBinarySearch(int[] a, int x) {
        int left = 0;
        int right = a.length - 1;

        for (; ; ) {
            if (left > right) {
                return -1;
            }

            int middle = (left + right) / 2;
            if (a[middle] == x) {
                return middle;
            }

            if (a[middle] > x) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 5, 7, 10, 12};
        System.out.println("Индекс искомого элемента: " + getResultBinarySearch(array, 3));
    }
}

