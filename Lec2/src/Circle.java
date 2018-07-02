public class Circle {
    public static void main(String[] args) {
//  пункт 1
        int radiusPreassigned = 5;
        double circleSquareCalculated = Math.PI * Math.pow(radiusPreassigned, 2);
        double circleLengthCalculated = 2 * Math.PI * radiusPreassigned;
        System.out.println("Площадь окружности радиусом 5: " + circleSquareCalculated);
        System.out.println("Длина окружности радиусом 5: " + circleLengthCalculated);

//  пункт 2
        int circleSquarePreassigned = 50;
        double circleRadiusCalculated = Math.sqrt(circleSquarePreassigned / Math.PI);
        System.out.println("Радиус окружности площадью 50: " + circleRadiusCalculated);

//  пункт 3
        double sectorDegree = 30;
        double sectorSquare = (Math.PI * Math.pow(radiusPreassigned, 2) * sectorDegree) / 360;
        System.out.println("Площадь сектора окружности радиусом 5: " + sectorSquare);
    }
}
