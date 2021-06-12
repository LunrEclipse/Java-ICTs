import kareltherobot.*;

public class PinSetter extends BetterTurnerRobot
{
    public PinSetter (int st, int av, Direction dir, int beeps)
    {
        super(st, av, dir, beeps);
    }
    
    public void setPins()
    {
        rowOne();
        rowTwo();
        rowThree();
        rowFour();
        goHome();
    }
    
    private void rowOne()
    {
        move();
        putBeeper();
        turnLeft();
        move();
        turnRight();
        move();
    }
    
    private void rowTwo()
    {
        turnRight();
        stepSet();
        putBeeper();
        move();
        turnLeft();
        move();
    }
    
    private void rowThree()
    {
        turnLeft();
        stepSet();
        stepSet();
        putBeeper();
        move();
        turnRight();
        move();
    }
    
    private void rowFour()
    {
       turnRight();
       stepSet();
       stepSet();
       stepSet();
       putBeeper();
    }
    
    private void goHome()
    {
        turnRight();
        move();
        move();
        move();
        move();
        turnRight();
        move();
        move();
        move();
        turnRight();
    }
    
    private void stepSet()
    {
        putBeeper();
        move();
        move();
    }
}