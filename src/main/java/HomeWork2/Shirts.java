package HomeWork2;

public class Shirts {
    public static void main(String[] args) {
        final int shirtPrice = 1200; // цена рубашки без скидки
        final int numberOfSelectedShirts = 2; // количество уже выбранных рубашек
        final int totalShirts = 5; // количество рубашек, которые надо купить, чтобы получить скидку
        int addShirts = totalShirts - numberOfSelectedShirts; // количество рубашек, которые надо добавить к купленным, чтобы получить скидку
        int priceNumberOfSelectedShirts = numberOfSelectedShirts * shirtPrice; // общая цена уже выбранных рубашек без скидки
        int priceAddShirts = addShirts * shirtPrice; // общая цена рубашек (без скидки), которые надо докупить
        final double discountPercentage = 25.5; // процент скидки
        int allShirtsWithoutDiscount = shirtPrice * totalShirts; // цена всех рубашек без скидки
        double allShirtsAreDiscounted = allShirtsWithoutDiscount * (100 - discountPercentage) / 100; // цена всех рубашек со скидкой
        double oneShirtDiscount = shirtPrice * (100 - discountPercentage) / 100; // цена одной рубашки со скидкой
        double discountAmount = allShirtsWithoutDiscount - allShirtsAreDiscounted; // количество сэкономленных денег, если рубашки куплены со скидкой
        double freebie = discountAmount / shirtPrice; // получено рубашек на халяву

        System.out.println("Цена рубашки без скидки " + shirtPrice + " руб.");
        System.out.println("Количество уже выбранных рубашек " + numberOfSelectedShirts + " штук.");
        System.out.println("Количество рубашек, которые надо купить, чтобы получить скидку " + totalShirts + " штук.");
        System.out.println("Количество рубашек, которые надо добавить к купленным, чтобы получить скидку " + addShirts + " штук.");
        System.out.println("Общая цена уже выбранных рубашек без скидки " + priceNumberOfSelectedShirts + " руб.");
        System.out.println("Общая цена рубашек (без скидки), которые надо докупить " + priceAddShirts + " руб.");
        System.out.println("Процент скидки " + discountPercentage + " %");
        System.out.println("Цена всех рубашек без скидки " + allShirtsWithoutDiscount + " руб.");
        System.out.println("Цена всех рубашек со скидкой " + allShirtsAreDiscounted + " руб.");
        System.out.println("Цена одной рубашки со скидкой " + oneShirtDiscount + " руб.");
        System.out.println("Количество сэкономленных денег, если рубашки куплены со скидкой " + discountAmount + " руб.");
        System.out.println("Получено рубашек на халяву " + freebie + " штук.");
    }
}