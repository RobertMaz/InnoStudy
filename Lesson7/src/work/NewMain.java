package work;

import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;
import java.util.Properties;

public class NewMain {
    public static void main(String[] args) {
        Properties properties = new Properties();
        try {
            properties.load(new FileReader("filenames.properties"));
            final String url1 = properties.getProperty("url1");
            System.out.println(url1);
            final String file1 = properties.getProperty("file1");
            System.out.println(file1);
            GenerateLines generateLines = new GenerateLines();
            final List<String> strings = generateLines.generatedLines(file1, 10);
            strings.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
