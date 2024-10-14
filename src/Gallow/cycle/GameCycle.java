package Gallow.cycle;

import Gallow.Visual.Picture;
import Gallow.Visual.Word;
import Gallow.wordbook.Reader;

public class GameCycle {
    private static boolean isWin = false;

    public static void Win() {
        isWin = true;
    }

    public static void runCycle() {
        Word.setWord(Reader.getWord());
        Picture.resetAmountOfElements();
        while (!isWin) {
            Picture.showPicture();
            Word.showWord();
            System.out.println("Input one symbol on this game step");

            try {
                Word.addCharacter(SymbolTaker.readChar());
            } catch (IndexOutOfBoundsException e) {
//                Picture.showPicture();
                Word.finalWordShow();
                System.out.println("Unluckily you loose. Let's think about how to commit a suicide");
                break;
            }
            Word.showWord();
        }
        if (isWin) {
            System.out.println("You win, congratulations!");
        }
        isWin = false;
    }
}
