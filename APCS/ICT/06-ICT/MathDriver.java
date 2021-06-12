public class MathDriver
{
    public static void main(String[] args)
    {
        System.out.println("Fahrenheit to Celsius Conversions:\n");
        System.out.println("212 F Is Equal To " + MyMath.fToC(212) + " C");
        System.out.println("98.6 F Is Equal To " + MyMath.fToC(98.6) + " C");
        System.out.println("10 F Is Equal To " + MyMath.fToC(10) + " C\n\n");
        
        System.out.println("Celcius to Fahrenheit Conversions:\n");
        System.out.println("-15 C Is Equal To " + MyMath.Ctof(-15) + " F");
        System.out.println("0 C Is Equal To " + MyMath.Ctof(0) + " F");
        System.out.println("70 C Is Equal To " + MyMath.Ctof(70) + " F\n\n");
        
        System.out.println("Volume of a Sphere Calculators:\n");
        System.out.println("The Volume of a Sphere with a Radius of 1.0 is " + MyMath.volumeSphere(1.0));
        System.out.println("The Volume of a Sphere with a Radius of 2.25 is " + MyMath.volumeSphere(2.25));
        System.out.println("The Volume of a Sphere with a Radius of 7.50 is " + MyMath.volumeSphere(7.50));
        
        System.out.println("\n\nHypotenuse Calculations:\n");
         System.out.println("The Hypotenuse of a Triangle with Sides 3.0 and 4.0 are " + MyMath.hypotenuse(3.0 , 4.0));
         System.out.println("The Hypotenuse of a Triangle with Sides 6.75 and 12.31 are " + MyMath.hypotenuse(6.75, 12.31));
         
         System.out.println("\n\nQuadratic Formula Calculations:\n");
          System.out.print("The Roots of x^2 - x - 6 = 0 are ");
          MyMath.roots(1, -1, -6);
          System.out.print("\nThe Roots of x^2 + 1/8 x - 1/32  =  0 are ");
          MyMath.roots(1, (1.0/8), (-1.0/32));
          System.out.print("\nThe Roots of -2x^2 + 5x + 17 = 0 are ");
          MyMath.roots(-2, 5, 17);
    }
}