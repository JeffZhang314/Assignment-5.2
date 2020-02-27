import java.util.ArrayList;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class Puzzle
{
    String abet;
    boolean[] thAbetGuessed;
    String word;
    boolean[] thWordGuessed;
    Puzzle() {
        abet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        thAbetGuessed = new boolean[26];
        word = "ABBCDCEFG";
        thWordGuessed = new boolean[word.length()];
    }

    public boolean isUnsolved() {
        for (int i = 0; i < thWordGuessed.length; i++) {
            if (!thWordGuessed[i]) {
                return true;
            }
        }
        return false;
    }

    public void show() {
        for (int i = 0; i < thWordGuessed.length; i++) {
            if (thWordGuessed [i]) {
                System.out.print(word.charAt(i) + " ");
            } else {
                System.out.print("_ ");
            }
        }
    }

    public boolean makeGuess(String guess) {
        guess = guess.toUpperCase();
        int iGuess = word.indexOf(guess);
        if (iGuess == -1) {
            return false;
        }
        thAbetGuessed [abet.indexOf(guess)] = true;
        for (int i = iGuess; i > -1 && i < thWordGuessed.length; i = word.indexOf(guess, i + 1)) {
            thWordGuessed [i] = true;
        }
        return true;
    }

    public String getWord () {
        return word;
    }
}
