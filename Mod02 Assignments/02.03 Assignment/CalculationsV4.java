/**
 * The Calculations class performs addition, subtraction,
 * multiplication, division, and modulus operations on integers and
 * decimals.
 *  
 * @author Chris Rice
 * @version 10/1/2018
 * @date 10/18/2018
 */
public class CalculationsV4
{
    public static void main(String[ ] args)
    {
        System.out.println();
        //First Print Statement
        
        // Addition
        int iNum25 = 25;
        int iNum9 = 9;
        System.out.println("Addition");
        System.out.println( "25 + 9 = " + (iNum25 + iNum9) );
        System.out.println( "43.21 + 3.14 + 10.0 = " + 56.35 );
        System.out.println();
        
        // Subtraction
        int iNum11 = 11;
        System.out.println("Subtraction");
        System.out.println( "11 - 9 - 25 = " + (iNum11 - iNum9 - iNum25) );
        System.out.println( "3.14 - 10.0 = " + 6.84);
        System.out.println();
        
        // Multiplication
        System.out.println("Multiplication");
        System.out.println( "25 * 9 = " + (iNum25 * iNum9)); 
        System.out.println("3.14 * 10.0 * 10.0 = " + 314 );
        System.out.println();
        
        // Division
        System.out.println("Division");
        System.out.println( "9 / 25 = " + (iNum9 / iNum25));
        System.out.println( "43.21 / 10.0 = " + 4.321);
        System.out.println();
         
        // Modulus operator
        System.out.println("Modulus");
        System.out.println( "11 % 9 = " + (iNum11 % iNum9) );
        System.out.println( "10.0 % 3.14 = " + .58 );
        System.out.println();
        
        // 2.03 Additional int Equations
        System.out.println("Additional int Equations");
        System.out.println("11 * 9 - 25 = " + (iNum11 * iNum9 - iNum25));
        System.out.println("11 - 25 * 9 = " + (iNum11 - iNum25 * iNum9));
        System.out.println("11 % 9 / 25 = " + (iNum11 % iNum9 / iNum25));
        
        //2.04 Additional double Equations
        
        //Last Print Statement
        System.out.println();       
    } // end of main method
} // end of class