import java.util.*;
import java.io.*;

public class Item implements Comparable
{
    private int myId;
    private int myInv;

    public Item(int id, int inv)
    {
        myId = id;
        myInv = inv;
    }

    public int getId()
    {
        return myId;
    }

    public int getInv()
    {
        return myInv;
    }

    public int compareTo(Object other)
    {
        return myId - ((Item)other).getId();
    }

    public boolean equals(Object other)
    {
        return (compareTo(other) == 0);
    }

    public String toString()
    {
        return ("  " + myId + "      " + myInv);
    }
}
