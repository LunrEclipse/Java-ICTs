public class CarDriver
{
    public static void main(String[] args)  
    {

        Car auto = new Car(15);
        System.out.println("New car odometer reading: " + auto.getCurrentMileage());
        auto.fillUp(150,8);
        System.out.println("Miles per gallon          " + auto.calculateMPG());
        auto.resetMPG();
        auto.fillUp(350, 10);
        auto.fillUp(450, 20);
        System.out.println("Miles per gallon          " + auto.calculateMPG());
        auto.resetMPG();
        auto.fillUp(603, 25.5);
        System.out.println("Miles per gallon          " + auto.calculateMPG());

    }
}