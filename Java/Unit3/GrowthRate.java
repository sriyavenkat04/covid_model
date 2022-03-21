package Unit3;
import java.util.Scanner;
public class GrowthRate {
    public static void main(String[] args) {
    System.out.print("Population growth model" + "\n" + "Please enter the current population, the years to calculate for the projection, and the rate of growth:");
      Scanner keyboard = new Scanner(System.in);
        int pop = keyboard.nextInt();
        int years = keyboard.nextInt();
        double percentrate = keyboard.nextDouble();
        double rate = percentrate/100;
        double popgrowth = pop* Math.pow(1+rate, years);
        System.out.println("In" +" " + years + " " + "years at" + " " + percentrate + "%" + " "+
         "growth, the population is expected to be" + " " + Math.rint(popgrowth));
    System.out.print("Population decay model" + "\n" + "Please enter the current population, the years to calculate for the projection, and the rate of decay:");
        pop = keyboard.nextInt();
        years = keyboard.nextInt();
        percentrate = keyboard.nextDouble();
        rate = percentrate/100;
        double popdecay = pop* Math.pow(1-rate, years);
        System.out.println("In" +" " + years + " " + "years at" + " " + percentrate + "%" + " "+
        "decline, the population is expected to be" + " " + Math.rint(popdecay));   
        keyboard.close();

    }
}
