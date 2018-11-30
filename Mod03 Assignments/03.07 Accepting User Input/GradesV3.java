/**
* The purpose of this program is to calculate the average test score (using scanners) of 3 tests
*  scores.
* @author Chris Rice
* @version 11/24/2018
*/ 

import java.util.Scanner;
public class GradesV3
{
    public static void main(String[ ] args)
    {
        //local variables 
        int numTests = 0;      //counts number of tests
        int testGrade = 0;     //individual test grade
        int totalPoints = 0;   //total points for all tests 
        double average = 0.0;  //average grade
        Scanner userScanner = new Scanner(System.in);
        
        // User Info
        System.out.println("What is your name?");
        String userName = userScanner.nextLine();
        System.out.println("What is your subject?");
        String userSubject = userScanner.nextLine();
        System.out.println("Hello " + userName + ", let's find out your test average in " + userSubject + "!");
        System.out.println("Please enter three integer test scores on the same line, seperated by one space each.");
        System.out.println("");
        // 1st Test Calculation and Print Statement
        numTests++;
        int firstScore = Integer.parseInt(userScanner.next());
        totalPoints += firstScore;
        average = totalPoints / numTests;
        System.out.println("Total Points: " + totalPoints);
        System.out.println("Average: " + average);
        System.out.println("");
        // 2nd Test Calculation and Print Statement
        numTests++;
        int secondScore = Integer.parseInt(userScanner.next());
        totalPoints += secondScore;
        average = totalPoints / numTests;
        System.out.println("Total Points: " + totalPoints);
        System.out.println("Average: " + average);
        System.out.println("");
        // 3rd Test Calculation and Print Statement
        numTests++;
        int thirdScore = Integer.parseInt(userScanner.next());
        totalPoints += thirdScore;
        average = totalPoints / numTests;
        System.out.println("Total Points: " + totalPoints);
        System.out.println("Average: " + average);
       
    }//end of main method
}//end of class
