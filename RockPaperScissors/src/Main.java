import java.util.Random;
import java.util.Scanner;

// Define a class called "Player" to represent a human player in a Rock-Paper-Scissors game.
class Player {
    private String choice; // Declare a private member variable to store the player's choice.

    // A method for the player to make a choice. It takes a Scanner object as input to read user input.
    public void makeChoice(Scanner scanner) {
        while (true) {
            System.out.print("Please enter rock, paper, or scissors: "); // Display a prompt for the player.
            choice = scanner.nextLine().toUpperCase(); // Read the player's input and convert it to uppercase.
            if (isValidChoice(choice)) { // Check if the choice is valid using the isValidChoice method.
                break;
            } else {
                System.out.println("INVALID INPUT - TRY AGAIN!"); // Display an error message for invalid input.
            }
        }
    }

    // A method to retrieve the player's choice.
    public String getChoice() {
        return choice;
    }

    // A private method to check if the player's choice is valid (rock, paper, or scissors).
    private boolean isValidChoice(String choice) {
        return choice.equals("ROCK") || choice.equals("PAPER") || choice.equals("SCISSORS");
    }
}

// Define a class called "Computer" to represent the computer opponent in the game.
class Computer {
    private String choice; // Declare a private member variable to store the computer's choice.

    // A method for the computer to make a random choice between rock, paper, or scissors.
    public void makeChoice() {
        Random random = new Random(); // Create a Random object for generating random numbers.
        int randomNumber = random.nextInt(3) + 1; // Generate a random number between 1 and 3.

        // Use a switch statement to map the random number to a choice (rock, paper, or scissors).
        switch (randomNumber) {
            case 1:
                choice = "ROCK";
                break;
            case 2:
                choice = "PAPER";
                break;
            case 3:
                choice = "SCISSORS";
                break;
        }
    }

    // A method to retrieve the computer's choice.
    public String getChoice() {
        return choice;
    }
}

// Define the main class "RockPaperScissorsGame."
class RockPaperScissorsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read user input.

        System.out.println("\t-----ROCK PAPER SCISSORS-----\n"); // Display a title for the game.

        Player player = new Player(); // Create an instance of the Player class.
        player.makeChoice(scanner); // Prompt the player to make a choice and read the input.

        Computer computer = new Computer(); // Create an instance of the Computer class.
        computer.makeChoice(); // Have the computer make a random choice.

        String playerChoice = player.getChoice(); // Get the player's choice.
        String computerChoice = computer.getChoice(); // Get the computer's choice.

        // Display the choices made by the player and the computer.
        System.out.println("\t\tYOU: " + playerChoice + "\t\t\t\tCOMPUTER: " + computerChoice);

        // Call the determineWinner method to determine the winner of the game.
        determineWinner(playerChoice, computerChoice);
    }

    // A private static method to determine the winner based on the player and computer choices.
    private static void determineWinner(String playerChoice, String computerChoice) {
        if (playerChoice.equals(computerChoice)) {
            System.out.println("It's a tie!"); // Display a message for a tie.
        } else if ((playerChoice.equals("ROCK") && computerChoice.equals("SCISSORS")) ||
                (playerChoice.equals("PAPER") && computerChoice.equals("ROCK")) ||
                (playerChoice.equals("SCISSORS") && computerChoice.equals("PAPER"))) {
            System.out.println("You win!"); // Display a message for the player winning.
        } else {
            System.out.println("Computer wins!"); // Display a message for the computer winning.
        }
    }
}


