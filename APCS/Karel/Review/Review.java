import kareltherobot.*;

public class Review extends BetterTurnerRobot
{
    public Review (int st, int av, Direction dir, int beeps)
    {
        super(st, av, dir, beeps);
    }
    
    public void jumpAndSpin()
    {
        move();
        turnAround();
    }
    
    public void moveFourAndDrop()
    {
        move();
        move();
        move();
        move();
        putBeeper();
    }
}