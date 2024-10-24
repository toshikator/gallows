package gallows.cycle;

import java.util.HashSet;

public class SymbolStorage {

    private final HashSet<Character> symbols = new HashSet<>();

    public SymbolStorage() {

    }

    public void addSymbol(char symbol) {
        symbols.add(symbol);
    }

    public int getAmountUniqueSymbols() {
        return symbols.size();
    }

    public HashSet<Character> getSymbols() {
        return symbols;
    }
}
