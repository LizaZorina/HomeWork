package HomeWork3;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");

        int number = scanner.nextInt();

        if ((number % 2 == 0) || (number % 3 == 0) || (Math.sqrt(number) * Math.sqrt(number) == number))
        {
            System.out.println("Число составное");
        }
        else
        {
            System.out.println("Число простое");
        }
    }
}