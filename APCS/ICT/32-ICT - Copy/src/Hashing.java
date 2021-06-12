/**
 *  Uses a hash-coded data storage method to store items
 *  from a file. a linked list is used as the method for
 *  dealing with collisions
 *
 * @author     G. Peck
 * @created    July 18, 2002
 *
 * Modified by Jason Quesenberry and Nancy Quesenberry
 * February 9, 2006
 */
import java.io.*;
import java.util.Scanner;

public class Hashing
{
    HashTable table;

    final int TABLESIZE = 600;

    public Hashing()
    {
        table = new HashTable(TABLESIZE);
    }


    public double stats()
    {
        return (double)table.getNumberOfNulls() / table.getCapacity();
    }

    public void loadFile(int value, int value2)
    {
        Scanner inFile;

        String fileName = "file400.txt";
        int id, inv;
        try
        {

            inFile = new Scanner(new File(fileName));

            int howMany = inFile.nextInt();
            for (int k = 1; k <= howMany; k++)
            {
                id = inFile.nextInt();
                inv = inFile.nextInt();
                table.add(new Item(id, inv, value, value2));
            }
        }
        catch(IOException i)
        {
            System.out.println("Error: " + i.getMessage());
        }
    }
}