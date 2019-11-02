package lv.jg.lesson6.level4;

import static java.lang.System.out;
import java.util.Scanner;

public class Ugadajka {

    public static void main(String args[]) {

        Scanner keyboard = new Scanner(System.in);
        int range = 100;
        int numGuesses = 1;
        int i = 4;
        int userNumber = 0;
        String userAnswer;

        out.println("         ************         ");
        out.println("  Welcome to the Guessing Game!");
        out.println("         ************         \n");

        while (!(userNumber >= 1 && userNumber <= 100)) {
            out.print("Enter an int from 1 to " + range + ": ");
            if (keyboard.hasNextInt()) {
                userNumber = keyboard.nextInt();
            } else {
                keyboard.next();
            }
        }

        out.println("\n***The computer will try to guess it!***\n");
        int pcNumber = range / 2;

        while (userNumber != pcNumber) {
            out.println("Computer: Is the number " + pcNumber + "?");
            out.println("          No?? Hmm... ");

            do {
                out.print("          Should I aim (h)igher or (l)ower? ");
                userAnswer = keyboard.next();
            } while (!userAnswer.toLowerCase().equals("h")
                    && !userAnswer.toLowerCase().equals("higher")
                    && !userAnswer.toLowerCase().equals("l")
                    && !userAnswer.toLowerCase().equals("lower"));

            switch (userAnswer.toLowerCase()) {
                case "h":
                case "higher":
                    pcNumber = pcNumber + (range / i);
                    if (range % i >= 5)
                        pcNumber = pcNumber + 1;
                    break;
                case "l":
                case "lower":
                    pcNumber = pcNumber - (range / i);
                    if (range % i >= 5)
                        pcNumber = pcNumber - 1;
                    break;
            }
            i = i * 2;
            numGuesses++;
            out.println();
        }

        out.println("Computer: Is the answer " + pcNumber + "?");
        out.println("Computer: It is?? :)) Woohoo!\n");
        out.println("***Computer wins after " + numGuesses + " guesses.***");
        keyboard.close();

    }

}