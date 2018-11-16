package guessinggame;

/**
 *
 * @author CC2_1H-38
 */
import java.io.*;
import java.util.*;

public class GuessingGame {

    public static int guess;

    public static void main(String[] args) throws IOException {
        BufferedReader on = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\f\f\f\tGuess ME!XD\t\f\f\f\n"
                + "\t1-1000");
        int correct = (int) (Math.random() * 1000);
        System.out.println("correct : " + correct);
        int i = 0;
        do {
            if (i != 5) {
                System.out.println("trial : " + i + "/5");
                System.out.print("Enter a value: ");
                guess = Integer.parseInt(on.readLine());
                if (guess > 1000) {
                    System.out.println("guess should not exceed 1000");
                    if (guess > correct) {
                        if (guess % 2 == 0) {
                            System.out.println("Lower! Your number is even.");
                        } else {
                            System.out.println("Lower! Your number is odd.");
                        }
                    } else if (guess < correct) {
                        if (guess % 2 == 0) {
                            System.out.println("Higher! Your number is even.");
                        } else {
                            System.out.println("Higher! Your number is odd.");
                        }
                    } else if (guess == correct) {
                        System.out.println("good guess!");
                        break;

                    } else {
                        System.out.println("invalid input");
                    }
                    i++;
                } else {
                    System.out.println("GAME OVER!");
                    System.exit(0);
                }
            }
        } while (guess != correct);
    }
}
