package HomeWork2;

public class Cup {
    public static void main(String[] args) {
        final int cup = 200; // объем стакана
        final double percentWater = 50.5; // процент наполнения стакана водой
        double mlWater = cup * percentWater / 100; // мл воды в стакане

        System.out.println("Объем стакана " + cup + " мл");
        System.out.println("Процент наполнения стакана водой " + percentWater + "%");
        System.out.println("Количество мл воды в стакане " + mlWater + " мл");
    }
}