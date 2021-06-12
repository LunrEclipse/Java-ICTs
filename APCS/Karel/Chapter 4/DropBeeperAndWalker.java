import kareltherobot.*;

public class DropBeeperAndWalker extends UrRobot
{
    public DropBeeperAndWalker (int st, int av, Direction dir, int beeps)
    {
        super(st, av, dir, beeps);
    }
    
    public void move()
    {
        putBeeper();
        super.move();
    }
}