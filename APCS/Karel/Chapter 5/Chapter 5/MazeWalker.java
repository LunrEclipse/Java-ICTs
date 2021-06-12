import kareltherobot.*;

public class MazeWalker extends BetterTurnerRobot
{
public MazeWalker(int st, int ave, Direction dir, int beeps)
    {
        super(st, ave, dir, beeps);
    }    
public void followWallRight()
{
    if(frontIsClear())
    {
        move();
        turnRight();
        if(frontIsClear())
        {
            move();
            turnRight();
            if(frontIsClear())
            {
                move();
            }
            else
            {
                turnLeft();
            }
        }
        else
        {
            turnLeft();
        }
    }
    else
    {
        turnLeft();
    }
}  
}
