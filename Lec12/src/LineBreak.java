public class LineBreak {
    public static void main(String[] args) {
        String numbersLine = "1, 2, 3, 4, 5";
        String[] numbers = numbersLine.split(", ");

        int[] array = new int[numbers.length];
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            array[i] = Integer.parseInt(numbers[i]);
            sum += array[i];
        }
        System.out.println("Сумма чисел в стоке: " + sum);
    }
}
