package HomeWork2;

public class Apples {
    private static final int buratinoApples = 10; //количество яблок у Буратино
    private static final int karabasBarabasApples = 2; // отобранные яблоки
    private static int applesLeft = buratinoApples - karabasBarabasApples; // осталось яблок у Буратино

    public static void main(String[] args) {
        System.out.println("У Буратино было " + buratinoApples + " яблок.");
        System.out.println("Карабас Барабас украл " + karabasBarabasApples + " яблока");
        System.out.println("У Буратино осталось " + applesLeft + " яблок");
    }
}