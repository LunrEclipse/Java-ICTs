import kareltherobot.*;

public class DiamondPlanter extends BetterTurnerRobot
{
    public DiamondPlanter (int st, int av, Direction dir, int beeps)
    {
        super(st, av, dir, beeps);
    }
    
    public void plantDiamond()
    {
        plantLine();
        plantLine();
        plantLine();
        plantLine();
        goMiddle();
    }
    
    private void goMiddle()
    {
        move();
        move();
        move();
        move();
    }
    
    private void plantLine()
    {
     goDiagonal();
     goDiagonal();
     goDiagonal();
     goDiagonal();
     turnLeft();
    }
    
    private void goDiagonal()
    {
        putBeeper();
        move();
        turnRight();
        move();
        turnLeft();
    }
}