
/**
 * @author Esse Noudegbessi
 * This program is a driver class that uses the RNG class to play a game of guessing a number and it returns the number of guesses.
 */
import java.util.Scanner;

public class RNGD {

	public static void main(String[] args) {
		
		int count, lowGuess, highGuess, guess, randInt;
		lowGuess=0;
		highGuess=100;
		
		System.out.println("This is a random number guess game.");
		RNG randomGuess = new RNG();
		count = 1;
		boolean iteration = true;
		do {
		randInt = RNG.rand();

		System.out.println("Enter your first guess: ");
		Scanner keyboard = new Scanner(System.in);
		guess = keyboard.nextInt();

		RNG.inputValidation(guess, lowGuess, highGuess);

		System.out.println("The number of guesses is " + count);

		if (guess > randInt) {
			System.out.println("Your guess is too high");
			highGuess = guess;
		}
		if (guess < randInt) {
			System.out.println("Your guess is too low");
			lowGuess = guess;
		}
		if (guess == randInt) {
			System.out.println("Congratulations. You guessed the number");
		}
		
		while (guess >randInt || guess < randInt) {
			System.out.print("Enter your next guess between "+lowGuess+" and "+highGuess+": ");
			guess = keyboard.nextInt();

			RNG.inputValidation(guess, lowGuess, highGuess);
			count = RNG.getCount();

			System.out.println("The number of guesses is " + count);

			if (guess > randInt) {
				System.out.println("Your guess is too high");
				highGuess = guess;
			}
			if (guess < randInt) {
				System.out.println("Your guess is too low");
				lowGuess = guess;
			}
			if (guess == randInt) {
				System.out.println("Congratulations. You guessed the number");
			}
		}
		
		
		System.out.println("Do you want to play again? ");
		String answer = keyboard.nextLine();
		if (answer =="yes") {iteration = true;}
		
		RNG.resetCount();
		} while (iteration = true);

	}

}
