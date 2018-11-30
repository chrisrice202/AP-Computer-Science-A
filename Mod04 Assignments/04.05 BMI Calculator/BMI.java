
/**
 * This BMI Calculator will calculate a person's BMI
 *
 * @author Chris Rice
 * @version 11/26/2018
 */
import java.util.Scanner;
import java.lang.Math;
public class BMI
{
    public static void main(String[] args)
    {
        String category = "";
        Scanner in = new Scanner(System.in);
        
        //Gather Input
        System.out.println("BMI Calculator");
        System.out.println("==============");
        System.out.println();
        System.out.println("Enter your first and last name (first last)");
        String userName = in.nextLine();
        System.out.println("Enter your height in feet and inches (feet inches)");
        int userFeet = in.nextInt();
        int userInches = in.nextInt();
        int userHeightIn = (userFeet * 12) + userInches;
        double userHeightCm = userHeightIn * 2.54;
        double userHeightMeters = userHeightCm / 100;
        System.out.println("Enter your weight in pounds");
        int userWeightLbs = in.nextInt();
        double userWeightKgs = (double)userWeightLbs * 0.453592;
        
        //Calculate BMI
        double bMI = userWeightKgs / Math.pow(userHeightMeters, 2);
        
        //Determine weight Status
        if (bMI >= 29.9)
            category = "Obese";
        else if (bMI >= 25.0)
            category = "Overweight";
        else if (bMI >= 18.5)
            category = "Normal or Healthy Weiht";
        else 
            category = "UnderWeight";
            
        //Print output
        System.out.println("Name: " + userName);
        System.out.println("Height (m): " + userHeightMeters);
        System.out.println("Weight (km): " + userWeightKgs);
        System.out.println("BMI: " + bMI);
        System.out.println("Category: " + category);
    }    
}    