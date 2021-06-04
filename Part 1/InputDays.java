import java.util.Scanner;
/**
* Write a program that asks the user for a number of days
* and returns information about the number of days the user input.
*
* 
* @author George Smith - Helsinki Part 1
* @version 06/04/2021
*/
public class InputDays {
/**
* Asks for a number of days, then prints the amount of hours.
* @param args Command line arguments - not used.
*/
   public static void main(String[] args)
   {
      // User Scanner class to get user input for a message.
      // and assign it to userInput.
      Scanner userInput = new Scanner(System.in);

      
      // Ask the user for an integer of days since they've exercised.
      System.out.println("How many days has it been since you've exercised? ");
      // Read the number written by the user, and assign it to days.
      int days = Integer.valueOf(userInput.nextLine());

      int hoursInDays = (days * 24);

      // Returns the message of how many hours since they've last exercised
      System.out.println("It has been " + hoursInDays + 
      " hours since you've exercised."); 
      System.out.println("Keep up the good work!");      
   }
}