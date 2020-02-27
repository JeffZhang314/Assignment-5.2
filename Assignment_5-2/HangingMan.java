public class HangingMan {

    private int numWrongGuesses;
    String[] HangmanImage;

    HangingMan() {
        numWrongGuesses = 0;
        HangmanImage = new String[] {" +----+\n"+
            " |\n"+
            " |\n"+
            " |\n"+
            "/ \\\n",

            " +----+\n"+
            " |    O\n"+
            " |\n"+
            " |\n"+
            "/ \\\n",

            " +----+\n"+
            " |    O\n"+
            " |    +\n"+
            " |\n"+
            "/ \\\n",

            " +----+\n"+
            " |    O\n"+
            " |    +-\n"+
            " |\n"+
            "/ \\\n",

            " +----+\n"+
            " |    O\n"+
            " |   -+-\n"+
            " |\n"+
            "/ \\\n",

            " +----+\n"+
            " |    O\n"+
            " |   -+-\n"+
            " |   / \n"+
            "/ \\\n",

            " +----+\n"+
            " |    O\n"+
            " |   -+-\n"+
            " |   / \\\n"+
            "/ \\\n"
        };
    }

    public boolean isntDead() {
        return numWrongGuesses < HangmanImage.length - 1;
    }

    public void show() {
        System.out.println(HangmanImage [numWrongGuesses]);
    }

    public void dieSomeMore() {
        numWrongGuesses ++;
    }
}
