package HomeWork5;

import java.util.ArrayList;
import java.util.Collections;

public class Lottery {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        for (int i = 0; i < 10; i++) {
            System.out.print(numbers.get(i) + " ");
        }
    }
}