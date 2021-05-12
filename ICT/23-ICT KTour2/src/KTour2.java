import java.util.*;
import java.io.*;

public class KTour2 {

    private int[][] myBoard;
    private int[][] myAccess;
    private int mySteps;
    private int myRow;
    private int myCol;
    private ArrayList<Integer> myVerticalMovements;
    private ArrayList<Integer> myHorizontalMovements;

    public KTour2(String file)
    {
        myBoard = new int[9][9];
        mySteps = 1;
        myRow = 1;
        myCol = 1;
        myBoard[myRow][myCol] = mySteps;
        mySteps++;
        myVerticalMovements = new ArrayList<Integer>();
        myVerticalMovements.addAll(Arrays.asList(1,2,2,1,-1,-2,-2,-1));
        myHorizontalMovements = new ArrayList<Integer>();
        myHorizontalMovements.addAll(Arrays.asList(-2,-1,1,2,2,1,-1,-2));
        myAccess = new int[9][9];
        loadFile(file);
    }

    private void loadFile(String file)
    {
        Scanner inFile;

        try
        {
            inFile = new Scanner(new File(file));
            for(int i = 1; i < myAccess.length; i++)
            {
                for(int j = 1; j< myAccess[i].length; j++)
                {
                    myAccess[i][j] = inFile.nextInt();
                }
            }
        }
        catch(IOException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private boolean move()
    {
        int pos = -1;
        int lowest = Integer.MAX_VALUE;
        for(int i = 0; i < myVerticalMovements.size(); i++)
        {
            int newRow = myRow + myVerticalMovements.get(i);
            int newCol = myCol + myHorizontalMovements.get(i);
            if (newRow >= 1 && newRow <= 8 && newCol >= 1 && newCol <= 8 && myBoard[newRow][newCol] == 0)
            {
                if(myAccess[newRow][newCol] < lowest)
                {
                    lowest = myAccess[newRow][newCol];
                    pos = i;
                }
                myAccess[newRow][newCol] = myAccess[newRow][newCol] - 1;
            }
        }
        if(pos != -1)
        {
            myRow = myRow + myVerticalMovements.get(pos);
            myCol = myCol + myHorizontalMovements.get(pos);
            myBoard[myRow][myCol] = mySteps;
            mySteps++;
            return true;
        }
        else {
            return false;
        }
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
        System.out.println("Total Steps Taken: " + (mySteps-1));
    }

}
