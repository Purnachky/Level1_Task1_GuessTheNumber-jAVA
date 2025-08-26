
import java.util.Scanner;
//import java.util.Random;

public class Main {
    public static void main(String[] args) {
    // create Scanner and Random objects
        Scanner myObj = new Scanner(System.in);

        //Generate a random number between 1 and 100
        int targetNumber = (int) (Math.random() *100) + 1;
        int guess = 0;
        int attempts = 0;

        System.out.println("Welcome to the Guess The Number Game!");
        System.out.println("I have selected a number between 1 to 100. Can you guess the number?");
        //game loop
        while (guess != targetNumber) {
            System.out.println("Enter the number which you have guessed: ");
            guess = myObj.nextInt();
            attempts++;
            if (guess < targetNumber) {
                System.out.println("Too low! try again.");
            } else if (guess > targetNumber) {
                System.out.println("Too high! try again");
            } else {
                System.out.println("Congratulation! You have guessed the number in " + attempts + "attempts.");
                break;
            }
        }
        //close the scanner
myObj.close();
    }
}