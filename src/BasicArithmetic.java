import java.util.Scanner;

/**
 * Created by melodytempleton on 5/11/17.
 */
public class BasicArithmetic {

    public static void addition(int number1, int number2) {
         int total = number1 + number2;
        System.out.println("addition total "+total);

    }

    public static void subtraction(int number1, int number2) {
        int total = number1 - number2;
        System.out.println("subtraction total "+total);

    }

    public static void multiplication(int number1, int number2) {
        int total = number1 * number2;
        System.out.println("multiplication total "+total);

    }

    public static void multiplicationLoop(int number1, int number2) {
        int total =0;
        int i = 0;
        while (i < number2){
            total += number1;
            i++;
        }
        System.out.println("multiplication Loop total "+total);

    }

    public static void multiplicationRecusive(int number1, int number2, int counter, int total) {

        if (counter < number2){
        total = total + number1;
        counter++;
        multiplicationRecusive(number1, number2, counter, total);
        return;
    }
        System.out.println("multiplication Recursive total "+total);

    }



    public static void division(int number1, int number2) {
        int total = number1 / number2;
        System.out.println("division total "+total);

    }

    public static void modulus(int number1, int number2 ){
        int total = number1%number2;
        System.out.println("modulus result is "+total);
    }

    public static int getInteger(int min, int max){

        System.out.print("Enter a number between "+ min+" and "+ max+".");
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
        if (userInput >= min && userInput <= max){
            return userInput;
        }

        System.out.println("Sorry, that is out of the range");

        return getInteger(min, max);
    }


    public static void main(String[] args) {

        addition(1, 2);
        subtraction(5,2);
        multiplication(5,6);
        multiplicationLoop(5,6);
        division(12, 4);
        modulus(25, 4);
        int userInput = getInteger(1, 10);
        System.out.println("number: " + userInput);

    }
}
