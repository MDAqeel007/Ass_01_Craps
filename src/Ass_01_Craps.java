import java.util.Random;
import java.util.Scanner;
public class Ass_01_Craps {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        String response = "";
        do {
            int die1 = rnd.nextInt(6) + 1;
            int die2 = rnd.nextInt(6) + 1;
            int roll = die1 + die2;

            System.out.println("Roll: " + die1 + " + " + die2 + " = " + roll);

            if (roll == 2 || roll == 3 || roll == 12) {
                System.out.println("Crapped out! You lose.");
            } else if (roll == 7 || roll == 11) {
                System.out.println("Natural! You win!");
            } else {
                int point = roll;
                System.out.println("Point is " + point);

                while (true) {
                    die1 = rnd.nextInt(6) + 1;
                    die2 = rnd.nextInt(6) + 1;
                    roll = die1 + die2;

                    System.out.println("Roll: " + die1 + " + " + die2 + " = " + roll);

                    if (roll == point) {
                        System.out.println("Made point! You win!");
                        break;
                    } else if (roll == 7) {
                        System.out.println("Got a 7! You lose.");
                        break;
                    } else {
                        System.out.println("Trying for point...");
                    }
                }

            }
            System.out.print("Play again? (y/n): ");
            response = input.nextLine();

        } while (response.equalsIgnoreCase("y"));

        System.out.println("Thanks for playing!");
    }
}