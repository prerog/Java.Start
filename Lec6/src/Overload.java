public class Overload {
    private static int getTypeSize(byte a) {
        return 1;
    }

    private static int getTypeSize(short a) {
        return 2;
    }

    private static int getTypeSize(int a) {
        return 4;
    }

    private static int getTypeSize(long a) {
        return 8;
    }

    private static int getTypeSize(float a) {
        return 4;
    }

    private static int getTypeSize(double a) {
        return 8;
    }

    public static void main(String[] args) {
        byte aByte = 20;
        System.out.println(getTypeSize(aByte));

        short aShort = 500;
        System.out.println(getTypeSize(aShort));

        int aInt = 1235;
        System.out.println(getTypeSize(aInt));

        long aLong = 3720368547L;
        System.out.println(getTypeSize(aLong));

        float aFloat = 31.24f;
        System.out.println(getTypeSize(aFloat));

        double aDouble = 3.14159;
        System.out.println(getTypeSize(aDouble));

    }
}