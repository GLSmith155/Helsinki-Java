import java.util.Scanner;
/**
* Write a program that asks the user for a value. 
* The program should then print the value provided by the user.
*
* 
* @author George Smith - Helsinki Part 1
* @version 06/04/2021
*/
public class IntegerInput {
/**
* Asks for a value, then prints the value.
* @param args Command line arguments - not used.
*/
   public static void main(String[] args)
   {
      // User Scanner class to get user input for a message.
      Scanner userInput = new Scanner(System.in);

      // Prompt the user for their message.
      System.out.println("Enter a number: ");

      // Read the string written by the user, and assign it
      int number = Integer.valueOf(userInput.nextLine());

      // Read the string written by the user, and assign it
      System.out.println("You provided the number " + number);
   }
}