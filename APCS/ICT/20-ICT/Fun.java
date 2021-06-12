import java.util.*;
import java.io.*;

public class Fun
{
    public static void readFromFile()
    {
        try
        {
            Scanner infile = new Scanner(new File("fun.txt"));
            while(infile.hasNextLine())            
                System.out.println(infile.nextLine());
            infile.close();
        }
        catch(IOException err)
        {
            System.out.println(err.getMessage());
        }
    }
    
    public static void writeToFile()
    {
        try
        {
            FileWriter writer = new FileWriter(new File("fun.txt"));
            writer.write("hi mom");
            writer.write(System.getProperty("line.separator"));
            writer.write("this is sooooo fun\n");
            writer.write(System.getProperty("line.separator"));
            writer.write("look, mom!  White Daniel is back!!!");
            writer.write(System.getProperty("line.separator"));
            writer.close();
        }
        catch(IOException err)
        {
            System.out.println(err.getMessage());
        }
    }
}