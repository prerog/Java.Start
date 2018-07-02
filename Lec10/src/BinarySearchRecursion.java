public class BinarySearchRecursion {
    public static int getResultBinarySearch(int[] a, int left, int right, int x) {
        if (left > right) {
            return -1;
        }

        int middle = (right + left) / 2;
        if (a[middle] == x) {
            return middle;
        }

        if (a[middle] > x) {
            return getResultBinarySearch(a, left, middle - 1, x);
        } else {
            return getResultBinarySearch(a, middle + 1, right, x);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 5, 7, 10, 12};
        int left = 0;
        int right = array.length - 1;
        System.out.println("Индекс искомого элемента: " + getResultBinarySearch(array, left, right, 10));
    }
}

