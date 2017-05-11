import java.util.Scanner;

/**
 * Created by melodytempleton on 5/11/17.
 */
public class MethodsLecture {

    public static boolean makeTacos(boolean tortillas, boolean fill, boolean salsa) {
        if(tortillas && fill && salsa){

            return true;
        }else {

            return false;
        }

    }
    public static boolean makeTacos(boolean tortillas, boolean fill) {
        if(tortillas && fill){

            return true;
        }else {

            return false;
        }

    }

    public static void areTheTacosRady(boolean answer, String client) {
        if (answer){
            System.out.println("tacos are ready");

        }else{
            System.out.println("no tacos");
        }
        System.out.println(serve(client));
    }

    public static String serve(String client){
        return client + " was notified";
    }
    public static String askClientName(Scanner input){

        System.out.println("Give me the client name");
        String client = input.nextLine();

        return client;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        boolean answer = makeTacos(true,true,true);
        areTheTacosRady(answer, askClientName(input));

        areTheTacosRady(makeTacos(true, true), askClientName(input));


    }

}