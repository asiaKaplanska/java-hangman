package pl.edu.agh.hangman;

import java.util.Arrays;
import java.util.HashSet;

public class GameEngine {

    private String word;
    private HashSet<String> lettersToGuess;
    private int amountLettersToGuess;
    private final DataLoader dataLoader = new DataLoader;

    void playGame() {
    }

    void setWord() {
        this.word = dataLoader.getWord;
    }

    void setLettersToGuess() {
        var allLetters = word.split("");
        this.lettersToGuess = new HashSet<String>(Arrays.asList(allLetters));
    }

    void setAmountLettersToGuess() {
        this.amountLettersToGuess = lettersToGuess.size();
    }
}
