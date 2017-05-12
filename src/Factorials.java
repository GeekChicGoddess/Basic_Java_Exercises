import java.util.Scanner;

/**
 * Created by melodytempleton on 5/12/17.
 */


public class Factorials {

    public static void dividingLoop (int number){

        String factorslist = "1";
        int numberDivided = number;
        int numberMultiplied = 1;
        for (int i = 1; i < number; i++){
            if (numberDivided%i==0) {
                if (i != 1) {
                    factorslist = factorslist + "," + i;
                }
                numberDivided = numberDivided / i;
            }
             else{
                    System.out.println(number + " is not a factorial");
                    break;
                }
            if (multiplyingLoop(number, factorslist, numberMultiplied) == false){
                    break;
            }
            }

    }

    public static boolean multiplyingLoop (int number, String factorsList, int numberMultiplied){

        String[] factorsSplit = factorsList.split(",");


        for (int j = 0; j < factorsSplit.length; j++){

            numberMultiplied = numberMultiplied * Integer.parseInt(factorsSplit[j]);
            if (numberMultiplied > number){
                System.out.println(number + " is not a factorial");
                return false;
            }
            else if (numberMultiplied == number){
                System.out.println(number + " is a factorial.  Factors are:" + factorsList);
                return false;
            }
        }
        return true;
    }



    public static void main(String[] args) {
        System.out.println("Please enter a number between one and 479001600 to determine if it is a factorial");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        dividingLoop(number);

    }

}
