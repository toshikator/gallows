package gallows.cycle;

import java.io.*;
import java.util.regex.Pattern;

public class SymbolTaker {
    private static final String regEx = "^[а-яА-ЯёЁa-zA-Z]$";
    private static final Pattern pattern = Pattern.compile(regEx);
    private static SymbolTaker instance;

    private SymbolTaker() {
    }

    public static SymbolTaker getSymbolTaker() {
        if (instance == null) {
            instance = new SymbolTaker();
        }
        return instance;
    }

    public char readChar() {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputedChar;
        try {
            inputedChar = reader.readLine();
            if (!pattern.matcher(inputedChar).find()) {
                inputedChar = "";
                System.out.println("incorrect input, try again");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if (inputedChar.isEmpty()) {
            System.out.println("Please enter a symbol");
            return readChar();
        }
        return inputedChar.charAt(0);
    }
}
