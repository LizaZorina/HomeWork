package HomeWork2;

public class TravelTime {
    public static final int DISTANCE = 66; // расстояние от дома до офиса в км.
    public static final double TAXI_SPEED = 55.5; // средняя скорость такси
    public static final double COEFFICIENT = 1.25; // коэффициент замедления транспорта вечером
    public static double timeFromHomeOffice = DISTANCE / TAXI_SPEED; // время от дома до офиса
    public static double eveningTime = timeFromHomeOffice * COEFFICIENT; // время от офиса до дома вечером на такси

    public static void main(String[] args) {
        System.out.println("Расстояние от дома до офиса " + DISTANCE + " км");
        System.out.println("Средняя скорость такси " + TAXI_SPEED + " км/ч");
        System.out.println("Время от дома до офиса " + timeFromHomeOffice + " ч");
        System.out.println("Коэффициент замедления транспорта вечером " + COEFFICIENT);
        System.out.println("Время от офиса до дома вечером на такси " + eveningTime + " ч");
    }
}