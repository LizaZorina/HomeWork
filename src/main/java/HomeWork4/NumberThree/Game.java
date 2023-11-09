package HomeWork4.NumberThree;

import java.util.ArrayList;
import java.util.List;

public class Game {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(8);
        numbers.add(1);
        numbers.add(9);
        numbers.add(0);
        numbers.add(5);
        numbers.add(3);
        System.out.println("Исходный массив " + numbers);
        int result = removeNumber(numbers);
        System.out.println("Остаток от массива " + numbers);
        System.out.println("Количество баллов " + result);
    }

    private static int removeNumber(List<Integer> numbers) {
        int count = 0;

        for (int i = 0; i < numbers.size() - 1; i++) {
            int number1 = numbers.get(i);
            int number2 = numbers.get(i + 1);
            int sum = number1 + number2;

            if (sum == 9 || number1 == number2) {

                numbers.remove(i + 1);
                numbers.remove(i);
                count++;
                i = i - 2;
            }
        }
        return count;
    }

}