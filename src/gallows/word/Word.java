package gallows.word;

import java.util.HashSet;

public class Word {

    private static Word instance;
    private String word;

    public Word() {

    }

    public static Word getInstance() {
        if (instance == null) {
            instance = new Word();
        }
        return instance;
    }

    public boolean isWordComplete(HashSet<Character> symbols) {
        boolean flag = true;
        for (char c : word.toCharArray()) {
            flag = flag && symbols.contains(c);
        }
        return flag;
    }

    public StringBuilder getMaskedWord(HashSet<Character> symbols) {
        StringBuilder maskedWord = new StringBuilder(word);
        for (int i = 0; i < word.length(); i++) {
            if (!symbols.contains(word.charAt(i))) {
                maskedWord.replace(i, i + 1, "*");
            }
        }
        return maskedWord;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String randomWord) {
        word = randomWord;
    }
}
