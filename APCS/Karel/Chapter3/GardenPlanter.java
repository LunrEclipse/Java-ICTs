import kareltherobot.*;

public class GardenPlanter extends BetterTurnerRobot
{
    public GardenPlanter (int st, int av, Direction dir, int beeps)
    {
        super(st, av, dir, beeps);
    }
    
    public void plantGarden()
    {
        setPosition();
        plantSection();
        plantSection();
        plantSection();
        plantSection();
        setPosition();
    }
    
    private void setPosition()
    {
        turnAround();
        move();
        move();
        move();
    }
    
    private void plantSection()
    {
        move();
        putBeeper();
        turnRight();
        plantLine();
        turnLeft();
        plantLine();
        turnRight();
    }
    
    private void plantLine()
    {
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
    }
}