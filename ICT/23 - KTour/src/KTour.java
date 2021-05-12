import java.util.*;
import java.io.*;

public class KTour {
    private int[][] myBoard;
    private int myStep;
    private int myRow;
    private int myCol;
    private ArrayList<Integer> myVerticalMovements;
    private ArrayList<Integer> myHoritzonalMovements;

    public KTour()
    {
        myBoard = new int[9][9];
        myStep = 1;
        myRow = 1;
        myCol = 1;
        myBoard[myRow][myCol] = myStep;
        myStep++;
        myVerticalMovements = new ArrayList<Integer>();
        myVerticalMovements.addAll(Arrays.asList(1,2,2,1,-1,-2,-2,-1));
        myHoritzonalMovements = new ArrayList<Integer>();
        myHoritzonalMovements.addAll(Arrays.asList(-2,-1,1,2,2,1,-1,-2));
    }

    private boolean move()
    {
        ArrayList<Integer> vertMoves = new ArrayList<Integer>(myVerticalMovements);
        ArrayList<Integer> hortMoves = new ArrayList<Integer>(myHoritzonalMovements);
        while(vertMoves.size() > 0)
        {
            int move = (int)(Math.random() * vertMoves.size());
            int newRow = myRow + vertMoves.get(move);
            int newCol = myCol + hortMoves.get(move);
            if (newRow >= 1 && newRow <= 8 && newCol >= 1 && newCol <= 8 && myBoard[newRow][newCol] == 0)
            {
                myRow = newRow;
                myCol = newCol;
                myBoard[myRow][myCol] = myStep;
                myStep++;
                return true;
            }
            vertMoves.remove(move);
            hortMoves.remove(move);
        }
        return false;
    }

    public void run()
    {
        while(move())
        {

        }
    }

    public void print()
    {
        System.out.printf("%6s", 1);
        for(int i = 2; i <= 8; i++)
            System.out.printf("%5s", i);
        System.out.println();
        System.out.println();
        for(int i = 1; i <= 8; i++)
        {
            System.out.print(i);
            for(int j = 1; j<=8; j++)
            {
                System.out.printf("%5s", myBoard[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Total Steps Taken: " + (myStep-1));
    }


}
