package HomeWork5;

import java.util.*;

public class Student {
    private String name;
    private String surname;
    private String patronymic;
    private static List<Integer> score;

    public Student(String surname, String name, String patronymic, List<Integer> score) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.score = score;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public List<Integer> getScore() {
        return score;
    }

    public void setScore(List<Integer> score) {
        this.score = score;
    }

    public double averageScore() {
        int totalScore = 0;
        for (int score : score) {
            totalScore += score;
        }
        return (double) totalScore / score.size();
    }

    public static void winners(List<Student> students) {

        students.sort(Comparator.comparingDouble(Student::averageScore));
        int numWinners = Math.min(3, students.size());
        for (int i = 0; i < numWinners; i++) {
            System.out.println((i + 1) + " место " + students.get(i).getSurname() + students.get(i).getName() + " " + students.get(i).getPatronymic());
        }
    }

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(" Петров ", " Василий ", " Анатольевич ", Arrays.asList(5, 5, 4)));
        students.add(new Student(" Казанцев ", " Григорий ", " Максимович ", Arrays.asList(4, 4, 3)));
        students.add(new Student(" Исмаилова ", " Любовь ", " Игоревна ", Arrays.asList(3, 3, 2)));
        winners(students);
    }
}