import java.util.Scanner;

public class OrderCost {
    private static double calculateDiscount(int quantity1, double cost1, int quantity2, double cost2) {

        double costSum1 = cost1 * quantity1;
        double costSum2 = cost2 * quantity2;

        final int PRICE_CONDITION = 1000;
        double discount1 = 0;
        if (costSum1 + costSum2 >= PRICE_CONDITION) {
            discount1 = 0.05;
        }

        final int QUANTITY_CONDITION = 10;
        double discount2 = 0;
        if (quantity1 + quantity2 >= QUANTITY_CONDITION) {
            discount2 = 0.05;
        }

        double goodsCostSum = costSum1 + costSum2;
        double discountSum = goodsCostSum * (discount1 + discount2);
        return goodsCostSum - discountSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество товара первого типа: ");
        int goodsQuantity1 = scanner.nextInt();
        System.out.println("Введите стоимость товара первого типа: ");
        double goodsCost1 = scanner.nextDouble();
        System.out.println("Введите количество товара второго типа: ");
        int goodsQuantity2 = scanner.nextInt();
        System.out.println("Введите стоимсоть товара второго типа: ");
        double goodsCost2 = scanner.nextDouble();

        System.out.println("К оплате: " + calculateDiscount(goodsQuantity1, goodsCost1, goodsQuantity2, goodsCost2));
    }
}