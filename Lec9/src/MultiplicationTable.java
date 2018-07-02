public class MultiplicationTable {
    public static int[][] calculateMultiplicationTable(int tableSize) {
        int[][] multiplicationTable = new int[tableSize][tableSize];

        for (int i = 0; i < tableSize; i++) {
            for (int j = 0; j < tableSize; j++) {
                multiplicationTable[i][j] = (i + 1) * (j + 1);
            }
        }
        return multiplicationTable;
    }

    public static void main(String[] args) {
        int tableSize = 5;
        int[][] table = calculateMultiplicationTable(tableSize);

        for (int[] firstDimensionElement : table) {
            for (int secondDimensionElement : firstDimensionElement) {
                System.out.printf("%4d", secondDimensionElement);
            }
            System.out.println();
        }
    }
}
