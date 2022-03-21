//Sriya Venkat
//September 16, 2020
//Converting time into minutes and seconds
import java.util.Scanner;
class ElapsedTimeConverter   
{
    public static void main(String[] args) {
        System.out.print("Please enter elapsed time in the form of hours minutes and seconds: (HH M S): ");
        Scanner keyboard = new Scanner(System.in);
        int hrs = keyboard.nextInt();
        int min = keyboard.nextInt();
        int sec = keyboard.nextInt();
        int minhrs = hrs * 60;
        double tmin = minhrs + min + sec/60.0;
        int tsec = (minhrs + min)*60 + sec;

        System.out.printf("%d:%d:%d Elapsed time converts to: %n%.3f minutes%n%d seconds%n",
             hrs, min, sec, tmin, tsec);

        keyboard.close();
    }
}