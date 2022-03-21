package Unit3;
import java.util.Scanner;
public class Homework321 {
    public static void main(String[] args) {
        System.out.print("Please enter the height and volume of the cylinder: ");
        Scanner keyboard = new Scanner(System.in);
        double height = keyboard.nextDouble();
        double volume = keyboard.nextDouble();
        double radius = Math.sqrt(volume/(Math.PI * height));
        System.out.printf("The radius of the cylinder is approximately:%n%.3f" , radius);

    keyboard.close();
    }
}
