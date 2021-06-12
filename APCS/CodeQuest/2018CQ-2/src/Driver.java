import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args)
    {
        try {
            Scanner infile = new Scanner(new File("Prob02.in.txt"));
            int num = infile.nextInt();
            infile.nextLine();
            for(int i = 0; i < num; i++)
            {
                int count = 0;
                String str = infile.nextLine();
                for(int j = 0; j < str.length(); j++)
                {
                    char cur = str.charAt(j);
                    if(cur == 'a' || cur == 'e' || cur == 'i' || cur == 'o' || cur == 'u')
                        count++;
                }
                System.out.println(count);
            }
        }
        catch(Exception e)
        {

        }
    }
}
