public class Factorial {
    public static double factorial (double n){
        double result = 1;

        for (double i = 2; i <= n; i++){
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(factorial(89));
    }
}
