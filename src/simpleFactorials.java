import java.util.Scanner;

/**
 * Created by melodytempleton on 5/12/17.
 */
public class simpleFactorials {

    public static void listFactorials(int number){
        if (number >=1 && number < 17){
            int total = 1;
            String factorial = "1";
            for (int i = 1; i <= number; i++) {
            total *= i;
            if (i != 1){
            factorial = factorial + " * " + i;
            }
            }
            factorial = factorial + " = "+ total;
            System.out.println(factorial);
        }

        else {
            System.out.println("Please enter a number between 1 and 10");
            Scanner input = new Scanner(System.in);
            number = input.nextInt();
            listFactorials(number);
        }
        System.out.println("Do you want to continue? Enter Y or N");
        Scanner newInput = new Scanner(System.in);
        String answer = newInput.nextLine();
        if (answer.equalsIgnoreCase("Y")){
            runFactorials();
        }
        else {
            System.out.println("OK.  Hope that was fun.");
        }
    }
public static void runFactorials(){
    System.out.println("Please enter a number between 1 and 16");
    Scanner input = new Scanner(System.in);
    int number = input.nextInt();
    listFactorials(number);
}

    public static void main(String[] args) {

       runFactorials();

    }

}
