package pl.astralkarolwaw;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Random random = new Random();

        boolean isStillRuning = false;
        boolean isNumberGuessed = false;

        while (!isStillRuning) {

            int drawnNumberByComputer = random.nextInt(1, 101);
            System.out.println("Guess drawn number from 1-100");

            do {
                System.out.println("Your pick:");
                int pickedNumberByUser = scanner.nextInt();

                if (pickedNumberByUser == drawnNumberByComputer) {
                    System.out.println("Congrats, you guessed the right number and its: " + pickedNumberByUser + ".");
                    isNumberGuessed = true;
                } else if (pickedNumberByUser < drawnNumberByComputer) {
                    System.out.println("Drawn number is greater than number you chosen.");
                    System.out.println("Try again.");
                } else if (pickedNumberByUser > 100) {
                    System.out.println("Pick number from range 1-100.");
                } else {
                    System.out.println("Drawn number is lower than number you chosen.");
                    System.out.println("Try again.");
                }
            } while (!isNumberGuessed);

            System.out.println("Do you want to play again? (y/n)");

            String playAgainAnswer = scanner1.nextLine();

            if (playAgainAnswer.equals("n")) {
                isStillRuning = true;
            }
        }
    }
}
