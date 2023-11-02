package HomeWork2;

public class SarumanLannisters {
    public static final int SOLDERS_LANNISTER = 50; // количество пехотинцев у Ланнистеров
    public static final int SOLDERS_SARUMANA = 70; // количество орков в войске Сарумана
    public static int totalSoldiers = SOLDERS_LANNISTER + SOLDERS_SARUMANA; //общее количество пехоты

    public static void main(String[] args) {
        System.out.println("Количество солдат у Ланнистеров " + SOLDERS_LANNISTER);
        System.out.println("Количество солдат у Сарумана " + SOLDERS_SARUMANA);
        System.out.println("Общее количество солдат " + totalSoldiers);
    }
}