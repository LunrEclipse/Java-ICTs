import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args)
    {
        try {
            Scanner infile = new Scanner(new File("Prob08.in.txt"));
            int num = infile.nextInt();
            infile.nextLine();
            for(int i = 0; i < num; i++)
            {
                for(int j = 0; j < 3; j++)
                {
                    double cur = infile.nextDouble();
                    if(cur >= 180.00)
                        cur-= 180;
                    else
                        cur+= 180;
                    System.out.printf("%.2f",cur );
                    System.out.print(" ");
                }
                System.out.println();
                infile.nextLine();
            }
        }
        catch(Exception e)
        {

        }
    }
}
