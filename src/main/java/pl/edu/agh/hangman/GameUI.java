package pl.edu.agh.hangman;

public class GameUI {
    public enum HangmanEnum {
        FIRST_FAILURE,
        SECOND_FAILURE,
        THIRD_FAILURE,
        FOUR_FAILURE,
        FIVE_FAILURE,
        SIX_FAILURE,
        SEVEN_FAILURE;
    }

    private static final String GAME_DESCRIPTION = ("\n" +
                                                    "Welcome to the game!\n" +
                                                    "\n" +
                                                    "Here are the rules:\n" +
                                                    "***\n" +
                                                    "\n" +
                                                    "Good luck :)\n");

    public static final String[] HANGMANPICS = new String[]{
            "  +---+\n" +
            "  |   |\n" +
            "      |\n" +
            "      |\n" +
            "      |\n" +
            "      |\n" +
            "=========",
            "  +---+\n" +
            "  |   |\n" +
            "  O   |\n" +
            "      |\n" +
            "      |\n" +
            "      |\n" +
            "=========",
            "  +---+\n" +
            "  |   |\n" +
            "  O   |\n" +
            "  |   |\n" +
            "      |\n" +
            "      |\n" +
            "=========",
            "  +---+\n" +
            "  |   |\n" +
            "  O   |\n" +
            " /|   |\n" +
            "      |\n" +
            "      |\n" +
            "=========",
            "  +---+\n" +
            "  |   |\n" +
            "  O   |\n" +
            " /|\\  |\n" +
            "      |\n" +
            "      |\n" +
            "=========",
            "  +---+\n" +
            "  |   |\n" +
            "  O   |\n" +
            " /|\\  |\n" +
            " /    |\n" +
            "      |\n" +
            "=========",
            "  +---+\n" +
            "  |   |\n" +
            "  O   |\n" +
            " /|\\  |\n" +
            " / \\  |\n" +
            "      |\n" +
            "========"
    };

    public void printGameDescriptionMessage() {
        System.out.println(GAME_DESCRIPTION);
    }

    public void printHangman(HangmanEnum failureScore) {
       switch (failureScore) {
           case FIRST_FAILURE -> System.out.println(HANGMANPICS[0]);
           case SECOND_FAILURE -> System.out.println(HANGMANPICS[1]);
           case THIRD_FAILURE -> System.out.println(HANGMANPICS[2]);
           case FOUR_FAILURE -> System.out.println(HANGMANPICS[3]);
           case FIVE_FAILURE -> System.out.println(HANGMANPICS[4]);
           case SIX_FAILURE -> System.out.println(HANGMANPICS[5]);
           case SEVEN_FAILURE -> System.out.println(HANGMANPICS[6]);
       }
    }
}
