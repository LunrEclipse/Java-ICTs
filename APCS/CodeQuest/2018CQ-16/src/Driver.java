import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args)
    {
        try {
            Scanner infile = new Scanner(new File("Prob16.in.txt"));
            int num = infile.nextInt();
            infile.nextLine();
            for(int i = 0; i < num; i++)
            {
                int startingX = infile.nextInt();
                int startingY = infile.nextInt();
                int points = infile.nextInt();
                int outerCircle = infile.nextInt();
                int innerCircle = infile.nextInt();
                double increment = 360/points;
                double cur = 90;
                infile.nextLine();
                for(int j = 0; j < points; j++)
                {
                    System.out.printf("%.2f",outerCircle * Math.cos(   cur*Math.PI/180   ) + startingX);
                    System.out.print(",");
                    System.out.printf("%.2f",outerCircle * Math.sin(   cur*Math.PI/180  ) + startingY);
                    System.out.print(" ");
                    System.out.printf("%.2f",innerCircle * Math.cos(   (cur + increment/2.0)*Math.PI/180) + startingX);
                    System.out.print(",");
                    System.out.printf("%.2f",innerCircle * Math.sin(   (cur + increment/2.0)*Math.PI/180) + startingY);
                    System.out.print(" ");
                    cur += increment;
                }
                System.out.println();
            }
        }
        catch(Exception e)
        {

        }
    }
}
