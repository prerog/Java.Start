public class Average {
    public static double getAverage(int[] array) {
        int sum = 0;
        int evenCount = 0;
        for (int arrayElement : array) {
            if (arrayElement % 2 == 0) {
                sum += arrayElement;
                evenCount++;
            }
        }
        return (double) sum / evenCount;
    }

    public static void main(String[] args) {
        int[] numbersArray = {2, 2, 2, 4, 5};
        System.out.println("Среднее арифметическое четных элементов: " + getAverage(numbersArray));
    }
}


