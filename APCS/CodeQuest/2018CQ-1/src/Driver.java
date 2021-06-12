import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args)
    {
        try {
            Scanner infile = new Scanner(new File("Prob01.in.txt"));
            int num = infile.nextInt();
            for(int i = 0; i < num; i++)
            {
                int cur = infile.nextInt();
                if(cur >= 70)
                    System.out.println("PASS");
                else
                    System.out.println("FAIL");
            }
        }
        catch(Exception e)
        {

        }
    }
}
