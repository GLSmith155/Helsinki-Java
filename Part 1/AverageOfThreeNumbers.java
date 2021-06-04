import java.util.Scanner;
/**
* A user inputs three numbers, then an average is returned.
* 
*
* 
* @author George Smith - Helsinki Part 1
* @version 06/04/2021
*/
public class AverageOfThreeNumbers {
/**
* Asks for three values, then returns the average.
* @param args Command line arguments - not used.
*/
   public static void main(String[] args)
   {
      // User Scanner class to get user input for a message.
      // and assign it to userInput.
      Scanner userInput = new Scanner(System.in);

      
      // Prompt the user for a double.
      System.out.println("Give the first number: ");
      // Read the String written by the user, and assign it
      double firstDouble = Double.valueOf(userInput.nextLine());

      // Prompt the user for a double.
      System.out.println("Give the second number: ");
      // Read the String written by the user, and assign it
      double secondDouble = Double.valueOf(userInput.nextLine());

      // Prompt the user for a double.
      System.out.println("Give the third number: ");
      // Read the String written by the user, and assign it
      double thirdDouble = Double.valueOf(userInput.nextLine());      


      double averageThree = ((firstDouble + secondDouble + thirdDouble) / 3);

      // Prints the average of the three numbers.
      System.out.println("The average of your numbers is: " + averageThree);
   }
}