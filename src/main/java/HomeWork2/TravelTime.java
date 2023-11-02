package HomeWork2;

public class TravelTime {
    private static final int distance = 66; // расстояние от дома до офиса в км.
    private static final double taxiSpeed = 55.5; // средняя скорость такси
    private static final double coefficient = 1.25; // коэффициент замедления транспорта вечером
    private static double timeFromHomeOffice = distance / taxiSpeed; // время от дома до офиса
    private static double eveningTime = timeFromHomeOffice * coefficient; // время от офиса до дома вечером на такси

    public static void main(String[] args) {
        System.out.println("Расстояние от дома до офиса " + distance + " км");
        System.out.println("Средняя скорость такси " + taxiSpeed + " км/ч");
        System.out.println("Время от дома до офиса " + timeFromHomeOffice + " ч");
        System.out.println("Коэффициент замедления транспорта вечером " + coefficient);
        System.out.println("Время от офиса до дома вечером на такси " + eveningTime + " ч");
    }
}