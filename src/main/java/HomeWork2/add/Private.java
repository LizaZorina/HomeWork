package HomeWork2.add;

public class Private {
    private int age = 2;

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }
}