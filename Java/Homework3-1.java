//Sriya Venkat
//September 16, 2020
//Dividing fractions
import java.util.Scanner;
class Homework31   
{
    public static void main(String[] args) {
        System.out.print("Please enter two fractions, numerator and denominator: ");
        Scanner keyboard = new Scanner(System.in);
        double num1 = keyboard.nextDouble();
        double den1 = keyboard.nextDouble();
        double num2 = keyboard.nextDouble();
        double den2 = keyboard.nextDouble();
        double frac1 = num1/den1;
        double frac2 = num2/den2;
        double quot = frac1/frac2;

        System.out.printf("The quotient is: %.2f", quot);

        keyboard.close();
    }
}