public class GetSum {
    private static double getSum(double x, double y) {
        return 3 * x + 4 * y;
    }

    public static void main(String[] args) {
        System.out.println(getSum(2.2, 5.3));
        System.out.println(getSum(0.5, 6));
        System.out.println(getSum(-2.3, -4));
        System.out.println(getSum(5, 3));
    }
}
