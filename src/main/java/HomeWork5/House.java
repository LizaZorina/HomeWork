package HomeWork5;

import java.util.*;

public class House {

    public static void main(String[] args) {

        Map<Integer, String> names = new HashMap<>();

        names.put(18, "Казанцева Екатерина Львовна");
        names.put(4, "Конькова Варвара Романовна");
        names.put(88, "Перевощикова Зоя Ивановна");
        names.put(15, "Корепанов Игорь Максимович");
        names.put(25, "Конькова Василиса Владимировна");
        names.put(56, "Стариков Илья Денисович");

        ArrayList<String> adultsResidents = new ArrayList<>();
        for (Map.Entry<Integer, String> entry : names.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            {
                if (key >= 18) {
                    adultsResidents.add(entry.getValue());
                    Collections.sort(adultsResidents);
                }
            }
        }
        System.out.println("Жильцы старше 18 лет " + adultsResidents);
    }
}