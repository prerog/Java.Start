public class Deposit {
    public static void main(String[] args) {
        double startDeposit = 1000;
        double yearPercent = 12;
        final double PERCENT = 0.01;
        final int MONTHS = 12;
        double monthPercent = yearPercent * PERCENT / MONTHS;
        double depositSum = startDeposit;

        int depositPeriod = 10;
        for (int i = 1; i <= depositPeriod; i++) {
            depositSum += depositSum * monthPercent;
        }
        double profit = depositSum - startDeposit;
        System.out.println("Сумма вклада: " + depositSum);
        System.out.println("Прибыль: " + profit);
    }
}