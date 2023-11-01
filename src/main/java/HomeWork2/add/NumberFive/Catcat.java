package HomeWork2.add.NumberFive;

public class Catcat {
    private String name; // вместо pablic должен быть private
    private int age;// вместо pablic должен быть private
    private int weight;// вместо pablic должен быть private

    public Catcat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // нужно добавить public int getWeight и public void setWeight
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.age = weight;
    }
}