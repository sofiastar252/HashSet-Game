import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSetGame {
    public static void main(String[] args) {
        // Set of secret words
        Set<String> secretWords = new HashSet<>();
        secretWords.add("fun");
        secretWords.add("happy");
        secretWords.add("excited");
        secretWords.add("sun");
        secretWords.add("sky");

        // Select a single secret word from the set
        String secretWord = getRandomSecretWord(secretWords);

        // Welcome message
        System.out.println("Welcome to the Single-Word HashSet Guessing Game!");
        System.out.println("Try to guess the secret word.");

        // Game loop
        Scanner scanner = new Scanner(System.in);
        boolean guessedCorrectly = false;

        while (!guessedCorrectly) {
            System.out.print("Enter your guess: ");
            String userGuess = scanner.nextLine().toLowerCase();

            if (userGuess.equals(secretWord)) {
                System.out.println("Congratulations! You guessed the correct word: " + userGuess);
                guessedCorrectly = true;
            } else {
                System.out.println("Incorrect guess. Try again!");
            }
        }

        scanner.close();
    }

    private static String getRandomSecretWord(Set<String> words) {
        // Convert the set to an array for easier random selection
        String[] wordArray = words.toArray(new String[0]);

        int randomIndex = (int) (Math.random() * wordArray.length);
        return wordArray[randomIndex];
    }
}
