import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter multiple sentences split by full stops: ");
        String userInput = input.nextLine();

        String[] sentences = userInput.split("\\.");
        
        for (int i = 0; i < sentences.length; i++) {
            String[] words = sentences[i].split("\\s+");
            System.out.println("Words in sentence " + (i + 1) + ":");
            System.out.println(sentences[i]);
        }
    }
}
