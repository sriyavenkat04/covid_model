package Unit3;
import java.util.Scanner;
public class Homework32 {
    public static void main(String[] args) {
    System.out.print("Please enter the radius of a circle in inches: ");
    Scanner keyboard = new Scanner(System.in);
    double rad = keyboard.nextDouble();
     
    double area = Math.PI * Math.pow(rad,2);  
    double circ = 2* Math.PI * rad;

    System.out.printf("For a circle with a radius of %f inches:%n The area is %.3f square inches%n The circumference is %.3f inches" , rad, area, circ);

    keyboard.close();
    }
}
