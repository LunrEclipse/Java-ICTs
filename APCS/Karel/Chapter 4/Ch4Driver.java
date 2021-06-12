import kareltherobot.*;

public class Ch4Driver implements Directions
{
    public static void main(String[] args)  
    {
        MileWalker mileBot;
        mileBot = new MileWalker (1, 1, North, 0);
        mileBot.move();
        mileBot.turnOff();
        DropBeeperAndWalker beeperBot;
        beeperBot = new DropBeeperAndWalker (1, 4, North, 10);
        beeperBot.move();
        beeperBot.move();
        beeperBot.move();
        beeperBot.move();
        beeperBot.turnOff();
        BackwardWalker backwardBot;
        backwardBot = new BackwardWalker (5 , 7, North, 0);
        backwardBot.move();
        backwardBot.move();
        backwardBot.move();
        backwardBot.move();
        backwardBot.turnOff();
    }

    static
    {
        World.reset();
        World.setDelay(10);
        World.setVisible(true);        
    }
}