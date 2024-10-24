package gallows.cycle;

import gallows.visual.Picture;
import gallows.word.Word;
import gallows.wordbook.WordBookReader;

import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;

public class GameCycle {
    private static final int limitAmountOfFalseTries = 6;
    private static final WordBookReader wordBookReader = WordBookReader.getInstance();
    private final SymbolTaker symbolTaker;
    private final Word word;
    private final SymbolStorage symbolStorage;
    Picture picture;
    private int amountOfFalseTries = 0;
    private boolean isLoose = false;
    private boolean isWin = false;

    public GameCycle() {
        word = Word.getInstance();
        symbolStorage = new SymbolStorage();
        picture = Picture.getPicture();
        symbolTaker = SymbolTaker.getSymbolTaker();
    }

    private void win() {
        isWin = true;
    }

    private void loose() {
        isLoose = true;
    }

    public void runCycle() {

        word.setWord(wordBookReader.getRandomWord());

        while (!isWin && !isLoose) {
            picture.setAmountOfElements(amountOfFalseTries);
            System.out.println("************************************************");
            System.out.println("\n you have amount tries  = " + (6 - amountOfFalseTries));
            picture.showPicture();
            System.out.println(word.getMaskedWord(symbolStorage.getSymbols()));
            System.out.println("Input one symbol on this game step");
            symbolStorage.addSymbol(symbolTaker.readChar());
            arrangeStats(word.getWord(), symbolStorage.getSymbols());
            if (amountOfFalseTries >= limitAmountOfFalseTries) {
                System.out.println("Unluckily you loose. Let's think about how to commit a suicide");
                loose();
            }
            if (word.isWordComplete(symbolStorage.getSymbols())) {
                System.out.println("You are smart enough, you've won");
                win();
            }
        }
        System.out.println("the word was = " + word.getWord());
    }

    private void arrangeStats(String word, HashSet<Character> symbols) {
        AtomicInteger temp = new AtomicInteger();
        symbols.stream().forEach(symbol -> {
            if (!word.contains(symbol.toString())) {
                temp.getAndIncrement();
            }
        });
        amountOfFalseTries = temp.intValue();
    }
}

