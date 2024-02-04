package pl.edu.agh.hangman;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataLoader {

    private List<String>words=new ArrayList<>();
    public List<String> getWords() {
        return words;
    }
    public void loadWords (String filepath) throws FileNotFoundException {

        File textFile = new File(filepath);
        Scanner scanner = new Scanner(textFile);
        while (scanner.hasNext()) {
            this.words.add(scanner.next());
        }
        scanner.close();

    }

}
