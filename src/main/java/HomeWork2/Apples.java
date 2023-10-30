package HomeWork2;
//Буратино и яблоки
//Объявить целочисленную переменную, в которой количество яблок у
// Буратино Объявить целочисленную переменную, в которой записано, сколько яблок
// отобрал у него Карабас Барабас.
// Объявить целочисленную переменную, в которой записано, сколько яблок осталось у
// Буратино , после того, как Карабас Барабас отобрал у него яблоки.
public class Apples {
    public static void main(String[] args) {
      final int BURATINO_APPLES = 10;
      final int KARABAS_BARABAS_APPLES = 2;
      int applesLeft = BURATINO_APPLES - KARABAS_BARABAS_APPLES;

        System.out.println("У Буратино было " + BURATINO_APPLES + " яблок.");
        System.out.println("Карабас Барабас украл " + KARABAS_BARABAS_APPLES + " яблока");
        System.out.println("У Буратино осталось " + applesLeft + " яблок");

    }
}
