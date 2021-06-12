public class RegularPolygon{

   private int myNumSides;        // # of sides
   private double mySideLength;   // length of side
   private double myR;            // radius of circumscribed circle
   private double myr;            // radius of inscribed circle
    
   // constructors
   public RegularPolygon()
   {
       myNumSides = 3;
       mySideLength = 1;
       calcr();
       calcR();
   }
   
   public RegularPolygon(int numSides, double sideLength)
   {
       myNumSides = numSides;
       mySideLength = sideLength;
       calcr();
       calcR();
   }

   // private methods
   private void calcr()
   {
       myr = (1.0/2) * mySideLength /Math.tan(Math.PI/myNumSides);
   }
 
   private void calcR()
   {
       myR = (1.0/2) * mySideLength /Math.sin(Math.PI/myNumSides);       
   }   
   
   // public methods
   public double vertexAngle()
   {
       return ((((double)myNumSides - 2) / myNumSides) * 180);
   }

   public double perimeter()
   {
       return (myNumSides * mySideLength);
   }
   
   public double area()
   {
       return((1.0/2) * myNumSides * Math.pow(myR,2) * Math.sin((2 * Math.PI)/myNumSides));
   }

   public int getNumSides()
   {
       return myNumSides;
   }

   public double getSideLength()
   {
       return mySideLength;
   }
   
   public double getR()
   {
       return myR;
   }
   
   public double getr()
   {
       return myr;
   }
}
