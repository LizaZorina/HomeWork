package HomeWork2;

public class Universe {
    public static void main(String[] args) {
        final long universe = 13000000000l; // возраст Вселенной
        final int human = 100000; // возраст человечества
        int universeHuman = (int) (universe / human); // во сколько раз Вселенная старше людей

        System.out.println("Возраст Вселенной " + universe + " лет");
        System.out.println("Возраст человечества " + human + " лет");
        System.out.println("Вселенная старше человечества в " + universeHuman + " раз");
    }
}