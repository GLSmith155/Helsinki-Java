import java.util.Scanner;
/**
* Write a program that asks the user for an integer and 
* prints the string "Speeding ticket!" if the input is greater than 120.
*
* 
* @author George Smith - Helsinki Part 1
* @version 06/04/2021
*/
public class SpeedingTicket {
/**
* Write a program that asks the user for an integer and 
* prints the string "Speeding ticket!" if the input is greater than 90.
* @param args Command line arguments - not used.
*/
   public static void main(String[] args)
   {
      // User Scanner class to get user input for a message.
      // and assign it to userInput.
      Scanner userInput = new Scanner(System.in);

      try {
      // Ask the user for an integer that represents their car's speed.
      System.out.println("What was your top speed while driving home? ");
      // Read the number written by the user, and assign it to topSpeed.
      int topSpeed = Integer.valueOf(userInput.nextLine());

      // If speed is equal to or greater than 90 give them a ticket.
      if (topSpeed >= 90) {
         System.out.println("Here is a speeding ticket!");
         System.out.println(topSpeed + " is too fast!");
      }
      // Otherwise they are good to go!
      else {
         System.out.println("I will not give you a speeding ticket.");
         System.out.println(topSpeed + " is below the speed limit!");         
        }
      }
      // Closes userInput to prevent resource leak
      finally {
         userInput.close();
              }     
   }
}