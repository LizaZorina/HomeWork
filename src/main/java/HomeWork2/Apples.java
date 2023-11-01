package HomeWork2;

public class Apples {
    public static void main(String[] args) {
        final int BURATINO_APPLES = 10; //количество яблок у Буратино
        final int KARABAS_BARABAS_APPLES = 2; // отобранные яблоки
        int applesLeft = BURATINO_APPLES - KARABAS_BARABAS_APPLES; // осталось яблок у Буратино

        System.out.println("У Буратино было " + BURATINO_APPLES + " яблок.");
        System.out.println("Карабас Барабас украл " + KARABAS_BARABAS_APPLES + " яблока");
        System.out.println("У Буратино осталось " + applesLeft + " яблок");
    }
}