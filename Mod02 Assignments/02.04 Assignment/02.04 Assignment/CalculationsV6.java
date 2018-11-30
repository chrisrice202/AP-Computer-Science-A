/**
 * The Calculations class performs addition, subtraction,
 * multiplication, division, and modulus operations on integers and
 * decimals.
 *  
 * @author Chris Rice
 * @version 10/18/2018
 */
public class CalculationsV6
{
    public static void main(String[ ] args)
    {
        System.out.println();
        //First Print Statement
        
        // Addition
        int iNum25 = 25;
        int iNum9 = 9;
        double dNum4321 = 43.21;
        double dNum314 = 3.14;
        double dNum10 = 10;
        
        System.out.println("Addition");
        System.out.println( "25 + 9 = " + (iNum25 + iNum9) );
        System.out.println( dNum4321 + " + " + dNum314 + " + " + dNum10 + " = " + (dNum4321 + dNum314 + dNum10) );
        System.out.println();
        
        // Subtraction
        int iNum11 = 11;
        
        System.out.println("Subtraction");
        System.out.println( "11 - 9 - 25 = " + (iNum11 - iNum9 - iNum25) );
        System.out.println( dNum314 + " - " + dNum10 + " = " + (dNum314 - dNum10));
        System.out.println();
        
        // Multiplication
        System.out.println("Multiplication");
        System.out.println( "25 * 9 = " + (iNum25 * iNum9)); 
        System.out.println( dNum314 + " * " + dNum10 + " * " + dNum10 + " = " + (dNum314 * dNum10 * dNum10) ); 
        System.out.println();
        
        // Division
        System.out.println("Division");
        System.out.println( "9 / 25 = " + (iNum9 / iNum25));
        System.out.println( dNum4321 + " / " + dNum10 + " = " + (dNum4321 / dNum10));
        System.out.println();
         
        // Modulus operator
        System.out.println("Modulus");
        System.out.println( "11 % 9 = " + (iNum11 % iNum9) );
        System.out.println( dNum10 + " % " + dNum314 + " = " + (dNum10 % dNum314) );
        System.out.println();
        
        // 2.03 Additional int Equations
        System.out.println("Additional int Equations");
        System.out.println("11 * 9 - 25 = " + (iNum11 * iNum9 - iNum25));
        System.out.println("11 - 25 * 9 = " + (iNum11 - iNum25 * iNum9));
        System.out.println("11 % 9 / 25 = " + (iNum11 % iNum9 / iNum25));
        
        //2.04 Additional double Equations
        System.out.println("Additional double Equations");
        System.out.println( dNum314 + " + " + dNum10 + " - " + dNum4321 + " = " + (dNum314 + dNum10 - dNum4321));
        System.out.println( dNum314 + " + " + dNum10 + " * " + dNum4321 + " = " + (dNum314 + dNum10 * dNum4321));
        System.out.println( dNum314 + " + " + dNum10 + " / " + dNum4321 + " = " + (dNum314 + dNum10 / dNum4321));
        //Last Print Statement
        System.out.println();       
    } // end of main method
} // end of class