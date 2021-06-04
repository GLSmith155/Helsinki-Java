import java.util.Scanner;
/**
* Write a program that asks the user for a value. 
* The program should then print the value provided by the user.
*
* 
* @author George Smith - Helsinki Part 1
* @version 06/04/2021
*/
public class UserInput {
/**
* Asks for a value, then prints the value.
* @param args Command line arguments - not used.
*/
   public static void main(String[] args)
   {
      // User Scanner class to get user input for a message.
      // and assign it to userInput.
      Scanner userInput = new Scanner(System.in);

      
      // Prompt the user for a String.
      System.out.println("Enter a String: ");
      // Read the String written by the user, and assign it
      String message = userInput.nextLine();

      // Prompt the user for an integer.
      System.out.println("Enter a whole number: ");
      // Read the whole number written by the user, and assign it
      int number = Integer.valueOf(userInput.nextLine());

      // Prompt the user for a double.
      System.out.println("Enter a double: ");
      double floatingPoint = Double.valueOf(userInput.nextLine());

      // Prompt the user for a boolean.
      System.out.println("Enter a boolean: ");
      boolean trueOrFalse = Boolean.valueOf(userInput.nextLine());

      // Read out each value the user gave by type.
      System.out.println("You gave the String " + message);
      System.out.println("You gave the integer " + number);
      System.out.println("You gave the double " + floatingPoint);
      System.out.println("You gave the boolean " + trueOrFalse);
      
   }
}