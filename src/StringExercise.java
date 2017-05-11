/**
 * Created by melodytempleton on 5/11/17.
 */
import java.util.Scanner;

public class StringExercise {
    public static void main(String[] args) {


        String myString = "We don't need no education\n" +
                "We don't need no thought control\n" +
                "Check \"this\" out!, \"s inside of \"s!\n" +
                "In windows, the main drive is usually C:\\\n" +
                "I can do backslashes \\, double backslashes \\\\,\n" +
                "and the amazing triple backslash \\\\\\!";

        System.out.println(myString);



        System.out.println("Say something to Bob");

        Scanner input = new Scanner(System.in);

        String response = input.nextLine();

        if (response.endsWith("?")){
            System.out.println("Sure.");
        }

        else if(response.toUpperCase().equals(response) && response.length()!=0 && !response.toLowerCase().equals(response)){
            System.out.println("Whoa, chill out!");
        }

        else if (response.length()==0){
            System.out.println("Fine. Be that way!");
        }

        else {
            System.out.println("Whatever");
        }


    }

}


//sentence = "     ";
//        if (sentence.trim().equals(""))