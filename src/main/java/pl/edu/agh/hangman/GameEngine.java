package pl.edu.agh.hangman;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class GameEngine {

    private String word;    //word
    private String[] wordLetters;          //word divided for letters
    private HashSet<String> lettersToGuess;   // collection of unique letters
    private int amountLettersToGuess;    // winning factor
    private int failures;     // amount of failures
    private final DataLoader dataLoader = new DataLoader;
    private HashMap<Integer, String> wordToGuess;   // word with places
    private InputSystem inputSystem = new InputSystem();
    private GameUI gameUI = new GameUI();

    void playGame() {
    }

    void setWord() {
        this.word = dataLoader.getWord;
    }

    public void setWordLetters() {
        var allLetters = word.split("");
    }

    void setLettersToGuess() {
        var allLetters = word.split("");
        this.lettersToGuess = new HashSet<String>(Arrays.asList(allLetters));
    }

    void setAmountLettersToGuess() {
        this.amountLettersToGuess = lettersToGuess.size();
    }

    void setWordToGuess() {
        for (var i = 0; i < word.length(); i++) {
            wordToGuess.put(i, wordLetters[i]);
        }
    }

    void ckeckLetter() {
        if (lettersToGuess.contains(inputSystem.getUserInput())) {
            System.out.println("Znaleziono litere"); //TODO: to be implemented
        } else {
            failures++;
            gameUI.printHangman(GameUI.HangmanEnum.FIRST_FAILURE);
        }
    }


}
