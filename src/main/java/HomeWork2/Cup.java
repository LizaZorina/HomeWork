package HomeWork2;

public class Cup {
    public static final int CUP = 200; // объем стакана
    public static final double PERCENT_WATER = 50.5; // процент наполнения стакана водой
    public static double mlWater = CUP * PERCENT_WATER / 100; // мл воды в стакане

    public static void main(String[] args) {
        System.out.println("Объем стакана " + CUP + " мл");
        System.out.println("Процент наполнения стакана водой " + PERCENT_WATER + "%");
        System.out.println("Количество мл воды в стакане " + mlWater + " мл");
    }
}