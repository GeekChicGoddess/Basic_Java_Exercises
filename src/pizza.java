package Exercises;

import java.util.Scanner;

/**
 * Created by melodytempleton on 5/8/17.
 */
public class pizza {
    public static void main(String[] args) {
        Scanner order = new Scanner(System.in);


        System.out.println("8 inch: $7.00");
        System.out.println("12 inch: $10.00");
        System.out.println("15 inch: $12.00");
        System.out.println("Please select size of pizza. 8, 12 or 15");

        String size = order.nextLine();
        double basePrice = 1.00;

        if (size =="8"){
            basePrice = 7.00;
        }
        else if ( size =="12"){
            basePrice = 10.00;
        }
        else {
            basePrice = 12.00;
        }



        System.out.println("Cheese");
        System.out.println("Pepperoni");
        System.out.println("Margharita");
        System.out.println("All the Meats");
        System.out.println("Vegetarian");

        System.out.println("Please select type of pizza");
        String type = order.nextLine();

        System.out.println("Please select any extra options.  Each option selected is $1.50");

        System.out.println("Enter 'x' next to options you want and press enter.  Just press enter if you do not want an option");

        System.out.println("Extra Cheese?");
        String extraCheese = order.nextLine();

        System.out.println("Extra Sauce?");
        String  extraSauce = order.nextLine();

        System.out.println("Garlic Butter?");
        String  garlicButter = order.nextLine();

        System.out.println("Gluten Free?");
        String  glutenFree = order.nextLine();

        System.out.println("Whole Wheat");
        String wholeWheat = order.nextLine();

        System.out.println("Extra pepperoni");
        String  extraPepperoni = order.nextLine();

        System.out.println("Pan Pizza?");
        String  panPizza = order.nextLine();
        String cheeseCharge = "";
        String sauceCharge = "";
        String gbCharge = "";
        String glutenCharge = "";
        String wwCharge = "";
        String peppCharge = "";
        String panCharge = "";


        double extraCharges = 0;

        if (extraCheese.equals("x")) {
            extraCharges += 1.50;
            cheeseCharge = "1.50";
        }

        if (extraSauce.equals("x")) {
            extraCharges += 1.50;
            sauceCharge = "1.50";
        }

        if (garlicButter.equals("x")) {
            extraCharges += 1.50;
            gbCharge = "1.50";
        }

        if (glutenFree.equals("x")) {
            extraCharges += 1.50;
            glutenCharge = "1.50";
        }

        if (wholeWheat.equals("x")) {
            extraCharges += 1.50;
            wwCharge = "1.50";
        }

        if (extraPepperoni.equals("x")) {
            extraCharges += 1.50;
            peppCharge = "1.50";
        }

        if (panPizza.equals("x")) {
            extraCharges += 1.50;
            panCharge = "1.50";
        }

        System.out.println("Please enter your name");
        String name = order.nextLine();
        System.out.println("Please enter your address");
        String address = order.nextLine();
        System.out.println("Please enter your phone number");
        String phone = order.nextLine();

        System.out.println("Here are your order details");
        System.out.println("Name: " + name);
        System.out.println("Address: "+ address);
        System.out.println("Phone: "+phone);

        double totalPrice = basePrice + extraCharges;

        System.out.println("Pizza size " + size);
        System.out.println();
        System.out.println("Price " + basePrice);
        System.out.println("Extra Cheese " + cheeseCharge);

        System.out.println("Extra Sauce " + sauceCharge);

        System.out.println("Garlic Butter " + gbCharge);

        System.out.println("Gluten Free " + glutenCharge);

        System.out.println("Whole Wheat " +wwCharge);

        System.out.println("Extra pepperoni " + peppCharge);


        System.out.println("Pan Pizza " +panCharge);

        System.out.println("Total Extra Charges " + extraCharges);

        System.out.println("Order Total is " + totalPrice);






    }

}
