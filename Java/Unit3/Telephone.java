package Unit3;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Telephone {
    public static void main(String[] args) {
        System.out.print("Enter a phone number: ");
        Scanner keyboard = new Scanner(System.in);
        String number = keyboard.nextLine();
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(number);
        String store = "";
        while (m.find()){
            store += m.group();
        }
        boolean ext = number.contains("x");
        int length = store.length();
        keyboard.close();

        if (length < 7){
            System.out.println("Please enter a vAlId phone number");
            return;
        }

        if (length < 10){
            String phoneNumber = "(919)" + store.substring(0, 3) + "-" + store.substring(3);
            System.out.println(phoneNumber);
            
        }

        else if (length == 10){
            if (ext){
                String phoneNumber = "(919)" + store.substring(0, 3) + "-" + store.substring(3, 7) + " extension " + store.substring(7);
                System.out.println(phoneNumber);
            }
            else {
                String phoneNumber = "(" + store.substring(0, 3) + ")" + store.substring(3, 6) + "-" + store.substring(6);
                System.out.println(phoneNumber); 
            }
        }

        else {
            if (ext){
                String phoneNumber = "(" + store.substring(0, 3) + ")" + store.substring(3, 6) + "-" + store.substring(6,10) + " extension " + store.substring(10);
                System.out.println(phoneNumber);
            }
            else {
                String phoneNumber = "(" + store.substring(0, 3) + ")" + store.substring(3, 6) + "-" + store.substring(6);
                System.out.println(phoneNumber); 
            }
        }

    }
}
