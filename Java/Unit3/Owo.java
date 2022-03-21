package Unit3;
import java.util.Scanner;
public class Owo {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner keyboard = new Scanner(System.in);
        int num = keyboard.nextInt();
        System.out.println(num >= 0 ? "nonnegative" : "negative"); 
        // if (num>0){
        //     System.out.println("positive");
        // }
        // else if (num<0){
        //     System.out.println("negative");
        // }
        // else {
        //     System.out.println("zero");
        // }
        keyboard.close();
    

    
    }
}
