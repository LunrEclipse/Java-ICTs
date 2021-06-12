import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args)
    {
        try {
            Scanner infile = new Scanner(new File("Prob04.in.txt"));
            int num = infile.nextInt();
            infile.nextLine();
            for(int i = 0; i < num; i++)
            {
                int r = 0;
                int s = 0;
                int p = 0;
                StringTokenizer st = new StringTokenizer(infile.nextLine());
                while(st.hasMoreTokens())
                {
                    String cur = st.nextToken();
                    if(cur.equals("R"))
                        r++;
                    else if(cur.equals("S"))
                        s++;
                    else
                        p++;
                }
                if(r > 0 && s >0 && p >0)
                    System.out.println("NO WINNER");
                else if(r >0 && r<2 && s > 0)
                    System.out.println("ROCK");
                else if(r > 0 && p > 0 && p < 2)
                    System.out.println("PAPER");
                else if(p > 0 && s > 0 && s < 2)
                    System.out.println("SCISSORS");
                else
                    System.out.println("NO WINNER");
            }
        }
        catch(Exception e)
        {

        }
    }
}
