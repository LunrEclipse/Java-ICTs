import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args)
    {
        try {
            Scanner infile = new Scanner(new File("Prob05.in.txt"));
            int num = infile.nextInt();
            for(int i = 0; i < num; i++)
            {
                int start = infile.nextInt();
                int count = 1;
                int cur = start;
                while(cur != 1)
                {
                    if(cur%2 == 0)
                        cur = cur/2;
                    else
                        cur = cur*3 + 1;
                    count++;
                }
                System.out.println(start + ":" + count);
            }
        }
        catch(Exception e)
        {

        }
    }
}
