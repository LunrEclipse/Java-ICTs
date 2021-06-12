import kareltherobot.*;

public class CarpetPlanter extends BetterTurnerRobot
{
public CarpetPlanter(int st, int ave, Direction dir, int beeps)
    {
        super(st, ave, dir, beeps);
    }    
public void carpetRoom()
{
    enterRoom();
    if (isRoom())
    {
        putBeeper();
    }
    exitRoom();
}  

public void enterRoom()
{
    move();
    turnLeft();
    move();
}

public boolean isRoom()
{
    if(!frontIsClear())
    {
        turnLeft();
        if(!frontIsClear())
        {
            turnAround();
            if(!frontIsClear())
            {
                turnLeft();
                return true;
            }
            else
            {
                turnLeft();
                return false;
            }
        }
        else
        {
            turnRight();
            return false;
        }
    }
    else
    {
        return false;
    }
}

public void exitRoom()
{
    turnAround();
    move();
    turnLeft();
}
}
