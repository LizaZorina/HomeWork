package HomeWork3;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println(i + " FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println(i + " buzz");
            } else if (i % 3 == 0) {
                System.out.println(i + " fizz");
            } else System.out.println(i + " ");
        }
    }
}