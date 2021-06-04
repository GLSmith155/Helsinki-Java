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
      // User Scanner class to get user input for a number.
      Scanner userInput = new Scanner(System.in);

      // Prompt the user for their number.
      System.out.println("Enter a number: ");

      // Assign the user input as an integer
      int number = Integer.valueOf(userInput.nextLine());

      // Print the user's input as an integer after the println below.
      System.out.println("You provided the number " + number);
   }
}
