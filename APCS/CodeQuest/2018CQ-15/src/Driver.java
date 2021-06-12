import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args)
    {
        try {
            Scanner infile = new Scanner(new File("Prob15.in.txt"));
            int num = infile.nextInt();
            infile.nextLine();
            for(int i = 0; i < num; i++)
            {
                String test = infile.nextLine();
                for(int j = 0; j < test.length(); j++)
                {
                    int cur = (int)test.charAt(j) - 64;
                    if(cur >=1 && cur <= 5)
                    {
                        cur += 6;
                        while(cur > 26)
                        {
                            cur-=26;
                        }
                        cur += 64;
                        System.out.print((char)cur);
                    }
                    else if(cur >=6 && cur <= 10)
                    {
                        cur = (int)Math.pow(cur, 2);
                        while(cur > 26)
                        {
                            cur-=26;
                        }
                        cur += 64;
                        System.out.print((char)cur);
                    }
                    else if(cur >=11 && cur <= 15)
                    {
                        cur = (cur%3)*5 + 1;
                        while(cur > 26)
                        {
                            cur-=26;
                        }
                        cur += 64;
                        System.out.print((char)cur);
                    }
                    else if(cur >=16 && cur <= 20)
                    {
                        int res = 0;
                        while(cur > 0)
                        {
                            res += cur % 10;
                            cur = cur/10;
                        }
                        res *= 8;
                        while(res > 26)
                        {
                            res-=26;
                        }
                        res += 64;
                        System.out.print((char)res);
                    }
                    if(cur >=21 && cur <= 26)
                    {
                        int res = 0;
                        for(int g = 1; g < cur; g++)
                        {
                            if(cur % g == 0)
                            {
                                res = g;
                            }
                        }
                        res *= 2;
                        while(res > 26)
                        {
                            res-=26;
                        }
                        res += 64;
                        System.out.print((char)res);
                    }
                }
                System.out.println();
            }
        }
        catch(Exception e)
        {

        }
    }
}
