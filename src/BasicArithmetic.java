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

    public static void division(int number1, int number2) {
        int total = number1 / number2;
        System.out.println("division total "+total);

    }




    public static void main(String[] args) {

        addition(1, 2);
        subtraction(5,2);
        multiplication(5,6);
        division(12, 4);


    }
}
