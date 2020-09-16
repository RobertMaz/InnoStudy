package work;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GenerateLines {



    public List<String> readFile(String fileName){
        List<String> words = new ArrayList<>();
        try(BufferedReader in = new BufferedReader(new FileReader(fileName))) {
            while (in.ready()) {
                words.add(in.readLine().trim());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return words;
    }

    public List<String> generatedLines(String fileName, int count){
        List<String> strings = readFile(fileName);
        List<String> lines = new ArrayList<>();
        int linesCount = count;
        for (int i = 0; i < linesCount; i++) {
            int wordCount = (int)(Math.random() * 10);
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < wordCount; j++) {
                sb.append(strings.get((int)(Math.random() * strings.size()))).append(" ");
            }
            lines.add(sb.toString());
        }
        return lines;
    }
}
