package Lesson;

import java.util.Map;

public interface CounterWords {
    Map<String, Integer> countWords(String fileName);

    void writeToFile(Map<String, Integer> map, String fileName);
}

