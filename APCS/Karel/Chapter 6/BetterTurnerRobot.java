import kareltherobot.*;

public class BetterTurnerRobot extends Robot
{
    public BetterTurnerRobot (int st, int av, Direction dir, int beeps)
    {
        super(st, av, dir, beeps);
    }
    public void turnRight()
    {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void turnAround()
    {
        turnLeft();
        turnLeft();
    }
    public void stepBackward ()
    {
        turnLeft();
        turnLeft();
        move();
        turnLeft();
        turnLeft();
    }
}