package HomeWork2;

public class Hypothec {
    public static final long APARTMENT_PRICE = 3543225l; // стоимость квартиры
    public static final double DOWN_PAYMENT_PERCENTAGE = 25.6; // процент первоначального взноса
    public static double downPaymentAmount = APARTMENT_PRICE * DOWN_PAYMENT_PERCENTAGE / 100; // сумма первоначального взноса

    public static void main(String[] args) {
        System.out.println("Стоимость квартиры " + APARTMENT_PRICE + " рублей");
        System.out.println("Процент первоначального взноса " + DOWN_PAYMENT_PERCENTAGE + " %");
        System.out.println("Сумма первоначального взноса " + downPaymentAmount + " рублей");
    }
}