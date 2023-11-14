package HomeWork5;

import java.util.*;

public class Student implements Comparable <Student> {
    private String name;
    private String surname;
    private String patronymic;
    private List<Integer> score;

    public double averageScore() {
        double totalScore = 0;
        for (int score : getScore()) {
            totalScore += score;
        }
        return totalScore / getScore().size();
    }

    public Student(String surname, String name, String patronymic, List<Integer> score) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.score = score;
    }

    public int compareTo(Student object) {
        if (this.averageScore() > object.averageScore()) return -1;
        if (this.averageScore() < object.averageScore()) return 1;
return 0;
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
}