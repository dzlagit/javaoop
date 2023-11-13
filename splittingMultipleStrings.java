import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence (end in .) and a word: ");
        String userInput = input.nextLine();

        String[] sentences = userInput.split("\\.");
        
        for (int i = 0; i < sentences.length; i++) {
            String[] words = sentences[i].split("\\s+");
            System.out.println(sentences[i]);
        }
    }
}
