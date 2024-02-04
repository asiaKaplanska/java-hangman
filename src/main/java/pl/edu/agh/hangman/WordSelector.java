package pl.edu.agh.hangman;

import java.util.List;
import java.util.Random;

public class WordSelector {
    private String word;
    public String getWord() {
        return word;
    }
   DataLoader dataloader= new DataLoader();


    private void getRandomElement(){

            List<String> words=dataloader.getWords();
            this.word=words.get(new Random().nextInt(words.size()));
        }

    }




