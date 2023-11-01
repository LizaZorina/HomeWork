package HomeWork2;

public class TravelTime {
    public static void main(String[] args) {

        final int distance = 66; // расстояние от дома до офиса в км.
        final double taxiSpeed = 55.5; // средняя скорость такси
        final double coefficient = 1.25; // коэффициент замедления транспорта вечером
        double timeFromHomeOffice = distance / taxiSpeed; // время от дома до офиса
        double eveningTime = timeFromHomeOffice * coefficient; // время от офиса до дома вечером на такси

        System.out.println("Расстояние от дома до офиса " + distance + " км");
        System.out.println("Средняя скорость такси " + taxiSpeed + " км/ч");
        System.out.println("Время от дома до офиса " + timeFromHomeOffice + " ч");
        System.out.println("Коэффициент замедления транспорта вечером " + coefficient);
        System.out.println("Время от офиса до дома вечером на такси " + eveningTime + " ч");
    }
}