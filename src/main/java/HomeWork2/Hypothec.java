package HomeWork2;

public class Hypothec {
    private static final long apartmentPrice = 3543225l; // стоимость квартиры
    private static final double downPaymentPercentage = 25.6; // процент первоначального взноса
    private static double downPaymentAmount = apartmentPrice * downPaymentPercentage / 100; // сумма первоначального взноса

    public static void main(String[] args) {
        System.out.println("Стоимость квартиры " + apartmentPrice + " рублей");
        System.out.println("Процент первоначального взноса " + downPaymentPercentage + " %");
        System.out.println("Сумма первоначального взноса " + downPaymentAmount + " рублей");
    }
}