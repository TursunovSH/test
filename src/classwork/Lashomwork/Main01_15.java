package classwork.Lashomwork;

import java.util.Random;
import java.util.Scanner;

public class Main01_15 {

    public static String getRandomWord() {
        Random random = new Random();
        String[] words = {" programing", "java", "method", "variable", "integer", " number", " string", " boolean "};
        int index = random.nextInt(words.length);
        return words[index];

    }

    public static void printWord(char[] word, boolean[] guessedLetters) {
        System.out.println(" your word:");
        for (int i = 0; i < word.length; i++) {
            System.out.print((guessedLetters[i] ? word[i] : "-") + " ");

        }
    }


    public static boolean allLettersGuessed(boolean[] guessedLetters) {
        for (int i = 0; i < guessedLetters.length; i++) {
            if (!guessedLetters[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkLetters(char[] word, boolean[] guessedLetters, char Letter) {
        boolean found = false;
        for (int i = 0; i < word.length; i++) {
            if (Letter == word[i]) {
                guessedLetters[i] = true;
                found = true;
            }
        }

        return found;
    }


    public static void main(String[] args) {
        char[] word = getRandomWord().toCharArray();
        boolean[] guessedLetters = new boolean[word.length];
        Scanner scanner = new Scanner(System.in);
        int attempts = 7;


        while (attempts > 0) {
            printWord(word, guessedLetters);
            char letter = scanner.next().toCharArray()[0];
            if (!checkLetters(word, guessedLetters, letter)) {
                attempts--;
            }

            if (allLettersGuessed(guessedLetters)) {
                System.out.println(" Congratulations! You guessed the word:");
                System.out.println(word);
                return;
            }
        }
        System.out.println("too bad, you Lost! Word was:");
        System.out.println(word);
    }
}