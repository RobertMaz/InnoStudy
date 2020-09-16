import java.io.Serializable;

public class Person implements Serializable {
    private final String age;



    @Override
    public String toString() {
        return "Person{" +
                "age='" + age + '\'' +
                ", name=" + name +
                ", bootSize=" + bootSize +
                '}';
    }

    private final int name;

    public String getAge() {
        return age;
    }

    public int getName() {
        return name;
    }

    public boolean isBootSize() {
        return bootSize;
    }

    public Person(String age, int name, boolean bootSize) {
        this.age = age;
        this.name = name;
        this.bootSize = bootSize;
    }

    private final boolean bootSize;
}
