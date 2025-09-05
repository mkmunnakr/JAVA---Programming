
import java.util.Random;
import java.util.Scanner;

public class GuesstheNumberGame {
    public static void main(String[] args) {
        /*
          Create a class Game , which allows a user to play "Guess the Number"
          game once.
         */
        Random rand = new Random();

        int r = rand.nextInt(100); // 0 se 99 ke beech
        //System.out.println("random "+ r);
        double randomDouble = rand.nextDouble(); // 0.0 se 1.0 ke beech
        Scanner user = new Scanner(System.in);
        System.out.print("Enter the number 0 to 99 : ");

        int i = 0;
        while(true){
            int n = user.nextInt();
            if(n > r) {
                System.out.print("Enter the Smallest number : ");
            }
            else if(n<r) {
                System.out.print("Enter the Biggest Number : ");
            }
            else if(n==r) {
                System.out.println("You are Won ! ");
                break;
            }
            else {
                System.out.println("Enter the Number 1 to 100 : ");
            }
        }


    }
}
