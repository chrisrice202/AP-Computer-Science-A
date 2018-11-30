/**
* The purpose of this program is to calculate the average test score or 4 test
*  scores.
* @author Chris Rice
* @version 10/24/2018
*/ 
public class GradesV2
{
    public static void main(String[ ] args)
    {
        //local variables 
        int numTests = 0;      //counts number of tests
        int testGrade = 0;     //individual test grade
        int totalPoints = 0;   //total points for all tests 
        double average = 0.0;  //average grade
        // 1st Test Calculation and Print Statement
        numTests++;
        testGrade = 95;
        totalPoints += testGrade;
        average = totalPoints / numTests;
        System.out.println("Test # " + numTests + "  Test Grade: " + testGrade + "  Total Points: " + totalPoints + "  Average Score: " + average);
        // 2nd Test Calculation and Print Statement
        numTests++;
        testGrade = 73;
        totalPoints += testGrade;
        average = totalPoints / numTests;
        System.out.println("Test # " + numTests + "  Test Grade: " + testGrade + "  Total Points: " + totalPoints + "  Average Score: " + average);
        // 3rd Test Calculation and Print Statement
        numTests++;
        testGrade = 91;
        totalPoints += testGrade;
        average = (double)totalPoints / numTests;
        System.out.println("Test # " + numTests + "  Test Grade: " + testGrade + "  Total Points: " + totalPoints + "  Average Score: " + average);
        // 4th Test Calculation and Print Statement
        numTests++;
        testGrade = 82;
        totalPoints += testGrade;
        average = (double)totalPoints / numTests;
        System.out.println("Test # " + numTests + "  Test Grade: " + testGrade + "  Total Points: " + totalPoints + "  Average Score: " + average);
        // 5th Test Calculation and Print Statement
        numTests++;
        testGrade = 7;
        totalPoints += testGrade;
        average = (double)totalPoints / numTests;
        System.out.println("Test # " + numTests + "  Test Grade: " + testGrade + "  Total Points: " + totalPoints + "  Average Score: " + average);
        // 6th Test Calculation and Print Statement
        numTests++;
        testGrade = 63;
        totalPoints += testGrade;
        average = (double)totalPoints / numTests;
        System.out.println("Test # " + numTests + "  Test Grade: " + testGrade + "  Total Points: " + totalPoints + "  Average Score: " + average);
        // 7th Test Calculation and Print Statement
        numTests++;
        testGrade = 69;
        totalPoints += testGrade;
        average = (double)totalPoints / numTests;
        System.out.println("Test # " + numTests + "  Test Grade: " + testGrade + "  Total Points: " + totalPoints + "  Average Score: " + average);
        // 8th Test Calculation and Print Statement
        numTests++;
        testGrade = 89;
        totalPoints += testGrade;
        average = (double)totalPoints / numTests;
        System.out.println("Test # " + numTests + "  Test Grade: " + testGrade + "  Total Points: " + totalPoints + "  Average Score: " + average);
        // 9th Test Calculation and Print Statement
        numTests++;
        testGrade = 98;
        totalPoints += testGrade;
        average = (double)totalPoints / numTests;
        System.out.println("Test # " + numTests + "  Test Grade: " + testGrade + "  Total Points: " + totalPoints + "  Average Score: " + average);
        
    }//end of main method
}//end of class
