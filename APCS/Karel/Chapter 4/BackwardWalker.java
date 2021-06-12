import kareltherobot.*;

public class BackwardWalker extends UrRobot
{
    public BackwardWalker (int st, int av, Direction dir, int beeps)
    {
        super(st, av, dir, beeps);
    }
    
    public void move()
    {
        turnLeft();
        turnLeft();
        super.move();
        turnLeft();
        turnLeft();
    }
}