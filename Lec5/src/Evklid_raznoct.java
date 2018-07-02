public class Evklid_raznoct {
    public static void main(String[] args) {
        int a = 30;
        int b = 145;

        do {
            if (a > b){
                a = a % b;
            } else {
                b = b % a;
            }
        } while (a != 0 && b != 0);
        System.out.println(a + b);
        System.out.println(System.nanoTime());
    }
}
