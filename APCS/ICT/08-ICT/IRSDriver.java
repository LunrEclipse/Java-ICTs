
import java.util.*;

public class IRSDriver
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in); // to allow prompting 
        
        System.out.print("Enter marital status (1 = single, 2 = married): ");
        int status = keyboard.nextInt(); // reads the int entered and stores in variable status
        
        System.out.print("Enter taxable income: ");
        double income = keyboard.nextDouble(); // reads the double entered and stores in variable status
        
        // create object, passing in the status and income
        IRS uncleSam = new IRS(status, income);
        double tax = uncleSam.calcTax(); // call method that returns the tax
        
        System.out.print("Your Federal tax = $");
        System.out.printf("%,.2f", tax);  // formats the tax to 2 decimal places, and adds commas where appropriate
    }
}