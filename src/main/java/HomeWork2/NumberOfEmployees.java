package HomeWork2;

public final class NumberOfEmployees {
    public static void main(String[] args) {
        int programmers = 10;
        int testers = 2; // колличество тестировщиков на одного программиста
        int supportSpeciality = 3; // количество специалистов поддержки на одного программиста
        int totalTesters = programmers * testers; // общее количество тестировщиков
        int totalSupportSpeciality = programmers * supportSpeciality; // общее количество специалистов поддержки
        int totalSpeciality = totalTesters + totalSupportSpeciality + programmers; // общее количество специалистов

        System.out.println("Количество программистов " + programmers);
        System.out.println("Количество тестировщиков на одного программиста " + testers);
        System.out.println("Количество специалистов поддержки на одного программиста " + supportSpeciality);
        System.out.println("Общее количество тестировщиков " + totalTesters);
        System.out.println("Общее количество специалистов поддержки " + totalSupportSpeciality);
        System.out.println("Общее количество специалистов " + totalSpeciality);
    }
}