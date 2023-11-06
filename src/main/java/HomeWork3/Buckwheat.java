package HomeWork3;

public class Buckwheat {
    public static int kilogramPerMonth = 6; // 6 кг гречки съедает Василий за месяц
    public static int totalBuckwheat = 100; // запасы кречки в количестве 100 кг
    public static int monthsOfStorage = totalBuckwheat / kilogramPerMonth; // количество месяцев хранения гречки
    public static int storagePrice = 100; // цена хранения 1 кг
    public static int balanceLastMonth = totalBuckwheat - monthsOfStorage * kilogramPerMonth; // вычислили остаток гречки в последний месяц

    public static void main(String[] args) {
        int[] numbers = new int[monthsOfStorage + 1]; // +1 ячейка в массиве, для остатка гречки в последний месяц (balanceLastMonth)
        numbers[0] = balanceLastMonth;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[0] + i * kilogramPerMonth;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] * storagePrice);
        }
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println();
        System.out.println("Итого денег требуется для хранения 100 кг гречки " + sum * storagePrice);
    }
}