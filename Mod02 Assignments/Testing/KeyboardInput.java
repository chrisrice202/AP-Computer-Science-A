    
    /**
     * Write a description of class testing here.
     *
     * @author (your name)
     * @version (a version number or a date)
     */
    import java.util.Scanner;
    public class KeyboardInput
    {
        public static void main(String [ ] args)
        {
            //construct a Scanner object with two lines        
            Scanner in = new Scanner(System.in);
            String userAge = in.next();
            String ageInYears = Integer.parseInt(userAge);
            double approxAgeInDays = ageInYears * 365.25;
    } //end main method
}//end class
