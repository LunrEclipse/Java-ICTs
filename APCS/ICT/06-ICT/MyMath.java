public class MyMath
{
    public static double fToC(double fahr)
    {
        double cel = (double) 5 / 9 * (fahr - 32);
        return cel;
    }
    
    public static double Ctof(double cel)
    {
        double fahr = ((double) 9/5 * cel) + 32;
        return fahr;
    }
    
    public static double volumeSphere(double radius)
    {
        double volume = (double) 4 / 3 * Math.PI * Math.pow(radius, 3);
        return volume;
    }
    
    public static double hypotenuse(double a, double b)
    {
        double hypotenuse = Math.sqrt(Math.pow(a , 2) + Math.pow(b, 2));
        return hypotenuse;
    }
    
    public static void roots( double a, double b, double c)
    {
        double postiveRoot = (-b + Math.sqrt(Math.pow(b,2) - 4 * a * c)) / (2 * a);
        double negativeRoot = (-b - Math.sqrt(Math.pow(b,2) - 4 * a * c)) / (2 * a);
        System.out.println(postiveRoot + " and " + negativeRoot);
    }
}