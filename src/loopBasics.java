import java.util.Scanner;

/**
 * Created by melodytempleton on 5/9/17.
 */
public class loopBasics {
    public static void main(String[] args) {
//        int i = 0;
//        while(i<=15){
//
//            System.out.println(i);
//            i++;
//        }
//
//    do {
//
//        System.out.println(i);
//        i+=2;
//
//
////    }while(i<=100);
//
//    int j = 100;
//        do {
//
//            System.out.println(j);
//            j-=5;
//
//
//        }while(j>=-10);

//
//        double j = 2;
//
//        do {
//
//            System.out.println(j);
//            j = j*j;
//
//
//        }while(j<1000000);
//
// for ( int i = 100; i >= -10; i-=5){
//     System.out.println(i);
// }
//
// for (double j = 2; j < 1000000; j=j*j){
//     System.out.println(j);
// }

        for (int k = 1; k < 100; k++){

            if (k%15 == 0) {
                System.out.println("fizzbuzz");
            }
            else if (k%3==0){
                System.out.println("fizz");
            }
            else if (k%5==0){
                System.out.println("buzz");
            }
            else {
                System.out.println(k);
            }
        }

//        A : 100 - 88
//        B : 87 - 80
//        C : 79 - 67
//        D : 66 - 60
//        F : 60 - 0
        Scanner input = new Scanner(System.in);
        int grade = -1;
        while (grade < 0 || grade > 100 ){
            System.out.println("Enter a grade between 0-100");
            grade = input.nextInt();
        }

        if (grade >= 0 && grade <= 59){
            System.out.println("Grade is an E");

        }

        else if (grade >= 60 && grade <= 66){
            System.out.println("Grade is a D");

        }

        else if (grade >= 67 && grade <= 79){
            System.out.println("Grade is an C");

        }

        else if (grade >= 80 && grade <= 87){
            System.out.println("Grade is an E");

        }

        else if (grade >= 88 && grade <= 100){
            System.out.println("Grade is an E");
        }

    }
}
