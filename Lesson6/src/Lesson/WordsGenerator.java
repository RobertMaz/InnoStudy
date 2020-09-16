package Lesson;

import java.io.IOException;
import java.util.List;

public interface WordsGenerator {
    boolean generateWords();
    List<String> generateLines() throws IOException;

    void writeToFile();
}
