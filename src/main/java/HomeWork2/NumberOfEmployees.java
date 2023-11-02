package HomeWork2;

public class NumberOfEmployees {
    public static final int PROGRAMMERS = 10;
    public static final int TESTERS = 2; // колличество тестировщиков на одного программиста
    public static final int SUPPORT_SPECIALITY = 3; // количество специалистов поддержки на одного программиста
    public static int totalTesters = PROGRAMMERS * TESTERS; // общее количество тестировщиков
    public static int totalSupportSpeciality = PROGRAMMERS * SUPPORT_SPECIALITY; // общее количество специалистов поддержки
    public static int totalSpeciality = totalTesters + totalSupportSpeciality + PROGRAMMERS; // общее количество специалистов

    public static void main(String[] args) {
        System.out.println("Количество программистов " + PROGRAMMERS);
        System.out.println("Количество тестировщиков на одного программиста " + TESTERS);
        System.out.println("Количество специалистов поддержки на одного программиста " + SUPPORT_SPECIALITY);
        System.out.println("Общее количество тестировщиков " + totalTesters);
        System.out.println("Общее количество специалистов поддержки " + totalSupportSpeciality);
        System.out.println("Общее количество специалистов " + totalSpeciality);
    }
}