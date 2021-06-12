import java.util.*;
import java.io.*;

public class Driver
{
    public static void main(String[] args)
    {
        LinkedList<Item> myList = new LinkedList<Item>();
        MergeList test = new MergeList("file20.txt");
        test.readData(myList);
        test.printList(myList);
        myList = test.mergeSort(myList);
        test.printList(myList);
        myList = test.reverseList(myList);
        test.printList(myList);
    }
}