package Lesson;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class GenerateWordsInLine implements WordsGenerator{
    private List<String> array;
    private final String FILE_NAME_TO_READ;
    private final String FILE_NAME_TO_WRITE;

    public GenerateWordsInLine(String FILE_NAME, String FILE_NAME_TO_WRITE) {
        this.FILE_NAME_TO_READ = FILE_NAME;
        this.FILE_NAME_TO_WRITE = FILE_NAME_TO_WRITE;
    }

    @Override
    public boolean generateWords() {
        array = new ArrayList<>();
        try (BufferedReader in = new BufferedReader(new FileReader(FILE_NAME_TO_READ))){
            while (in.ready()) {
                array.add(in.readLine().trim());
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public List<String> generateLines() throws IOException {
        generateWords();
        List<String> lines = new ArrayList<>();
        try {
            Properties properties = new Properties();
            properties.load(new FileReader("property.properties"));
            final int namesStart = Integer.parseInt(properties.getProperty("namesStart"));
            final int namesEnd = Integer.parseInt(properties.getProperty("namesEnd"));
            final String endChar = properties.getProperty("char");
            final int countLines = Integer.parseInt(properties.getProperty("countLines"));
            for (int i = 0; i < countLines; i++) {
                StringBuilder sb =new StringBuilder();
                int wordCount = namesEnd + 10;
                while (wordCount > namesEnd || wordCount < namesStart) {
                    wordCount = (int) (Math.random() * (namesEnd)) + 1;
                }
                if (wordCount == 4 ){
                    throw new IllegalArgumentException("word lines count is not be 4 words");
                }

                for (int j = 0; j < wordCount; j++) {
                    int randomWord = (int) (Math.random() * array.size());
                    sb.append(array.get(randomWord)).append(" ");
                }
                sb.replace(sb.lastIndexOf(" "), sb.length(), "");
                sb.append(endChar).append("\n");
                lines.add(sb.toString());
            }
            System.out.println("array = " + lines);
        } catch (IOException e) {
            e.printStackTrace();
            throw new IOException("Property's file is not opened");
        }
        return lines;
    }

    public void writeToFile(){
        try (BufferedWriter out = new BufferedWriter(new FileWriter(FILE_NAME_TO_WRITE))){
            List<String> lines = generateLines();
            lines.forEach(line -> {
                try {
                    out.write(line + "\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
