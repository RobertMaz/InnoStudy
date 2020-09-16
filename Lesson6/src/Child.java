import java.io.*;

public class Child extends Person implements Externalizable {
    private final int classRoom;

    public Child(String age, int name, boolean bootSize, int classRoom) {
        super(age, name, bootSize);
        this.classRoom = classRoom;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age='" + getAge() + '\'' +
                ", name=" + getName() +
                ", bootSize=" + classRoom +
                '}';
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

    }
}
