import java.util.Scanner;

public class AIChatbot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;

        System.out.println("AI Chatbot Started! Type 'bye' to exit.");

        while (true) {
            System.out.print("You: ");
            input = sc.nextLine().toLowerCase();

            if (input.equals("bye")) {
                System.out.println("Bot: Goodbye! Have a nice day.");
                break;
            } 
            else if (input.contains("hello") || input.contains("hi")) {
                System.out.println("Bot: Hello! How can I help you?");
            } 
            else if (input.contains("name")) {
                System.out.println("Bot: I am a Java AI Chatbot.");
            } 
            else if (input.contains("how are you")) {
                System.out.println("Bot: I am fine. Thank you!");
            } 
            else if (input.contains("time")) {
                System.out.println("Bot: Sorry, I cannot tell time yet.");
            } 
            else {
                System.out.println("Bot: Sorry, I don't understand that.");
            }
        }

        sc.close();
    }
}