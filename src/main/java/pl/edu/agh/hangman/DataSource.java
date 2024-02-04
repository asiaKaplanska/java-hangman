package pl.edu.agh.hangman;

import java.io.FileNotFoundException;

public interface DataSource {
    public void loadWords(String filepath) throws FileNotFoundException;
}
