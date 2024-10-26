package gallows;

import gallows.cycle.GameCycle;
import gallows.cycle.SymbolTaker;
import gallows.wordbook.WordBookReader;

public class MainMenu {
    private static final SymbolTaker symbolTaker = SymbolTaker.getSymbolTaker();
    private static final WordBookReader wordBookReader = WordBookReader.getInstance();

    public static void main(String[] args) {
        wordBookReader.readWordbook();
        do {
            char answer;
            do {
                System.out.println("If you want to start a new game type 'y' ");
                System.out.println("If you want to exit type 'e' ");
                System.out.println("\nKeep in mind ALL the words of this game are in RUSSIAN language only");
                answer = symbolTaker.readChar();
            } while (!isInputCorrect(answer));
            if (answer == 'e') {
                break;
            } else {
                GameCycle gameCycle = new GameCycle();
                gameCycle.runCycle();
            }
        } while (true);
    }

    private static boolean isInputCorrect(char answer) {
        return ((answer == 'y' || answer == 'н' || answer == 'e'));
    }
}