/**
 *  Description of the Class
 *
 * @author     G. Peck
 * @created    July 18, 2002
 *
 * Modified by Jason Quesenberry and Nancy Quesenberry
 * February 9, 2006 
 */
import java.util.*;

public class HashTable
{
    private int size;
    private int capacity;
    private ListNode[] myHashTable;

    public HashTable()
    {
        size = 0;
        capacity = 600;
        myHashTable = new ListNode[capacity];
    }

    public HashTable(int numSlots)
    {
        size = 0;
        capacity = numSlots;
        myHashTable = new ListNode[capacity];
    }


    public int getSize()
    {
        return size;
    }

    public int getCapacity()
    {
        return capacity;
    }

    public void add(Object obj)
    {
        // add to array in location determined by call to hashCode()
        int location = ((Item)obj).hashCode();
        myHashTable[location] = new ListNode(obj, myHashTable[location]);
        size++;
    }

    public Object find(Comparable target)
    {
        // will attempt to find idToFind in table, if found return inv amount,
        // else return null  (use hashCode to find location, if it's in there)
        int location = ((Item)target).hashCode();
        if(myHashTable[location] != null)
        {
            ListNode cur = myHashTable[location];
            while(cur != null)
            {
                Item now = (Item)cur.getValue();
                if(  now.compareTo(target)  == 0 )
                {
                    return now;
                }
                cur = cur.getNext();
            }
        }
        return null;
    }

    public int getNumberOfNulls()
    {
        int count = 0;
        for(int i = 0; i < myHashTable.length; i++)
        {
            if(myHashTable[i] == null)
                count++;
        }
        return count;
    }

    public int getLongestList ()
    {
        int longest = 0;
        for(int i = 0; i < myHashTable.length; i++)
        {
            int cur = 0;
            if(myHashTable[i] != null)
            {
                ListNode now = myHashTable[i];
                while(now != null)
                {
                    cur++;
                    now = now.getNext();
                }
            }
            if(cur > longest)
                longest = cur;
        }
        return longest;
    }

    public double getAverageSize()
    {
        return (double)size / (capacity - getNumberOfNulls());
    }

    public void print()
    {
        for(int i = 0; i < myHashTable.length; i++)
        {
            System.out.print(i+1 + ": ");
            if (myHashTable[i] != null)
            {
                ListNode now = myHashTable[i];
                while (now != null)
                {
                    System.out.print(now.getValue() + "\t");
                    now = now.getNext();
                }
            }
            System.out.println();
        }
    }
}