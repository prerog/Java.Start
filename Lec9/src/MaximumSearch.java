public class MaximumSearch {
    public static double getMaxNumber(double[] array) {
        double max = array[0];
        for (double arrayElement : array) {
            if (arrayElement > max) {
                max = arrayElement;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        double[] arrayRealNumbers = {-4.2, -12, -5, 0, -110.22, 42, -551.41, -22};

        System.out.println("Максимальное число в массиве: " + getMaxNumber(arrayRealNumbers));
    }
}

