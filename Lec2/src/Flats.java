import java.util.Scanner;

public class Flats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество подъездов: ");
        int entrancesNumber = scanner.nextInt();
        System.out.println("Введите количество этажей: ");
        int floorsNumber = scanner.nextInt();
        System.out.println("Введите номер квартиры: ");
        int flatNumber = scanner.nextInt();

        int flatsOnFloor = 4;
        int totalFlats = flatsOnFloor * entrancesNumber * floorsNumber;

        if (flatNumber > totalFlats || flatNumber == 0) {
            System.out.println("Нет такой квартиры в этом доме");
        } else {
            int flatsInEntrance = flatsOnFloor * floorsNumber;
            int entranceCalculate = (flatNumber - 1) / flatsInEntrance + 1;
            int floorCalculate = (flatNumber - 1) % flatsInEntrance / flatsOnFloor + 1;
            int flatCalculate = flatNumber % flatsInEntrance % flatsOnFloor;
            System.out.printf("Подъезд %d%nЭтаж %d%n", entranceCalculate, floorCalculate);

            if (flatCalculate == 1) {
                System.out.println("Ближняя слева квартира");
            } else if (flatCalculate == 2) {
                System.out.println("Дальняя слева квартира");
            } else if (flatCalculate == 3) {
                System.out.println("Дальняя справа квартира");
            } else {
                System.out.println("Ближняя справа квартира");
            }
        }
    }
}