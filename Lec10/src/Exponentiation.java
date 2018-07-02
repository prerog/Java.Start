public class Exponentiation {
    public static int getPower(int a, int b) {
        if (b == 0) {
            return 1;
        }

        int multiplicationResult = a;
        for (int i = 1; i < b; i++) {
            multiplicationResult *= a;
        }
        return multiplicationResult;
    }

    public static int getPowerRecursion(int a, int b) {
        if (b == 0) {
            return 1;
        }
        return a * getPowerRecursion(a, b - 1);
    }

    public static void main(String[] args) {
        int c = getPower(2, 4);
        System.out.println(c);

        int d = getPowerRecursion(2, 5);
        System.out.println(d);
    }
}
