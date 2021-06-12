import kareltherobot.*;

public class HBot extends BetterTurnerRobot
{
    public HBot (int st, int av, Direction dir, int beeps)
    {
        super(st, av, dir, beeps);
    }

    public void makeH()
    {
        makeLine();
        setPosition();       
        makeLine();
        setMiddle();
        goHome();
    }

    private void makeLine()
    {
        putBeeper();
        move();
        putBeeper();
        move(); 
        putBeeper(); 
    }

    private void moveTwice()
    {
        move();
        move();
    }

    private void setPosition()
    {
        turnRight();
        moveTwice();
        turnRight(); 
    }

    private void setMiddle()
    {
        turnAround();
        move();
        turnLeft();
        move();
        putBeeper();
    }

    private void goHome()
    {
        moveTwice();
        turnLeft();
        move();
        turnAround();
    }
}