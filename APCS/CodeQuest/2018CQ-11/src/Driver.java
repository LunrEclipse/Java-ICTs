import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args)
    {
        try {
            Scanner infile = new Scanner(new File("Prob11.in.txt"));
            int num = infile.nextInt();
            infile.nextLine();
            for(int i = 0; i < num; i++)
            {
                StringTokenizer st = new StringTokenizer(infile.nextLine());
                int redChroma = Integer.parseInt(st.nextToken());
                int greenChroma = Integer.parseInt(st.nextToken());
                int blueChroma = Integer.parseInt(st.nextToken());
                int tolChroma = Integer.parseInt(st.nextToken());
                int redFore = Integer.parseInt(st.nextToken());
                int greenFore = Integer.parseInt(st.nextToken());
                int blueFore = Integer.parseInt(st.nextToken());
                int redBack = Integer.parseInt(st.nextToken());
                int greenBack = Integer.parseInt(st.nextToken());
                int blueBack = Integer.parseInt(st.nextToken());
                double value = Math.sqrt(Math.pow(redFore - redChroma, 2) + Math.pow(greenFore - greenChroma, 2)    + Math.pow(blueFore - blueChroma, 2)   );
                if(value <= tolChroma)
                {
                    System.out.println(redBack + " " + greenBack + " " + blueBack);
                }
                else
                {
                    System.out.println(redFore + " " + greenFore + " " + blueFore);
                }
            }
        }
        catch(Exception e)
        {

        }
    }

}
