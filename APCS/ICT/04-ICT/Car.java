public class Car
{
    private int myStartMiles;
    private int myEndMiles;
    private double myGallonsUsed;
    
    public Car (int odometerReading)
    {
        myStartMiles = odometerReading;
        myEndMiles = odometerReading;
        myGallonsUsed = 0;
    }
    
    public void fillUp(int odometerReading, double gallons)
    {
        myEndMiles = odometerReading;
        myGallonsUsed = myGallonsUsed + gallons;
    }
    
    public double calculateMPG()
    {
        int milesTraveled = myEndMiles - myStartMiles;
        double mpg = milesTraveled/myGallonsUsed;
        return mpg;
    }
    
    public void resetMPG()
    {
        myStartMiles = myEndMiles;
        myGallonsUsed = 0;
    }
    
    public int getCurrentMileage()
    {
        return myEndMiles;
    }
}