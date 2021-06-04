import java.util.Scanner;
/**
* Write a program that gives a course grade according to the provided table.
*
* 
* @author George Smith - Helsinki Part 1
* @version 06/04/2021
*/
public class GradingScale {
/**
* Write a program that gives a course grade according to the provided table.
* @param args Command line arguments - not used.
*/
   public static void main(String[] args)
   {
      // User Scanner class to get user input for a message.
      // and assign it to userInput.
      Scanner userInput = new Scanner(System.in);

      try {
      // Ask the user for their current point total in the classroom.
      System.out.println("Enter your current point total to see your grade! ");
      // Read the number written by the user, and assign it to totalPoints.
      int totalPoints = Integer.valueOf(userInput.nextLine());

      // If the user input of totalPoints satisfies the If statement
      // a message will print.
      if (totalPoints > 100) {
         System.out.println("Incredible!");
      }
      // Otherwise they are good to go!
      else if ((totalPoints >= 90) && (totalPoints <= 100)) {
         System.out.println("You scored a 5!");        
      }

      else if ((totalPoints >= 80) && (totalPoints <= 89)) {
         System.out.println("You scored a 4!");
      }

      else if ((totalPoints >= 70) && (totalPoints <= 79)) {
         System.out.println("You scored a 3!");
      }

      else if ((totalPoints >= 60) && (totalPoints <= 69)) {
         System.out.println("You scored a 2.");
      }

      else if ((totalPoints >= 50) && (totalPoints <= 59)) {
         System.out.println("You scored a 1.");
      }

      else if ((totalPoints >= 0) && (totalPoints <= 49)) {
         System.out.println("Failed");
      }
      
      else {
         
         System.out.println("That's not a valid score! Try again.");       
           
      }
      
      }
      // Closes userInput to prevent resource leak
      finally {
         userInput.close();
              }     
   }
}