import kareltherobot.*;

public class Maze1 implements Directions
{
    public static void main(String[] args)
    {
        MazeWalker jeff;
        jeff = new MazeWalker(2,3,East, 0);        
        while(!jeff.nextToABeeper())
        {
            jeff.followWallRight();
        }
        jeff.pickBeeper();
        jeff.turnOff();
    }
    
    static
    {
        World.reset();
        World.setDelay(1);
        World.readWorld("maze.kwld");
        World.setVisible(true);
    }
}