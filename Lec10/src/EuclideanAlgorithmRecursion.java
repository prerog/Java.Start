public class EuclideanAlgorithmRecursion {
    static int getEuclidean(int a, int b) {
        if (a % b == 0) {
            return b;
        } else {
            return getEuclidean(b, a % b);
        }
    }

    public static void main(String[] args) {
        int c = getEuclidean(144, 30);
        System.out.println("Наибольший общий делитель: " + c);
    }
}
