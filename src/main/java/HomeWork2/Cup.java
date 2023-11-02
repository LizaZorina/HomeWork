package HomeWork2;

public class Cup {
    private static final int cup = 200; // объем стакана
    private static final double percentWater = 50.5; // процент наполнения стакана водой
    private static double mlWater = cup * percentWater / 100; // мл воды в стакане

    public static void main(String[] args) {
        System.out.println("Объем стакана " + cup + " мл");
        System.out.println("Процент наполнения стакана водой " + percentWater + "%");
        System.out.println("Количество мл воды в стакане " + mlWater + " мл");
    }
}