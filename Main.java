import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        guessingNumberGame();
    }

    public static void guessingNumberGame() {
        Scanner scanner = new Scanner(System.in);

        // Mystery number
        int fogNumber = 1 + (int) (Math.random() * 100);
        // Number of tries
        int T = 5;

        System.out.println("Guess a number between 1 and 100.");
        System.out.println("You have " + T + " tries.");

        for(int i = 0; i<T; i ++) {
            System.out.println("Enter a number: ");
            int guess = scanner.nextInt();

            if(guess == fogNumber) {
                System.out.println("Bullseye");
                scanner.close();

                return;
            } else if (guess < fogNumber) {
                System.out.println("Too small");
            } else {
                System.out.println("Too Big");
            }
        }

        System.out.println("Attempts are out. Correct number was " +  fogNumber);
            scanner.close();
    }
}