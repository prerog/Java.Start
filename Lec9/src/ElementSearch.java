public class ElementSearch {
    public static int getElementIndex(int[] array, int number) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbersArray = {3, 234, 11, 8, 33, 97, 123};
        System.out.println(getElementIndex(numbersArray, 11));
    }
}

