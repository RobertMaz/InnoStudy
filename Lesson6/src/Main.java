import java.io.*;
import java.util.Properties;

public class Main {


    public static void main(String[] args) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data.txt"));
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("data.txt"))){
            final Person person = new Child("6", 21, false, 5);
            out.writeObject(person);
            final Object o = in.readObject();
            System.out.println("(Person) = " + (Person)o);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
//try {
//
//            Properties properties = new Properties();
//            properties.setProperty("key", "value");
//            properties.setProperty("size", "32");
//            properties.setProperty("int", String.valueOf(Integer.MAX_VALUE));
//            properties.store(new FileWriter("data.properties"), "comment");
//            properties.load(new FileReader("data.properties"));
//            System.out.println("properties = " + properties);
//        } catch (IOException e) {
//            System.out.println("e = " + e.getMessage());
//            throw new UncheckedIOException("bad file", e);
//        }