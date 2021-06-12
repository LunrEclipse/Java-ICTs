import kareltherobot.*;

public class Maze2 implements Directions
{
    public static void main(String[] args)
    {
        MazeWalker jeff;
        jeff = new MazeWalker(1,1,East, 0);        
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
        World.readWorld("maze2.kwld");
        World.setVisible(true);
    }
}