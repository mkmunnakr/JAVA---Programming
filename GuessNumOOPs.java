import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses = 1;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    int takeuserinput(){
        System.out.print("Guess the number 1 to 100 : ");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
        return inputNumber;
    }
    boolean isCorrectNumber(){
        if(inputNumber==number){
            System.out.printf("Yes You Guessed it Right, it was %d\n You Guessed it in %d attempts",number,noOfGuesses);
            return true;
        }
        else if(inputNumber<number) {
            System.out.println("Too Less...");
            noOfGuesses += 1;
        }
        else if(inputNumber > number) {
            System.out.println("Too High...");
            noOfGuesses += 1;
        }
        return false;
    }
}
public class GuessNumOOPs {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while(!b){
            g.takeuserinput();
            b = g.isCorrectNumber();
            System.out.println(b);
        }
    }
}
