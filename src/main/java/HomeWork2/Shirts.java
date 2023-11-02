package HomeWork2;

public class Shirts {
    public static final int SHIRT_PRICE = 1200; // цена рубашки без скидки
    public static final int NUMBER_OF_SELECTED_SHIRTS = 2; // количество уже выбранных рубашек
    public static final int TOTAL_SHIRTS = 5; // количество рубашек, которые надо купить, чтобы получить скидку
    public static int addShirts = TOTAL_SHIRTS - NUMBER_OF_SELECTED_SHIRTS; // количество рубашек, которые надо добавить к купленным, чтобы получить скидку
    public static int priceNumberOfSelectedShirts = NUMBER_OF_SELECTED_SHIRTS * SHIRT_PRICE; // общая цена уже выбранных рубашек без скидки
    public static int priceAddShirts = addShirts * SHIRT_PRICE; // общая цена рубашек (без скидки), которые надо докупить
    public static final double DISCOUNT_PERCENTAGE = 25.5; // процент скидки
    public static int allShirtsWithoutDiscount = SHIRT_PRICE * TOTAL_SHIRTS; // цена всех рубашек без скидки
    public static double allShirtsAreDiscounted = allShirtsWithoutDiscount * (100 - DISCOUNT_PERCENTAGE) / 100; // цена всех рубашек со скидкой
    public static double oneShirtDiscount = SHIRT_PRICE * (100 - DISCOUNT_PERCENTAGE) / 100; // цена одной рубашки со скидкой
    public static double discountAmount = allShirtsWithoutDiscount - allShirtsAreDiscounted; // количество сэкономленных денег, если рубашки куплены со скидкой
    public static double freeShirts = discountAmount / SHIRT_PRICE; // получено рубашек на халяву

    public static void main(String[] args) {
        System.out.println("Цена рубашки без скидки " + SHIRT_PRICE + " руб.");
        System.out.println("Количество уже выбранных рубашек " + NUMBER_OF_SELECTED_SHIRTS + " штук.");
        System.out.println("Количество рубашек, которые надо купить, чтобы получить скидку " + TOTAL_SHIRTS + " штук.");
        System.out.println("Количество рубашек, которые надо добавить к купленным, чтобы получить скидку " + addShirts + " штук.");
        System.out.println("Общая цена уже выбранных рубашек без скидки " + priceNumberOfSelectedShirts + " руб.");
        System.out.println("Общая цена рубашек (без скидки), которые надо докупить " + priceAddShirts + " руб.");
        System.out.println("Процент скидки " + DISCOUNT_PERCENTAGE + " %");
        System.out.println("Цена всех рубашек без скидки " + allShirtsWithoutDiscount + " руб.");
        System.out.println("Цена всех рубашек со скидкой " + allShirtsAreDiscounted + " руб.");
        System.out.println("Цена одной рубашки со скидкой " + oneShirtDiscount + " руб.");
        System.out.println("Количество сэкономленных денег, если рубашки куплены со скидкой " + discountAmount + " руб.");
        System.out.println("Получено рубашек на халяву " + freeShirts + " штук.");
    }
}