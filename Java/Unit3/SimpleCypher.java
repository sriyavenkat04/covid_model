package Unit3;
//Sriya Venkat
//October 9, 2020
//Prompting the user to enter a four letter lowercase word, then shifting by the number generated 
//between 1 and 12 by the random number generator and using ascii to get new four letters 
import java.util.Scanner;
public class SimpleCypher {
    public static void main(String[] args) {
        System.out.println("Please enter a four letter word in lowercase: ");
        Scanner keyboard = new Scanner (System.in);
        String input = keyboard.nextLine();
        //using int instead of char because it is easier to shift everything by 97 (a is 97 in ascii)
        //and subtracting input.charAt(x)-97 to shift the letter codes from 0-25 instead of 97-123
        int letter0 = input.charAt(0)-97;
        int letter1 = input.charAt(1)-97;
        int letter2 = input.charAt(2)-97;
        int letter3 = input.charAt(3)-97;
        //random number generator
        int shift = (int)(Math.random()*12)+1;
        //for each new letter, I added the shift amount to the letter variable then did mod 26 so
        //that it would wrap around, and lastly, added 97 so I could get the correct ascii code
        char lett0 = (char) ((letter0 + shift)%26 + 97);
        char lett1 = (char) ((letter1 + shift)%26 + 97);
        char lett2 = (char) ((letter2 + shift)%26 + 97);
        char lett3 = (char) ((letter3 + shift)%26 + 97);
        //Finally, I printed out the new four letters by doing the line below. Since lettx is a
        //variable, it was converted to a string by using "" and + signs between each lettx,
        //so that the the letters would be put together
        System.out.println(""+ lett0+lett1+lett2+lett3);
        keyboard.close();
    }
}
