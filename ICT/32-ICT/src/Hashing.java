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

    public void search()
    {
        table.print();
        System.out.println();

        int idToFind;
        Item location;

        Scanner console = new Scanner(System.in);

        System.out.println("Testing search algorithm\n");
        System.out.print("Enter Id value to search for (-1 to quit) --> ");
        idToFind = console.nextInt();

        while (idToFind >= 0)
        {
            location = (Item)table.find(new Item(idToFind, 0));
            if (location == null)
                System.out.println("Id = " + idToFind + "  No such part in stock");
            else
                System.out.println("Id = " + location.getId() +
                        "  Inv = " + location.getInv());
            System.out.println();
            System.out.print("Enter Id value to search for (-1 to quit) --> ");
            idToFind = console.nextInt();
        }
    }

    public void stats()
    {
        System.out.print("Percent of Null Pointers: ");
        double percent = (double)table.getNumberOfNulls() / table.getCapacity() * 100;
        System.out.printf("%.2f", percent);
        System.out.println();
        System.out.print("Average Length: ");
        System.out.printf("%.2f", table.getAverageSize());
        System.out.println();
        System.out.println("Longest Linked List: " + table.getLongestList());



    }

    public void loadFile()
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
                table.add(new Item(id, inv));
            }
        }
        catch(IOException i)
        {
            System.out.println("Error: " + i.getMessage());
        }
    }
}