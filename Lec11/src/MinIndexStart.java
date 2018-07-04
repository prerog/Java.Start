public class MinIndexStart {
    public static int getMin(int[] a, int startIndex){
        int min = a[startIndex];
        int minIndex = startIndex;
        for (int i = startIndex; i < a.length; i++){
            if (a[i] < min){
                min = a[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void main(String[] args) {
        int[] array = {3, 6, 8, 2, 23, 7, 10};
        System.out.println(getMin(array, 4));
    }
}
