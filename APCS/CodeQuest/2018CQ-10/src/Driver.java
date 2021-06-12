import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args)
    {
        try {
            Scanner infile = new Scanner(new File("Prob10.in.txt"));
            int num = infile.nextInt();
            infile.nextLine();
            for(int i = 0; i < num; i++)
            {
                StringTokenizer st = new StringTokenizer(infile.nextLine(), ",");
                int maxRow = Integer.parseInt(st.nextToken());
                int maxCol = Integer.parseInt(st.nextToken());
                st = new StringTokenizer(infile.nextLine(), ",");
                int startingRow = Integer.parseInt(st.nextToken());
                int startingCol = Integer.parseInt(st.nextToken());
                st = new StringTokenizer(infile.nextLine(), ",");
                int endingRow = Integer.parseInt(st.nextToken());
                int endingCol = Integer.parseInt(st.nextToken());
                boolean[][] positions = new boolean[maxRow+1][maxCol+1];
                if(check(maxRow, maxCol, startingRow, startingCol, endingRow, endingCol, positions))
                {
                    System.out.println("Yes");
                }
                else
                {
                    System.out.println("No");
                }
            }
        }
        catch(Exception e)
        {

        }
    }

    public static boolean check(int maxRow, int maxCol, int curRow, int curCol, int endRow, int endCol, boolean[][]pos)
    {
        if(curRow > maxRow || curCol > maxCol || curRow < 1 || curCol < 1 || pos[curRow][curCol])
        {
            return false;
        }
        if(curRow == endRow && curCol == endCol)
            return true;
        else
        {
            pos[curRow][curCol] = true;
            return(check(maxRow, maxCol, curRow+1,  curCol-1,  endRow, endCol, pos)  ||
                    check(maxRow, maxCol, curRow+1,  curCol+1,  endRow, endCol, pos)  ||
                    check(maxRow, maxCol, curRow-1,  curCol+1,  endRow, endCol, pos)  ||
                    check(maxRow, maxCol, curRow-1,  curCol-1,  endRow, endCol, pos) );
        }
    }
}
