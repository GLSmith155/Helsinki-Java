import java.util.Scanner;
/**
* Asks the user to write a message,
* then the message is printed out.
*
* 
* @author George Smith - Helsinki Part 1
* @version 06/04/2021
*/
public class Message {
/**
* Asks the user for a message, then we print the message.
* @param args Command line arguments - not used.
*/
   public static void main(String[] args)
   {
      // User Scanner class to get user input for a message.
      Scanner userInput = new Scanner(System.in);

      // Prompt the user for their message.
      System.out.println("Write a message: ");

      // Read the string written by the user, and assign it
      String message = userInput.nextLine();

      // Read the string written by the user, and assign it
      System.out.println("Your message is \"" + message +"\"");
   }
}