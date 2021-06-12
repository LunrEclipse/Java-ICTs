import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args)
    {
        try {
            Scanner infile = new Scanner(new File("Prob14.in.txt"));
            int num = infile.nextInt();
            infile.nextLine();
            for(int i = 0; i < num; i++)
            {
                String upper = "";
                int upperLines = infile.nextInt();
                int upperCur = 0;
                infile.nextLine();
                ArrayList<Integer> upperCount = new ArrayList<Integer>();
                for(int j = 0; j < upperLines; j++)
                {
                    upperCount.add(infile.nextInt());
                }
                int upperCounter = upperCount.get(0);
                infile.nextLine();


                String lower = "";
                int lowerLines = infile.nextInt();
                int lowerCur = 0;
                infile.nextLine();
                ArrayList<Integer> lowerCount = new ArrayList<Integer>();
                for(int j = 0; j < lowerLines; j++)
                {
                    lowerCount.add(infile.nextInt());
                }
                int lowerCounter = lowerCount.get(0);
                infile.nextLine();

                int upperLength = 0;
                int lowerLength = 0;
                while(infile.hasNext())
                {
                    String line = infile.nextLine();
                    System.out.println(line);
                    for(int j = 0; j < line.length(); j++)
                    {
                        char cur = line.charAt(j);
                        if(cur >= 65 && cur <= 90)
                        {
                            upper += cur;
                            upperLength++;
                        }
                        else if(cur >= 97 && cur <= 122)
                        {
                            lower += cur;
                            lowerLength++;
                        }
                        else if(cur == '-')
                        {
                            upper += " ";
                            upperLength++;
                        }
                        else if (cur == '=')
                        {
                            lower += " ";
                            lowerLength++;
                        }

                        if(lowerLength == lowerCounter)
                        {
                            lowerCur++;
                            if(lowerCur < lowerCount.size()) {
                                lowerCounter += lowerCount.get(lowerCur);
                            }
                            lower += "\n";
                        }

                        if(upperLength == upperCounter)
                        {
                            upperCur++;
                            if(upperCur < upperCount.size()) {
                                upperCounter += upperCount.get(upperCur);
                            }
                            upper += "\n";
                        }

                    }
                }
                    System.out.println(upper + "\n");
                    System.out.println(lower);



            }
        }
        catch(Exception e)
        {

        }
    }

}
