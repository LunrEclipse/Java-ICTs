import kareltherobot.*;

public class CarpetDriver implements Directions
{
    public static void main(String[] args)
    {
        CarpetPlanter bot1;
        bot1 = new CarpetPlanter(1,1,East, 8);
        bot1.carpetRoom();
        bot1.carpetRoom();
        bot1.carpetRoom();
        bot1.carpetRoom();
        bot1.carpetRoom();
        bot1.carpetRoom();
        bot1.carpetRoom();
        bot1.carpetRoom();
        bot1.move();
        bot1.turnOff();
    }
    
    static
    {
        World.reset();
        World.setDelay(1);
        World.readWorld("ch5_11.kwld");
        World.setVisible(true);
    }
}