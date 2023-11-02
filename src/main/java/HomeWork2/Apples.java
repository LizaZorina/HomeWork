package HomeWork2;

public class Apples {
    public static final int BURATINO_APPLES = 10; //количество яблок у Буратино
    public static final int KARABAS_BARABAS_APPLES = 2; // отобранные яблоки
    public static int applesLeft = BURATINO_APPLES - KARABAS_BARABAS_APPLES; // осталось яблок у Буратино

    public static void main(String[] args) {
        System.out.println("У Буратино было " + BURATINO_APPLES + " яблок.");
        System.out.println("Карабас Барабас украл " + KARABAS_BARABAS_APPLES + " яблока");
        System.out.println("У Буратино осталось " + applesLeft + " яблок");
    }
}