package game_with_random;

import java.util.Scanner;

public class GameClass {


    /*
    Type a number guess game:
    Hint: Ask user to enter a number between 0-100
    Type a code that gives a random number between 0-100
    If the number is less than random number print: "Enter a greater number"
    If the number is more than random number print: "Enter a smaller number"
    If the number is equal to random number print: "Congratulations! You found the number!!!"

   */

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter an integer between 0-100");
            int number;
            int randomNumber = ((int) (Math.random() * 101));
            int counter = 0;

            do {
                counter++;
                number = scanner.nextInt();

                if (number < randomNumber) {
                    System.out.println("You failed! You have " + (10 - counter) + " guesses more. Enter a greater number");
                } else if (number > randomNumber) {
                    System.out.println("You failed! You have " + (10 - counter) + " guesses more. Enter a smaller number");
                } else {
                    System.out.println("Congratulation! You found the number " + counter + " guesses!!!");
                    System.out.println("You point: " + (11 - counter) * 10);
                }
                if (counter == 10) {
                    System.out.println("Game Over!!! If you want to play again enter 1 otherwise enter any other number");
                    int decision = scanner.nextInt();
                    if (decision == 1) {
                        counter = 0;
                        randomNumber = ((int) (Math.random() * 101));
                    } else {
                        break;
                    }

                }

            } while (number != randomNumber);
            System.out.println("Bye bye!!!");
        }
    }





