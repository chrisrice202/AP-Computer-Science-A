/**
 * Write a description of class StudentInfoCard here.
 *
 * @author Chris Rice
 * @version 11/26/2018
 */
import java.util.Scanner;
public class TDEE
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double realUserActivityLevel = 0.0;
        
        //Initialize User Variables
        System.out.println("Please enter your name: ");
        String userName = in.nextLine();
        System.out.println("Please enter your BMR: ");
        int bMR = Integer.parseInt(in.nextLine());
        System.out.println("Please enter your gender (M/F): ");
        String gender = in.nextLine();
        System.out.println();
        
        //Activity Level Selection
        System.out.println("Select Your Activity Level");
        System.out.println(" [A] Resting (Sleeping, Reclining)");
        System.out.println(" [B] Sedentary (Minmal Movement)");
        System.out.println(" [C] Light (Sitting, Standing)");
        System.out.println(" [D] Moderate (Light Manual Labor, Dancing, Riding A Bike)");
        System.out.println(" [E] Very Active (Team Sports, Hard Manual Labor)");
        System.out.println(" [F] Extremely Active (Full-time Athlete, Heavy Manual Labor)");
        System.out.println();
        System.out.println("Enter the letter corresponding to your activity level: ");
        String inputUserActivityLevel = in.nextLine();
        
        System.out.println();
        System.out.println();
        System.out.println();
        
        //Calculations       
        if (inputUserActivityLevel.equalsIgnoreCase("a") && gender.equalsIgnoreCase("m"))
            realUserActivityLevel = 1.0;
        else if (inputUserActivityLevel.equalsIgnoreCase("b") && gender.equalsIgnoreCase("m"))
            realUserActivityLevel = 1.3;
        else if (inputUserActivityLevel.equalsIgnoreCase("c") && gender.equalsIgnoreCase("m"))
            realUserActivityLevel = 1.6;
        else if (inputUserActivityLevel.equalsIgnoreCase("d") && gender.equalsIgnoreCase("m"))
            realUserActivityLevel = 1.7;
        else if (inputUserActivityLevel.equalsIgnoreCase("e") && gender.equalsIgnoreCase("m"))
            realUserActivityLevel = 2.1;
        else if (inputUserActivityLevel.equalsIgnoreCase("f") && gender.equalsIgnoreCase("m"))
            realUserActivityLevel = 2.4;
        else if (inputUserActivityLevel.equalsIgnoreCase("a") && gender.equalsIgnoreCase("f"))
            realUserActivityLevel = 1.0;
        else if (inputUserActivityLevel.equalsIgnoreCase("b") && gender.equalsIgnoreCase("f"))
            realUserActivityLevel = 1.3;
        else if (inputUserActivityLevel.equalsIgnoreCase("c") && gender.equalsIgnoreCase("f"))
            realUserActivityLevel = 1.5;
        else if (inputUserActivityLevel.equalsIgnoreCase("d") && gender.equalsIgnoreCase("f"))
            realUserActivityLevel = 1.6;
        else if (inputUserActivityLevel.equalsIgnoreCase("e") && gender.equalsIgnoreCase("f"))
            realUserActivityLevel = 1.9;
        else if (inputUserActivityLevel.equalsIgnoreCase("f") && gender.equalsIgnoreCase("f"))
            realUserActivityLevel = 2.2;
        else
            System.out.println("You did not enter a valid character");
            
        double tDEE = bMR * realUserActivityLevel;
        
        //Printing Results
        System.out.println("Your results:");
        System.out.print("Name: " + userName);
        System.out.println("\t Gender: " + gender);
        System.out.print("BMR: " + bMR);
        System.out.println("\t Activity Factor: " + realUserActivityLevel);
        System.out.print("TDEE: " + tDEE + " calories");
    }
}