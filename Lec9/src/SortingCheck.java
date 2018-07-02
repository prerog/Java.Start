public class SortingCheck {
    public static boolean checkUp(int[] inputArray) {
        for (int i = 0; i < inputArray.length - 1; i++) {
            if (inputArray[i + 1] < inputArray[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkDown(int[] inputArray) {
        for (int i = 0; i < inputArray.length - 1; i++) {
            if (inputArray[i] < inputArray[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arrayUp = {1, 2, 3};
        System.out.println(checkUp(arrayUp));

        int[] arrayDown = {3, 2, 1};
        System.out.println(checkDown(arrayDown));
    }
}
