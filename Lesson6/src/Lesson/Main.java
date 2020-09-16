package Lesson;

import java.io.IOException;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        WordsGenerator generateWordsInLine = new GenerateWordsInLine("words.txt", "data.txt");
        try {
            generateWordsInLine.generateLines();
            generateWordsInLine.writeToFile();
            CounterWords counterWords = new CountWordWithFile();
            Map<String, Integer> words = counterWords.countWords("data.txt");

            counterWords.writeToFile(words, "newData.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
