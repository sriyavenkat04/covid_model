package Unit3;
import java.util.Scanner; 

public class QuadraticFormula {
    public static void main(String[] args) {
        System.out.print("Please enter a, b, and c for a quadratic equation. The value for “a” may not be zero :");
        Scanner keyboard = new Scanner(System.in);
        int a = keyboard.nextInt();
        int b = keyboard.nextInt();
        int c = keyboard.nextInt();
        double disc = Math.pow(b, 2) - 4*a*c;
        double r1 = (-b + Math.sqrt(disc))/2*a;
        double r2 = (-b - Math.sqrt(disc))/2*a;
        

        System.out.printf("The equation %d^2 + %dx + %d has roots: %.2f and %.2f", a, b, c, r1, r2);
        keyboard.close();
    } 
}
