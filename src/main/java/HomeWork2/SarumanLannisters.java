package HomeWork2;
//Объявить целочисленную переменную, в которой количество пехотинцев у Ланнистеров. Объявить целочисленную переменную,
// в которой количество орков в войске Сарумана. Объявить целочисленную переменную, в которой общее количество пехоты в
// союзе Ланнистеров и Сармана.
public final class SarumanLannisters {
    public static void main(String[] args) {

        int SOLDERS_LANNISTER = 50;
        int SOLDERS_SARUMANA = 70;
        int TOTAL_SOLDIERS = SOLDERS_LANNISTER + SOLDERS_SARUMANA;

        System.out.println("Количество солдат у Ланнистеров " + SOLDERS_LANNISTER);
        System.out.println("Количество солдат у Сарумана " + SOLDERS_SARUMANA);
        System.out.println("Общее количество солдат " + TOTAL_SOLDIERS);
    }

}
