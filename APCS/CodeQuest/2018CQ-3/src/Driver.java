import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args)
    {
        try {
            Scanner infile = new Scanner(new File("Prob03.in.txt"));
            int num = infile.nextInt();
            infile.nextLine();
            for(int i = 0; i < num; i++)
            {
                String test = infile.nextLine();
                int cur = Integer.parseInt(test.substring(0, test.length()-2));
                int last = cur % 10;
                if(last == 1 && cur != 11)
                    System.out.println(cur + "st");
                else if(last == 2 && cur != 12)
                    System.out.println(cur + "nd");
                else if (last == 3 && cur != 13)
                    System.out.println(cur + "rd");
                else
                    System.out.println(cur + "th");
            }
        }
        catch(Exception e)
        {

        }
    }
}
