package Unit3;
//Sriya Venkat
//October 9, 2020
//Prompting the user for size of the pizza, then using if statements to determine
//the price of the pizza given a particular size.
import java.util.Scanner;
public class PizzaCode {
    public static void main(String[] args) {
        System.out.print("Please enter the size of the pizza: (12, 14, or 16 inch): ");
        Scanner keyboard = new Scanner(System.in);
        int size = keyboard.nextInt();
        double price = 0;
        if (size == 12) price += 9;
        else if (size == 14) price += 11;
        else if (size == 16) price += 14;
        //Making sure that the user may not "order" a size which is not listed by using an else
        //statement
        else { 
            System.out.println("This size is not available");
            System.exit(1);
        }
        //Prompting user to enter number of toppings and then using more if statements to determine 
        //price of the pizza with the toppings and size included
        System.out.print("Please enter the number of toppings: ");
        int toppings = keyboard.nextInt();
        if (toppings == 0) price += 0;
        else if (toppings == 1) price += 2;
        else if (toppings == 2) price += 3;
        else if (toppings >= 3) price += 3.50 + 0.5*(toppings-3);
        //Printing out the cost of the pizza using printf statement to get a non integer money value
        System.out.printf("The cost of the pizza is $%.2f%n", price);
        keyboard.close();
    }
}