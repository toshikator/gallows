package Gallow;

import Gallow.cycle.GameCycle;
import Gallow.cycle.SymbolTaker;
import Gallow.wordbook.Reader;

public class MainMenu {
    public static void main(String[] args) {
        do {
            Reader.readWordbook();
            char answer;
            do {
                System.out.println("If you want to start a new game type 'y' ");
                System.out.println("If you want to exit type 'e' ");
                answer = SymbolTaker.readChar();
            } while (!(answer == 'y' || answer == 'н' || answer == 'ט' || answer == 'e'));
            if (answer == 'e') {

                break;
            } else {
                GameCycle.runCycle();
            }
        } while (true);
    }
}