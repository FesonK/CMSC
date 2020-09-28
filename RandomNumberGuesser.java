/*
* Class: CMSC203
* Instructor:
* Description: (Give a brief description for each Program)
* Due: 9/27/2020
* I pledge that I have completed the programming assignment independently.
  I have not copied the code from a student or any source.
  I have not given my code to any student.
  Print your Name here: Feson
*/
import java.util.Scanner;
public class RandomNumberGuesser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner keyboard = new Scanner(System.in);
        int randNum = RNG.rand();
        int upperBound = 99;
        int lowerBound = 0;
        System.out.println("Enter your first guess between 0 and 100");
        int userGuess = scanner.nextInt();
        String cont = "yes";
        do {
            if (userGuess > randNum) {
                upperBound = userGuess;
                System.out.println("Number of guess is: " + RNG.getCount());
                System.out.println("Your guess is to high");
                System.out.println("Enter your next guess between " + lowerBound + " " + upperBound);
                userGuess = scanner.nextInt();
                while (!RNG.inputValidation(userGuess, lowerBound, upperBound)) {
                    RNG.inputValidation(userGuess, lowerBound, upperBound);
                    userGuess = scanner.nextInt();
                }

            } else if (userGuess < randNum){
                lowerBound = userGuess;
                RNG.inputValidation(randNum, lowerBound, upperBound);
                System.out.println("Your guess is too low");
                System.out.println("Enter your next guess between " + lowerBound + " " + upperBound);
                userGuess = scanner.nextInt();
                while (!RNG.inputValidation(userGuess, lowerBound, upperBound)) {
                    RNG.inputValidation(userGuess, lowerBound, upperBound);
                    userGuess = scanner.nextInt();
                }

            } else if( userGuess == randNum) {
                System.out.println("congratulations you guessed correctly");
                RNG.resetCount();
                userGuess = RNG.rand();
                System.out.println("Try again? (yes or no)");
                cont = keyboard.next();
                upperBound = 99;
                lowerBound = 0;
            }

        } while (cont.equals("yes"));
    }
}

