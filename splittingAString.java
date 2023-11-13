import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence (end in .) and a word: ");
        String userInput = input.nextLine();

        String[] sentences = userInput.split("\\.");
        String[] words = sentences[0].split("\\s+"); // Split the first sentence into words

        boolean wordFound = false;
        for (String word : words) {
            if (word.trim().equals(sentences[1].trim())) {
                wordFound = true;
                break;
            }
        }

        if (wordFound) {
            System.out.println("Your word is in your sentence.");
        } else {
            System.out.println("Your word is not in your sentence.");
        }
    }
}
