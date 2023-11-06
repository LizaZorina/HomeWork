package HomeWork3;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int a = 1; a <= 10; a++) {
                System.out.printf("%5d", +i * a);
            }
            System.out.println("");
        }
    }
}