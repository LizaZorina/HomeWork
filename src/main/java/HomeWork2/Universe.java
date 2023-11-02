package HomeWork2;

public class Universe {
    private static final long universe = 13000000000l; // возраст Вселенной
    private static final int human = 100000; // возраст человечества
    private static int universeHuman = (int) (universe / human); // во сколько раз Вселенная старше людей
    public static void main(String[] args) {
        System.out.println("Возраст Вселенной " + universe + " лет");
        System.out.println("Возраст человечества " + human + " лет");
        System.out.println("Вселенная старше человечества в " + universeHuman + " раз");
    }
}