package Unit3;
import java.util.Scanner;
public class SpinningThingy {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        System.out.print("Would you like to spin (Y/N): ");
        char response = keyboard.next().charAt(0);
        int spin = 0;
        int score = 0;
        if (response == 'N'){
            System.exit(0);
        }
        if (response == 'Y'){
            spin = (int)(Math.random()*7+1);
            System.out.printf("You spun a %d, ", spin);
        }
        if (spin == 1){
            score = 3*spin + score;
        }    
        else if (spin == 2){
            score = 3*spin + score;
        }
        else if (spin == 3){
            System.out.println("You won with a spin 3");
            System.exit(0);
        }
        else if (spin == 4){
            score += spin;
        }
        else if (spin == 5){
            score += spin;
        }
        else if (spin == 7){
            score -= spin;
        }
        System.out.printf("Your score is %d%n", score);
        System.out.print("Spin again? (Y/N): ");
        char response2 = keyboard.next().charAt(0);
        int spin2 = 0;

        if (response2 == 'Y'){
            spin2 = (int)(Math.random()*7+1);
        }
        if (spin2 == 1){
            score = 3*spin2 + score;
        }    
        else if (spin2 == 2){
            score = 3*spin2 + score;
        }
        else if (spin2 == 3){
            System.out.println("You won with a spin 3");
            System.exit(0);
        }
        else if (spin2 == 4){
            score += spin2;
        }
        else if (spin2 == 5){
            score += spin2;
        }
        else if (spin2 == 6){
            score -= spin2;
        }
        System.out.printf("You spun a %d, your final score is %d%n", spin2, score);
        if (score<8){
            System.out.println("Sorry, you lose :(");
        }
        else {
            System.out.println("Yay! You won!");
        }
    }



        


    
}
