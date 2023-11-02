package HomeWork2;

public final class NumberOfEmployees {
    private static int programmers = 10;
    private static int testers = 2; // колличество тестировщиков на одного программиста
    private static int supportSpeciality = 3; // количество специалистов поддержки на одного программиста
    private static int totalTesters = programmers * testers; // общее количество тестировщиков
    private static int totalSupportSpeciality = programmers * supportSpeciality; // общее количество специалистов поддержки
    private static int totalSpeciality = totalTesters + totalSupportSpeciality + programmers; // общее количество специалистов

    public static void main(String[] args) {
        System.out.println("Количество программистов " + programmers);
        System.out.println("Количество тестировщиков на одного программиста " + testers);
        System.out.println("Количество специалистов поддержки на одного программиста " + supportSpeciality);
        System.out.println("Общее количество тестировщиков " + totalTesters);
        System.out.println("Общее количество специалистов поддержки " + totalSupportSpeciality);
        System.out.println("Общее количество специалистов " + totalSpeciality);
    }
}