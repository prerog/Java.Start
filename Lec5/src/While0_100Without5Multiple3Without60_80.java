public class While0_100Without5Multiple3Without60_80 {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 100) {
            if (i == 5 || i % 3 == 0 || (i >= 60 && i <= 80)) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
