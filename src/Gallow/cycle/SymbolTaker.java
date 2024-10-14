package Gallow.cycle;

import java.io.*;

public class SymbolTaker {

    public static char readChar() {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name;
        try {
            name = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if (name.isEmpty()) {
            System.out.println("Please enter a symbol");
            return readChar();
        }
        return name.charAt(0);
    }
}
