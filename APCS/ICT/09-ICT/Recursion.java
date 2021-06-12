public class Recursion
{
    public static int fibonacci(int number)
    {
        if (number == 0)
        {
            return 0;
        }
        else if (number == 1)
        {
            return 1;
        }
        else
        {
            return fibonacci(number - 1) + fibonacci(number - 2);
        }
    }
    
    public static int multiplication(int base, int times)
    {
        if(times == 0 || base == 0)
        {
            return 0;
        }
        else if (times < 0)
        {
            return -(multiplication(base, -times));
        }
        else
        {
            return multiplication(base, times - 1) + base;
        }
    }
}