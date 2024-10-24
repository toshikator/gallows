package gallows.wordbook;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class WordBookReader {
    private static WordBookReader instance;
    private static ArrayList<String> wordsList;

    public WordBookReader() {
        readWordbook();
    }

    public static WordBookReader getInstance() {
        if (instance == null) {
            instance = new WordBookReader();
        }
        return instance;
    }

    public String getRandomWord() {
        String word;
        Random r = new Random();
        if (wordsList == null) {
            readWordbook();
        }
        word = wordsList.get(r.nextInt(wordsList.size()));
        return word;
    }

    public void readWordbook() {
        wordsList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("./resources/singular.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                wordsList.add(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
