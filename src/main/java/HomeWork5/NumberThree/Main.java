package HomeWork5.NumberThree;

import java.util.*;

public class Main {
    public static void winners(List<Student> students) {

        for (int i = 0; i < students.size() && i < 3; i++) {
            Student student = students.get(i);

            System.out.println((i + 1) + " место: " + student.getSurname() + student.getName() + student.getPatronymic());
        }
    }

    public static void main(String[] args) {

        Student student1 = new Student(" Петров ", "Василий ", "Анатольевич ", Arrays.asList(5, 5, 4));
        Student student2 = new Student(" Казанцев ", "Григорий ", "Максимович ", Arrays.asList(3, 3, 2));
        Student student3 = new Student(" Исмаилова ", "Любовь ", "Игоревна ", Arrays.asList(4, 4, 3));
        Student student4 = new Student(" Иванова ", "Екатерина ", "Михайловна ", Arrays.asList(6, 5, 6));

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        Collections.sort(students);

        winners(students);
    }
}