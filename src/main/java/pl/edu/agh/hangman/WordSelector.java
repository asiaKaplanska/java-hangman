package pl.edu.agh.hangman;

import java.util.List;
import java.util.Random;

public class WordSelector {
    private String word;

    DataLoader dataloader = new DataLoader();
    Random random = new Random();


    private String getRandomElement() {
        List<String> words = dataloader.getWords();
        return words.get(random.nextInt(0, words.size() - 1));
    }

    public String getWord() {
        return getRandomElement();
    }
}




