package HomeWork3;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            System.out.println("Умножение на " + i);
            int a = 1;
            while (a <= 9) {
                System.out.println(i + " * " + a + " = " + i * a);
                a++;
            }
        }
    }
}