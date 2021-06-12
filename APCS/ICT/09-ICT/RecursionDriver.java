
import java.util.*;

public class RecursionDriver
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Fibonacci term #: ");
        int term = keyboard.nextInt();
        
        System.out.println("Fib value = " + Recursion.fibonacci(term));
        
        System.out.println("Multiplying two integers");
        
        System.out.print("First: ");
        int first = keyboard.nextInt();
        
        System.out.print("Second: ");
        int second = keyboard.nextInt();
        
        System.out.println("The product of " + first + " and " + second
                            + " is " + Recursion.multiplication(first, second));
    }
}

