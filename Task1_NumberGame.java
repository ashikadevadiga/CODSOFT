import java.util.Scanner;
import java.util.Random;

public class Task1_NumberGame {
    public static void main(String[] args) {

        Random rand = new Random();
        int number = rand.nextInt(100) + 1;

        Scanner sc = new Scanner(System.in);
        int guess = 0;

        while (guess != number) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if (guess > number) {
                System.out.println("Too high!");
            } else if (guess < number) {
                System.out.println("Too low!");
            } else {
                System.out.println("Correct! You guessed it.");
            }
        }
    }
}