import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a list of words split with commas: ");
        String userInput = input.nextLine();

        String[] sentences = userInput.split(",");
        
        
    for (int i = 0; i < Math.min(10, sentences.length); i++) {
            String[] words = sentences[i].split("\\s+");
            System.out.println(sentences[i]);
        }
    }
}
