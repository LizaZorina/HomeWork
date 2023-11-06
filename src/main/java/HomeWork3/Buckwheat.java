package HomeWork3;

import java.util.Scanner;

public class Buckwheat {
    public static int kilogramPerMonth = 6;
    public static int totalBuckwheat = 100;
    public static int storagePrice = 100;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Количество месяцев: ");

        int numberOfMonths = scanner.nextInt();

        int[] numbers = new int[numberOfMonths];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = kilogramPerMonth + (kilogramPerMonth * i);
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] * storagePrice);
        }
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println();
        System.out.println("Итого денег требуется для хранения 100 кг гречки " + sum * storagePrice);
    }
}