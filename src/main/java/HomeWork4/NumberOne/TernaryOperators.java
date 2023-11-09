package HomeWork4.NumberOne;

import java.util.Scanner;

public class TernaryOperators {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();

        String result = (number > 0) ?
                ((number % 7 < 4) ?
                        "positive-m" :
                        "positive-p") :
                ((number == 0) ?
                        "zero" :
                        ((number % 7 > -4) ?
                                "negative-m" :
                                "negative-p"));
        System.out.println(result);
    }
}