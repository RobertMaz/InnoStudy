import java.io.Serializable;

final public class Person implements Serializable {
    private final int age;
    final String name;
    protected final Sex sex;
    public double temperature;

    public Person(int age, String name, Sex sex, double temperature) {
        this.age = age;
        this.name = name;
        this.sex = sex;
        this.temperature = temperature;
    }
}
enum Sex{
    MALE,
    SPIDERMAN,
    IRONMAN
}