package pl.edu.agh.hangman;

import java.util.Scanner;

public class InputSystem {
    GameUI gameUI = new GameUI();
    private Scanner scanner = new Scanner(System.in);
    private String userInput;

    public void setUserInput() {
        gameUI.printUserInputQuery();
        userInput = scanner.next();
    }

    public String getUserInput() {
        return userInput;
    }
}
