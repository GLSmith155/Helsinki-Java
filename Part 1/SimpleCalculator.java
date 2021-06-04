import java.util.Scanner;
/**
* Asks the user for two numbers and prints 
* their sum, difference, product, and quotient.
*
* 
* @author George Smith - Helsinki Part 1
* @version 06/04/2021
*/
public class SimpleCalculator {
/**
* Asks the user for two numbers and prints 
* their sum, difference, product, and quotient.
* @param args Command line arguments - not used.
*/
   public static void main(String[] args)
   {
      // User Scanner class to get user input for a message.
      // and assign it to userInput.
      Scanner userInput = new Scanner(System.in);

      
      // Prompt the user for the first number
      System.out.println("Give the first number: ");
      // Read the String written by the user, and assign it
      double firstDouble = Double.valueOf(userInput.nextLine());

      // Prompt the user for the second number
      System.out.println("Give the second number: ");
      // Read the String written by the user, and assign it
      double secondDouble = Double.valueOf(userInput.nextLine());

      // Adds both numbers.
      double sumOfNumbers = firstDouble + secondDouble;
      System.out.println("The sum is: " + sumOfNumbers);

      // Subtracts both numbers.
      double differenceOfNumbers = firstDouble - secondDouble;
      System.out.println("The difference is: " + differenceOfNumbers);
      
      // Multiplies both numbers.
      double productOfNumbers = firstDouble * secondDouble;
      System.out.println("The product is: " + productOfNumbers);

      // Divides both numbers.
      double quotientOfNumbers = firstDouble / secondDouble;
      System.out.println("The quotient is: " + quotientOfNumbers);
   }
}