package HomeWork3;

public class PrimeNumber {
    public static int number = 89;

    public static void main(String[] args) {

        if (number <= 1) {

            System.out.println("Число ни простое, ни составное");
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    System.out.println("Число составное");
                    return;
                }
            }
            System.out.println("Число простое");
        }
    }
}