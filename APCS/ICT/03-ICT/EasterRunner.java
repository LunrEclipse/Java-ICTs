import java.util.Scanner;

public class EasterRunner
{
    public static void main(String[] args)  
    {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = reader.nextInt();
        Easter test; 
        test = new Easter (year);
        test.calculate();
        reader.close();
    }
}