import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args)
    {
        try {
            Scanner infile = new Scanner(new File("Prob13.in.txt"));
            int num = infile.nextInt();
            infile.nextLine();
            for(int i = 0; i < num; i++)
            {
                int people = infile.nextInt();
                infile.nextLine();
                ArrayList<ArrayList<String>> info = new ArrayList<ArrayList<String>>();
                String cur = infile.nextLine();
                cur = cur.replaceAll("\\[", "");
                cur = cur.replaceAll("\\]", "");
                StringTokenizer st = new StringTokenizer(cur, ",");
                for(int j = 0; j < people; j++)
                {
                    info.add(new ArrayList<String>());
                }
                for(int j = 0; j < 6; j++)
                {
                    for(int k = 0; k<people; k++)
                    {
                        info.get(k).add(st.nextToken());
                    }
                }
                for(int j = 0; j < people; j++)
                {
                    int res = 0;
                    String name = infile.nextLine();
                    for(int k = 0; k < people; k++)
                    {
                        if(info.get(k).get(0).equals(name))
                            res = k;
                    }
                    System.out.println("Name: " + info.get(res).get(0));
                    System.out.println("Age: " + info.get(res).get(1));
                    System.out.println("Instagram: " + info.get(res).get(2));
                    System.out.println("Twitter: " + info.get(res).get(3));
                    System.out.println("Phone: " + info.get(res).get(4));
                    System.out.println("Email: " + info.get(res).get(5));
                }
            }
        }
        catch(Exception e)
        {

        }
    }

}
