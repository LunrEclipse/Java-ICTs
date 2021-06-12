import com.sun.deploy.security.SelectableSecurityManager;

import java.util.*;
import java.io.*;

public class Life {
    boolean[][] myBoard;

    public Life(String file)
    {
        myBoard = new boolean[22][22];
        loadBoard(file);
    }

    private void loadBoard(String file)
    {
        int row;
        int col;

        Scanner inFile;

        try
        {
            inFile = new Scanner(new File(file));
            while(inFile.hasNextLine())
            {
                row = inFile.nextInt();
                col = inFile.nextInt();
                myBoard[row][col] = true;
            }
        }
        catch(IOException e)
        {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public void nextGeneration()
    {
        boolean[][] nextGen = new boolean[22][22];
        for(int r = 1; r <= 20; r++)
        {
            for(int c = 1; c <= 20; c++)
            {
                int alive = numNeighbors(r,c);
                if(myBoard[r][c])
                {
                    if(alive == 2 || alive == 3)
                        nextGen[r][c] = true;
                }
                else
                {
                    if(alive == 3)
                        nextGen[r][c] = true;
                }
            }
        }

        myBoard = nextGen;
    }

    public int numNeighbors(int row, int col)
    {
        int count = 0;

        for(int i = row - 1; i <= row + 1; i++)
        {
            for(int j = col - 1; j <= col + 1; j++)
            {
                if(myBoard[i][j])
                    count++;
            }
        }
        if(myBoard[row][col])
            count--;
        return count;
    }

    public String toString()
    {
        String res = "";
        res += "      12345678901234567890\n\n";
        for(int r = 1; r <= 20; r++)
        {
            if(r < 10)
                res+= " " + r + "    ";
            else
                res += r + "    ";
            for(int c= 1; c<=20; c++)
            {
                if(myBoard[r][c])
                    res += "*";
                else
                    res+= " ";
            }
            res+="\n";
        }
        return res;
    }

    public int countRow(int num)
    {
        int count = 0;
        for(int c = 1; c <= 20; c++)
        {
            if(myBoard[num][c])
                count++;
        }
        return count;
    }

    public int countCol(int num)
    {
        int count = 0;
        for(int r = 1; r <= 20; r++)
        {
            if(myBoard[r][num])
                count++;
        }
        return count;
    }

    public int totalAlive()
    {
        int count = 0;
        for(int r = 1; r <= 20; r++)
        {
            for(int c = 1; c <= 20; c++)
            {
                if(myBoard[r][c])
                    count++;
            }
        }
        return count;
    }
}
