/**
 * Created by melodytempleton on 5/10/17.
 */

import java.util.Scanner;
public class raindropAndGrades {



        public static void main(String[] args) {


//        If the number has 3 as a factor, output 'Pling'.
//                If the number has 5 as a factor, output 'Plang'.
//                If the number has 7 as a factor, output 'Plong'.
//                If the number does not have 3, 5, or 7 as a factor, just pass the number's digits straight through.
//
//        Examples
//
//        28's factors are 1, 2, 4, 7, 14, 28.
//        In raindrop-speak, this would be a simple "Plong".
//        30's factors are 1, 2, 3, 5, 6, 10, 15, 30.
//        In raindrop-speak, this would be a "PlingPlang".
//        34 has four factors: 1, 2, 17, and 34.
//        In raindrop-speak, this would be "34".

            Scanner output = new Scanner(System.in);

            System.out.println("Enter the number you would like raindrop speak to go to.");
            int limit = output.nextInt();
            int r = 1;

            do {
                if (r%105 ==0){
                    System.out.println("PlingPlangPlong");
                }
                else if (r%15 ==0){
                    System.out.println("PlingPlang");
                }

                else if (r%35 == 0){
                    System.out.println("PlangPlong");
                }

                else if (r%21 == 0){
                    System.out.println("PlingPlong");
                }

                else if (r%3 == 0){
                    System.out.println("Pling");
                }
                else if (r%5 == 0){
                    System.out.println("Plang");
                }

                else if (r%7 == 0){
                    System.out.println("Plong");
                }

                else {
                    System.out.println(r);
                }


                r++;
            } while (r < limit);


            int a[]=new int[10];//declaration and instantiation.
            a[0]=50;//initialization.
            a[1]=20;
            a[2]=70;
            a[3]=40;
            a[4]=50;
            a[5]=60;
            a[6]=20;
            a[7]=80;
            a[8]=90;
            a[9]=30;

            int s = 0;
            int lowScore = 100;
            int scoreTotal = 0;
            int scoreAverage = 0;

            while (s<a.length){

                if (a[s] < lowScore) {
                    lowScore = a[s];
                }
                scoreTotal = scoreTotal + a[s];
                s++;
            }

            scoreAverage = scoreTotal / a.length;

            System.out.println("Average score is "+ scoreAverage);
            System.out.println("Low score is " + lowScore);
        }}


