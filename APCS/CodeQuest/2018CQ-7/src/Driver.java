import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args)
    {
        try {
            Scanner infile = new Scanner(new File("Prob07.in.txt"));
            int num = infile.nextInt();
            infile.nextLine();
            for(int i = 0; i < num; i++)
            {
                int run = Integer.parseInt(infile.nextLine());
                boolean isTrue = true;
                ArrayList<Integer> nums = new ArrayList<Integer>();
                for(int j = 1; j<= run; j++)
                {
                    String cur = infile.nextLine().toLowerCase();
                    String rev = "";
                    for(int g = cur.length() - 1; g >=0; g--)
                    {
                        rev += cur.charAt(g);
                    }
                    if(!cur.equals(rev))
                    {
                        isTrue = false;
                        nums.add(j);
                    }
                }
                if(isTrue)
                {
                    System.out.print("True");
                }
                else
                {
                    System.out.print("False - ");
                    for(int g = 0; g < nums.size(); g++)
                    {
                        System.out.print(nums.get(g) + ", ");
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
