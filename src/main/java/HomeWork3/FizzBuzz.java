package HomeWork3;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i + " fizz");
            }
            if (i % 5 == 0) {
                System.out.println(i + " buzz");
            }
            if (i % 15 == 0) { // одновременно 3 и 5 будут делиться на числа, кратные 15
                System.out.println(i + " FizzBuzz");
            } else System.out.println(i + " ");
        }
    }
}