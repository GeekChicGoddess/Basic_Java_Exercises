/**
 * Created by melodytempleton on 5/11/17.
 */
public class Recursion {


    public static void countDown(int number) {


        System.out.println(number);
        if (number <= 0) {
            return;
        }

        countDown(number - 1);
    }

    public static void main(String[] args) {
        countDown(10);
    }
}