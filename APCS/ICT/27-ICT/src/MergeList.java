import java.util.*;
import java.io.*;

/**
 *  Implements a recursive mergesort on a LinkedList data type
 *
 * @author     G. Peck
 * @created    July 18, 2002
 *
 * Modified by Jason Quesenberry and Nancy Quesenberry
 * February 9, 2006
 */
public class MergeList{
    private  Scanner inFile;
    private String myFile;

    /**
     *  Open a file containing id/inventory pairs of data
     *
     * @param  fileName  File to be opened
     */
    public MergeList(String fileName){
        myFile = fileName;
    }

    /**
     *  Reads a file containing id/inv data pairs. The first line of the
     *  file contains the number of id/inventory integer pairs listed on
     *  subsequent lines.
     *
     * @param  list  Reference to LinkedList to which data will be added
     */
    public void readData(LinkedList<Item> list){
        int id;
        int inv;

        try{
            inFile = new Scanner(new File(myFile));
            id = inFile.nextInt();
            inv = inFile.nextInt();
            list.add(new Item(id, inv));
            while(inFile.hasNext())
            {
                id = inFile.nextInt();
                inv = inFile.nextInt();
                list.add(new Item(id, inv));
            }



        }catch(IOException i){
            System.out.println("Error: " + i.getMessage());
        }
    }

    /**
     *  Prints contents of list
     *
     * @param  list  linked list to be printed
     */
    public void printList(LinkedList list){


        System.out.printf("%5s%16s","Id","Inventory\n");
        Iterator<Item> itr = list.iterator();
        while(itr.hasNext()) {
            Item temp = itr.next();
            System.out.printf("%7s%10s", temp.getId(), temp.getInv() + "\n");
        }
        System.out.println();
    }


    /**
     *  Splits listA into two parts. listA retains the first
     *  half of the list, listB contains the last half of
     *  the original list.
     *
     * @param  listA    Original list. reduced by half after split.
     * @param  listB    Contains last half of the original list
     */
    public void split(LinkedList<Item> listA, LinkedList<Item> listB){
        int mid = listA.size()/2;
        ListIterator<Item> itr = listA.listIterator(mid);
        while(itr.hasNext())
        {
            listB.addLast(itr.next());
            itr.remove();
        }
    }

    /**
     *  Two linked lists listA and listB are merged into a single
     *  linked list mergedList. They are placed in mergedList starting
     *  with the smallest item on either list and continue working up to
     *  to largest item.
     *
     * @param  listA   LinkedList in nondecreasing order
     * @param  listB   LinkedList in nondecreasing order
     * @return         List  containing all the values from lists listA
     *                 and listB, in nondecreasing order
     */
    public LinkedList<Item> merge(LinkedList<Item> listA, LinkedList<Item> listB){
        // make sure the target list is empty
        LinkedList <Item> mergedList = new LinkedList <Item>();

        ListIterator<Item> itrA = listA.listIterator();
        ListIterator<Item> itrB = listB.listIterator();

        // start at mergedList left and right item

        while(itrA.hasNext() && itrB.hasNext())
        {
            Item itemA = itrA.next();
            Item itemB = itrB.next();
            if(itemA.compareTo(itemB) < 0)
            {
                mergedList.addLast(itemA);
                itrB.previous();
            }
            else
            {
                mergedList.addLast(itemB);
                itrA.previous();
            }
        }


        while(itrA.hasNext())
        {
            mergedList.addLast(itrA.next());
        }
        while(itrB.hasNext())
        {
            mergedList.addLast(itrB.next());
        }
        return mergedList;
    }

    /**
     *  The linked list is returned in sorted order.
     *  Sorted order has the smallest item first and the largest item
     *  last. The ordering is determined by the order defined in the
     *  Comparable class. The method uses the merge sort technique and
     *  must be recursive.
     *
     * @param  listA  LinkedList to be sorted
     * @return        LinkedList in sorted (nondecreasing) order
     */
    public LinkedList<Item> mergeSort(LinkedList <Item> listA)
    {
        LinkedList <Item> listB = new LinkedList <Item>();

        if (listA == null){
            return null;
        }
        // Don't sort an empty list or a list with one node
        if (listA.size() <= 1){
            return listA;
        }

        // Split the list in half.  If uneven then make left one larger.
        split(listA, listB);

        return merge(mergeSort(listA), mergeSort(listB));
    }

    /**
     *  Reverses the order of a list
     *
     * @param  list  LinkedList to be reversed
     * @return       List in reverse order
     */
    public LinkedList<Item> reverseList(LinkedList <Item>list){

        LinkedList <Item> reverseList = new LinkedList <Item>();
        ListIterator<Item> itr = list.listIterator();
        while(itr.hasNext())
            reverseList.addFirst(itr.next());


    return reverseList;


    }
}
