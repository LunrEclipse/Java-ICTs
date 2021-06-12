import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args)
    {
        try {
            Scanner infile = new Scanner(new File("Prob09.in.txt"));
            int num = infile.nextInt();
            infile.nextLine();
            for(int i = 0; i < num; i++)
            {
                StringTokenizer st = new StringTokenizer(infile.nextLine(), ",");
                int minuend = Integer.parseInt(st.nextToken());
                int subtrahend = Integer.parseInt(st.nextToken());
                if(subtrahend > minuend)
                {
                    int temp = subtrahend;
                    subtrahend = minuend;
                    minuend = temp;
                }
                int difference = minuend - subtrahend;
                while(difference > 0)
                {
                    System.out.println(minuend + "-" + subtrahend + "=" + difference);
                    minuend = subtrahend;
                    subtrahend = difference;
                    if(subtrahend > minuend)
                    {
                        int temp = subtrahend;
                        subtrahend = minuend;
                        minuend = temp;
                    }
                    difference = minuend - subtrahend;
                }
                System.out.println(minuend + "-" + subtrahend + "=" + difference);
                if(minuend == 1)
                    System.out.println("COPRIME");
                else
                    System.out.println("NOT COPRIME");
            }
        }
        catch(Exception e)
        {

        }
    }
}
