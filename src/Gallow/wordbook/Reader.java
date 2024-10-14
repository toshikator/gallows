package Gallow.wordbook;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Reader {
    private static ArrayList<String> wordsList;

    public static String getWord() {
        String word;
        Random r = new Random();
        if (wordsList == null) {
            readWordbook();
        }
        word = wordsList.get(r.nextInt(wordsList.size()));
        return word;
    }

    public static void readWordbook() {
        wordsList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("./src/Gallow/wordbook/singular.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                wordsList.add(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
