public class EuclideanAlgorithm {
    public static void main(String[] args) {
        int a = 145;
        int b = 30;

        while (b != 0) {
            int c = a % b;
            a = b;
            b = c;
        }
        System.out.println("Наибольший общий делитель: " + a);
    }
}
