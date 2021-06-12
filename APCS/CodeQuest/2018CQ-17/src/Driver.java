import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args)
    {
        try {
            Scanner infile = new Scanner(new File("Prob17.in.txt"));
            int num = infile.nextInt();
            infile.nextLine();
            for(int i = 0; i < num; i++)
            {
                String[][] board = new String[3][3];
                String test = infile.nextLine();
                int count = 0;
                for(int j = 0; j < 3; j++)
                {
                    for(int k = 0; k < 3; k++)
                    {
                        board[j][k] = test.substring(count, count+1);
                        count++;
                    }
                }
                if(!board[0][0].equals("-") && board[0][0].equals(board[1][0]) && board[1][0].equals(board[2][0]))
                {
                    System.out.print(test + " = " + board[0][0] + " WINS");
                }
                else if(!board[0][1].equals("-") && board[0][1].equals(board[1][1]) && board[1][1].equals(board[2][1]))
                {
                    System.out.print(test + " = " + board[0][1] + " WINS");
                }
                else if(!board[0][2].equals("-") && board[0][2].equals(board[1][2]) && board[1][2].equals(board[2][2]))
                {
                    System.out.print(test + " = " + board[0][2] + " WINS");
                }
                else if(!board[0][0].equals("-") && board[0][0].equals(board[0][1]) && board[0][1].equals(board[0][2]))
                {
                    System.out.print(test + " = " + board[0][0] + " WINS");
                }
                else if(!board[1][0].equals("-") && board[1][0].equals(board[1][1]) && board[1][1].equals(board[1][2]))
                {
                    System.out.print(test + " = " + board[1][0] + " WINS");
                }
                else if(!board[2][0].equals("-") && board[2][0].equals(board[2][1]) && board[2][1].equals(board[2][2]))
                {
                    System.out.print(test + " = " + board[2][0] + " WINS");
                }
                else if(!board[0][0].equals("-") && board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]))
                {
                    System.out.print(test + " = " + board[0][0] + " WINS");
                }
                else if(!board[0][2].equals("-") && board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0]))
                {
                    System.out.print(test + " = " + board[0][2] + " WINS");
                }
                else
                    System.out.print(test + " = TIE");
                System.out.println();
            }
        }
        catch(Exception e)
        {

        }
    }
}
