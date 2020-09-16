package Lesson;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class CountWordWithFile implements CounterWords {

    @Override
    public Map<String, Integer> countWords(String fileName) {
        Map<String, Integer> wordsCount = new HashMap<>();
        try (BufferedReader in = new BufferedReader(new FileReader(fileName))){
            while (in.ready()){
                String[] word =in.readLine().split(" ");
                for (String s : word) {
                    if (wordsCount.containsKey(s)) {
                        wordsCount.replace(s, wordsCount.get(s) + 1);
                    }
                    else {
                        wordsCount.put(s, 1);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wordsCount;
    }
    @Override
    public void writeToFile(Map<String, Integer> map, String fileName){
        try (BufferedWriter out = new BufferedWriter(new FileWriter(fileName))){
            map.forEach((word, count) ->
            {
                try {
                    out.write(word + "=" + (count  * 100/ map.size()) + "\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
