package HomeWork2;

public class Hypothec {
    public static void main(String[] args) {
        final long apartmentPrice = 3543225l; // стоимость квартиры
        final double downPaymentPercentage = 25.6; // процент первоначального взноса
        double downPaymentAmount = apartmentPrice * downPaymentPercentage / 100; // сумма первоначального взноса

        System.out.println("Стоимость квартиры " + apartmentPrice + " рублей");
        System.out.println("Процент первоначального взноса " + downPaymentPercentage + " %");
        System.out.println("Сумма первоначального взноса " + downPaymentAmount + " рублей");
    }
}