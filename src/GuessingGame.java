import java.util.Scanner;

/**
 * Created by melodytempleton on 5/12/17.
 */
public class GuessingGame {

    static Scanner input = new Scanner(System.in);
    static int numberToGuess = 0;
    static int numberOfGuesses = 0;


    public static void gameStart(){

        numberToGuess = (int)(Math.random() * 100) +1;
        System.out.println(numberToGuess);


        System.out.println("I have generated a random number between 1 and 100 for you to guess.  What is your guess?");
        int guess = input.nextInt();

        guessing(guess , numberToGuess);

    }

    public static void guessing (int guess, int numberToGuess){


        if (guess == numberToGuess){
            System.out.println("You guessed it!");
        }

        else if (guess < numberToGuess && numberOfGuesses < 10){
            System.out.println("You are too low");
            numberOfGuesses++;
            tryAgain(numberToGuess);
        }

        else if (guess > numberToGuess && numberOfGuesses < 10){
            System.out.println("You are too high");
            numberOfGuesses++;
            tryAgain(numberToGuess);
        }

        else {
            System.out.println("Sorry, you have used all of your guesses.  The number was " + numberToGuess);
        }


    }

    public static void tryAgain(int numberToGuess) {
        System.out.println("Try again. What is your guess?");
        int guess = input.nextInt();
        guessing(guess , numberToGuess);

    }

    public static void main(String[] args) {
        gameStart();
    }
}
