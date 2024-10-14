package Gallow.cycle;

import java.io.*;
import java.util.regex.Pattern;

public class SymbolTaker {

    public static char readChar() {

        String regEx = "^[а-яА-ЯёЁa-zA-Z]+$";
        Pattern pattern = Pattern.compile(regEx);
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
