import java.util.Scanner;

/**
 * Created by melodytempleton on 5/12/17.
 */
public class DiceRolling {

    public static void rollTheDice(int diceSides){

        int rollOne = (int) (Math.random()*diceSides)+1;
        int rollTwo = (int) (Math.random()*diceSides)+1;

        System.out.println("Your rolls are " + rollOne + " and "+ rollTwo);

    }




    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Which number sided dice do you want to roll?");
        int diceSides = input.nextInt();
        rollTheDice(diceSides);

    }
}
