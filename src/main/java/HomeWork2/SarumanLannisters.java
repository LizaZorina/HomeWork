package HomeWork2;

public final class SarumanLannisters {
    private static int soldersLannister = 50; // количество пехотинцев у Ланнистеров
    private static int soldersSarumana = 70; // количество орков в войске Сарумана
    private static int totalSoldiers = soldersLannister + soldersSarumana; //общее количество пехоты

    public static void main(String[] args) {
        System.out.println("Количество солдат у Ланнистеров " + soldersLannister);
        System.out.println("Количество солдат у Сарумана " + soldersSarumana);
        System.out.println("Общее количество солдат " + totalSoldiers);
    }
}