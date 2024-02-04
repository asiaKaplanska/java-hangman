
import java.io.FileNotFoundException;
import java.util.Arrays;

import static pl.edu.agh.hangman.GameUI.HangmanEnum.SECOND_FAILURE;


public class Hangman {


    public static void main(String[] args) throws FileNotFoundException {
        //System.out.println(HANGMANPICS.length);
        DataLoader test = new DataLoader();
        WordSelector test2=new WordSelector();
       // test.loadWords("src/main/resources/slowa.txt");
        //System.out.println(test.getWords());
        System.out.println(test2.getWord());
    }
}
