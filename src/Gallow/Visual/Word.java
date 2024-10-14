package Gallow.Visual;

import Gallow.cycle.GameCycle;

import java.util.ArrayList;

public class Word {
    private static ArrayList<Character> characters = new ArrayList<>();
    private static int falseTriesAmount = 0;
    private static String word;

    public static void setWord(String word) {
        Word.word = word;
        characters = new ArrayList<>();
        falseTriesAmount = 0;
    }

    public static void addCharacter(Character character) {
        if (!characters.contains(character)) {

            characters.add(character);
            checkCharacter(character);
            if (isWordComplete()) GameCycle.Win();
        }
    }

    private static boolean isWordComplete() {
        int temp = 0;
        for (char c : word.toCharArray()) {
            temp += characters.contains(c) ? 1 : 0;
        }
        return temp == word.length();
    }

    private static void checkCharacter(Character character) {
        if (!word.contains(character.toString())) {
            Picture.increaseAmountOfElements();
            if (++falseTriesAmount >= 6) {
                Picture.showPicture();
                throw new IndexOutOfBoundsException();
            }
        }
    }

    public static void finalWordShow() {
        System.out.println("The word was = " + Word.word);
    }

    public static void showWord() {
        for (char c : word.toCharArray()) {
            System.out.print(characters.contains(c) ? " " + c : " *");
        }
        System.out.println();
        System.out.println("Amount of tries = " + characters.size() + " Amount of false tries = " + falseTriesAmount);
        System.out.println("symbols" + characters);
    }
}
