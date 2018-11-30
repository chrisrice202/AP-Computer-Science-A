/**
 * Purpose: To buy a clothing item
 *
 * @author Chris Rice
 * @version 11/24/2018
 */
import java.util.Scanner;
import java.text.SimpleDateFormat;  
import java.util.Date;  

public class BuyClothing
{
   public static void main(String[] args){
       //Initializations and Inputs
       Scanner userInput = new Scanner(System.in);
       
       System.out.println("What is your first and last name? (first last)");
       String userFirstName = userInput.next();
       String userLastName = userInput.nextLine();
       
       System.out.println("What is todays date? (In mm/dd/yyyy format)");
       Date userDate = new Date(userInput.nextLine());
       
       System.out.println("What is the name of the item?");
       String userItem = userInput.nextLine();
       
       System.out.println("What is the quantity (integer) and price (decimal) of your clothing item? (quantity price)");
       int userQuantity = Integer.parseInt(userInput.next());
       double userPrice = userInput.nextDouble();
       String restOfLine = userInput.nextLine();
       
       System.out.println("Enter your debit card number (####-###-####): ");
       String userCardNum = userInput.nextLine();
       
       System.out.println("Enter your pin (####): ");
       String userpinNum = userInput.nextLine();
       
       System.out.println("What is the color of your item?");
       String userItemColor = userInput.nextLine();
       
       // Calculations
       SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");
       String userFormatDate = formatter.format(userDate);
       String userFormatName = userFirstName.substring(0, 1) + "." + userLastName;
       String userFormatCardNum = "####-###-" + userCardNum.substring(userCardNum.length() - 5, userCardNum.length());
       double totalCost = userQuantity * userPrice;
       
       //Printing the Receipt
       System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
       System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
       System.out.println("Your e-Receipt");
       System.out.println("");
       System.out.println("Order number: skrt45");
       System.out.println(userFormatDate);
       System.out.println("");
       System.out.println("\t" + userFormatName);
       System.out.println("\tItem: " + userItem);
       System.out.println("\tColor: " + userItemColor);
       System.out.println("\tQuantity: " + userQuantity);  
       System.out.println("\tPrice: $" + userPrice);
       System.out.println("");
       System.out.println("\t$" + totalCost + " will be debited to your account");
       System.out.println("");
       System.out.println("\tThank you, enjoy your " + userItemColor + " " + userItem);
   }
}
