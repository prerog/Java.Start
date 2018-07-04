import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class SortTest {
    //    сортировка вставками
    public static void selectionSort(long[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = minIndex + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            long tmp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = tmp;
        }
    }

    //    сортировка пузырьком
    public static void bubbleSort(long[] array) {
        int i = 0;
        boolean needContinue = true;

        while (needContinue) {
            needContinue = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    long tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    needContinue = true;
                }
            }
            i++;
        }
    }

    //      быстрая сортировка
    public static void quickSort(long[] arr, int left, int right) {
        int i = left;
        int j = right;
        long x = arr[left];

        while (i <= j) {
            while (arr[i] < x) {
                i++;
            }

            while (arr[j] > x) {
                j--;
            }

            if (i <= j) {
                long temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        if (i < right) {
            quickSort(arr, i, right);
        }

        if (left < j) {
            quickSort(arr, left, j);
        }
    }

    //      сортировка вставками
    public static void insertionSort(long[] arr) {
        long tmp;
        int j;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                tmp = arr[i + 1];
                arr[i + 1] = arr[i];
                j = i;
                while (j > 0 && tmp < arr[j - 1]) {
                    arr[j] = arr[j - 1];
                    j--;
                }
                arr[j] = tmp;
            }
        }
    }

    public static void insertionSort2(long[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j;
            long tmp = arr[i];
            for (j = i - 1; j >= 0; j--) {
                if (tmp >= arr[j]) {
                    break;
                } else {
                    arr[j + 1] = arr[j];
                }
            }
            arr[j + 1] = tmp;
        }
    }


    public static void main(String[] args) throws FileNotFoundException {

        //        int[] array = {3, 6, 8, 2, 23, 2, 10};
        //        selectionSort(array);
        //        System.out.println(Arrays.toString(array));

        long startTime = System.currentTimeMillis();

//        чтение из файла
        try (Scanner scanner = new Scanner(new FileInputStream("out.txt"))) {

//              создание массива
            long[] longArray = new long[1000000];

//            запонение массива рандомно
            //                for (int i = 0; i < longArray.length; i++) {
            //                longArray[i] = (long) (Math.random() * 100000000);
            //                System.out.println(longArray[i] + "  ");
            //                writer.println(arr[i] + " ");


//            запонение массива из файла
            int i = 0;
            while (scanner.hasNext()) {
                longArray[i] = scanner.nextLong();
                i++;
            }

            //  сортировка выбором - программа выполнялась 452361 миллисекунд
            //  среднее 458751,6 миллисекунд
//            selectionSort(longArray);

            //  сортировка пузырьком - программа выполнялась 1763389 миллисекунд
            //  среднее
//            bubbleSort(longArray);

            //  быстрая сортировка - программа выполнялась 3198 миллисекунд
            //  среднее 3048,4 миллисекунд
//            quickSort(longArray, 0, longArray.length - 1);

            //  сортировка вставками - программа выполнялась 124018 миллисекунд
            //  среднее 121266,8 миллисекунд
//            insertionSort(longArray);
            insertionSort2(longArray);

            for (long anArr : longArray) {
                System.out.println(anArr + "  ");
            }
        }

        //            selectionSort(arr);
        //            for (long anArr : arr) {
        //                System.out.println(anArr + "  ");
        //            }

        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.println("программа выполнялась " + timeSpent + " миллисекунд");

    }
}
