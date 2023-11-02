package HomeWork2;

public class Universe {
    public static final long UNIVERSE = 13000000000l; // возраст Вселенной
    public static final int HUMAN = 100000; // возраст человечества
    public static int universeHuman = (int) (UNIVERSE / HUMAN); // во сколько раз Вселенная старше людей
    public static void main(String[] args) {
        System.out.println("Возраст Вселенной " + UNIVERSE + " лет");
        System.out.println("Возраст человечества " + HUMAN + " лет");
        System.out.println("Вселенная старше человечества в " + universeHuman + " раз");
    }
}