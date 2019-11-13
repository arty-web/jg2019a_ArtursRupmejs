package lv.jg.lesson6.level4;

import static java.lang.System.out;
import java.util.Scanner;

public class Ugadajka {

    //rakstot arī šādas programmas, mēs pieturamies pie OOP principiem
    //izveidojam klasi, kuru darbinam no atsevišķas test klases

    public static void main(String args[]) {

        Scanner keyboard = new Scanner(System.in);
        int range = 100;
        int numGuesses = 1;
        int i = 4; //kas ir "i" ??
        int userNumber = 0;
        String userAnswer;

        out.println("         ************         ");
        out.println("  Welcome to the Guessing Game!");
        out.println("         ************         \n");

        //šo var inest atsevišķā metodē
        while (!(userNumber >= 1 && userNumber <= 100)) { //šo pārbaudi iznes atsevišķā metodē
            out.print("Enter an int from 1 to " + range + ": ");
            if (keyboard.hasNextInt()) {
                userNumber = keyboard.nextInt();
            } else {
                keyboard.next();
            }
        }

        out.println("\n***The computer will try to guess it!***\n");
        int pcNumber = range / 2;

        //šo var inest atsevišķā metodē
        while (userNumber != pcNumber) {
            out.println("Computer: Is the number " + pcNumber + "?");
            out.println("          No?? Hmm... ");

            do {
                out.print("          Should I aim (h)igher or (l)ower? ");
                userAnswer = keyboard.next();
                // arī šo pārbaudi ir jāines atsevišķā metodē
            } while (!userAnswer.toLowerCase().equals("h")
                    && !userAnswer.toLowerCase().equals("higher")
                    && !userAnswer.toLowerCase().equals("l")
                    && !userAnswer.toLowerCase().equals("lower"));

            //šo var inest atsevišķā metodē
            switch (userAnswer.toLowerCase()) {
                case "h":
                case "higher":
                    //šo var inest atsevišķā metodē
                    pcNumber = pcNumber + (range / i);  //pcNumber =+ (range / i);
                    if (range % i >= 5)
                        pcNumber = pcNumber + 1;        //pcNumber++
                    break;
                case "l":
                case "lower":
                    //šo var inest atsevišķā metodē
                    pcNumber = pcNumber - (range / i);  //pcNumber =- (range / i);
                    if (range % i >= 5)
                        pcNumber = pcNumber - 1;        //pcNumber--
                    break;
            }
            i = i * 2; // i =* 2
            numGuesses++;
            out.println();
        }

        out.println("Computer: Is the answer " + pcNumber + "?");
        out.println("Computer: It is?? :)) Woohoo!\n");
        out.println("***Computer wins after " + numGuesses + " guesses.***");
        keyboard.close();

    }

}