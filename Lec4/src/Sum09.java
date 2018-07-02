public class Sum09 {
    public static void main(String[] args) {
        int i09 = 0;
        int sum09 = 0;
        while (i09 <= 9) {
            sum09 += i09;
            ++i09;
        }

        System.out.println("Сумма чисел от 0 до 9: " + sum09);

        int i321 = 3;
        int sum321 = 0;
        int evenSum321 = 0;
        int countEvenNumbers = 0;
        while (i321 <= 21) {
            evenSum321 += i321;
            if (i321 % 2 == 0) {
                sum321 += i321;
                ++countEvenNumbers;
            }
            ++i321;
        }
        System.out.println("Сумма чисел от 3 до 21: " + sum321);
        System.out.println("Сумма четных чисел от 3 до 21: " + evenSum321);
        System.out.println("Количество четных чисел от 3 до 21: " + countEvenNumbers);
    }
}
