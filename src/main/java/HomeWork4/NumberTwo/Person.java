package HomeWork4.NumberTwo;

public class Person {
    String names;
    int apples;
    

    void displayInfo() {
        System.out.print(names + " хранит " + apples);
        if ((apples >= 11) && (apples <= 20) || (apples % 10 >= 5) || (apples % 10 == 0)) {
            System.out.print(" яблок ");
        } else {
            if (apples % 10 == 1) {
                System.out.println(" яблоко ");
            } else {
                if (apples % 10 <= 4) {
                    System.out.println(" яблока ");
                }
            }
        }
    }
}