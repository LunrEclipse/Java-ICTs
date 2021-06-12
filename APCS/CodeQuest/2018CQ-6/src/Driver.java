import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args)
    {
        try {
            Scanner infile = new Scanner(new File("Prob06.in.txt"));
            int num = infile.nextInt();
            infile.nextLine();
            for(int i = 0; i < num; i++)
            {
                int status = 0;
                StringTokenizer st = new StringTokenizer(infile.nextLine());
                if(st.nextToken().equals("BROKEN"))
                    status+=8;
                if(st.nextToken().equals("BROKEN"))
                    status+=4;
                if(st.nextToken().equals("BROKEN"))
                    status+=2;
                if(st.nextToken().equals("BROKEN"))
                    status+=1;
                int left = status / 4;
                int right = status % 4;
                if(left == 3)
                    System.out.print("blue ");
                else if (left == 2)
                    System.out.print("green ");
                else if (left == 1)
                    System.out.print("red ");
                else
                    System.out.print("off ");

                if(right == 3)
                    System.out.print("blue\n");
                else if (right == 2)
                    System.out.print("green\n");
                else if (right == 1)
                    System.out.print("red\n");
                else
                    System.out.print("off\n");
            }
        }
        catch(Exception e)
        {

        }
    }
}
