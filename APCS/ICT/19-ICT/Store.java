import java.util.*;
import java.io.*;

public class Store{
    private List <Item> myStore;

    public Store(String fName)
    {
        myStore = new ArrayList <Item>();
        loadFile(fName);
    }

    public Store()
    {
        myStore = new ArrayList <Item>();
        loadFile("file50.txt");
    }

    private void loadFile(String inFileName)
    {
        int id;
        int inv;

        Scanner inFile;
        try
        {
            inFile = new Scanner(new File(inFileName));
            id = inFile.nextInt();
            inv = inFile.nextInt();
            myStore.add(new Item(id, inv));
            while(inFile.hasNext())
            {
                inFile.nextLine();
                id = inFile.nextInt();
                inv = inFile.nextInt();
                myStore.add(new Item(id, inv));
            }
        }
        catch(IOException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void displayStore()
    {
        System.out.println(toString());
    }

    public String toString()
    {
        String toPrint = "";
        toPrint += "\tId\tInv\n";
        for(int i = 0; i< myStore.size();i++)
        {
            toPrint += "" + (i+1) + "\t" + myStore.get(i).getId() + "\t" + myStore.get(i).getInv() + "\n";
            if( (i+1) % 10 == 0)
                toPrint += "\n";
        }
        return toPrint;
    }  

    public void sort()
    {
        mergeSort(myStore, 0, myStore.size() - 1);
    }    //to get recursive sort going (call mergeSort)
    private void merge(List <Item> a, int first, int mid, int last)
    {
        int firstSection = first;
        int lastSection = mid + 1;
        List<Item> temp = new ArrayList<Item>(a);
        for(int i = first; i <= last; i++)
        {
            if(firstSection > mid)
            {
                a.set(i, temp.get(lastSection));
                lastSection++;
            }
            else if(lastSection > last)
            {
                a.set(i, temp.get(firstSection));
                firstSection++;
            }
            else if(temp.get(firstSection).compareTo(temp.get(lastSection)) < 0)
            {
                a.set(i, temp.get(firstSection));
                firstSection++;
            }
            else
            {
                a.set(i, temp.get(lastSection));
                lastSection++;
            }
        }
    }

    private void mergeSort(List <Item> a, int first, int last)
    {
        if(last - first == 0)
        {
        }
        else if(last - first == 1)
        {
            if(a.get(first).compareTo(a.get(last)) > 0)
            {
                Item temp = a.get(first);
                a.set(first, a.get(last));
                a.set(last, temp);
            }
        }
        else
        {
            int mid = (first + last) / 2;
            mergeSort(a, first, mid);
            mergeSort(a, mid+1, last);
            merge(a, first, mid, last);
        }
    }

    public void testSearch1(){
        int idToFind;
        int invReturn;
        int index;
        Scanner in = new Scanner(System.in);

        System.out.println("Testing search algorithm\n");
        do{
            System.out.println();
            System.out.print("Enter Id value to search for (-1 to quit) ---> ");
            idToFind = in.nextInt();
            //index = bsearch(new Item(idToFind, 0));
            //recursive version call
            index = bsearch (new Item(idToFind, 0), 0, myStore.size()-1);
            System.out.print("Id # " + idToFind);
            if (index == -1){
                System.out.println("     No such part in stock");
            }else{
                System.out.println("     Inventory = " + myStore.get(index).getInv());
            }
        } while (idToFind >= 0);
    }

    public void testSearch2(){
        int idToFind;
        int invReturn;
        int index;
        Scanner in = new Scanner(System.in);

        System.out.println("Testing search algorithm\n");
        do{
            System.out.println();
            System.out.print("Enter Id value to search for (-1 to quit) ---> ");
            idToFind = in.nextInt();
            index = bsearch(new Item(idToFind, 0));
            //recursive version call
            //index = bsearch (new Item(idToFind, 0), 0, myStore.size()-1);
            System.out.print("Id # " + idToFind);
            if (index == -1){
                System.out.println("     No such part in stock");
            }else{
                System.out.println("     Inventory = " + myStore.get(index).getInv());
            }
        } while (idToFind >= 0);
    }

    /**
     *  Searches the myStore ArrayList of Item Objects for the specified
     *  item object using a iterative binary search algorithm
     *
     * @param  idToSearch  Item object containing id value being searched for
     * @return             index of Item if found, -1 if not found
     */

    private int bsearch(Item idToSearch){
        int first = 0;
        int last = myStore.size()-1;
        while(first <= last)
        {
            int mid = (first + last) / 2;
            if (myStore.get(mid).equals(idToSearch))
            {
                return mid;
            }
            else if (myStore.get(mid).compareTo(idToSearch) > 0)
            {
                last = mid-1;
            }
            else
            {
                first = mid+1;
            }
        }
        return -1;
    }

    /**
     *  Searches the specified ArrayList of Item Objects for the specified
     *  id using a recursive binary search algorithm
     *
     * @param  idToSearch  Id value being search for
     * @param  first       Starting index of search range
     * @param  last        Ending index of search range
     * @return             index of Item if found, -1 if not found
     */

    private int bsearch(Item idToSearch, int first, int last){
        int mid = (first + last) / 2;
        if(first > last)
            return -1;
        else if (myStore.get(mid).compareTo(idToSearch) == 0)
        {
            return mid;
        }
        else if (myStore.get(mid).compareTo(idToSearch) > 0)
        {
            return bsearch(idToSearch, first, mid - 1);
        }
        else
        {
            return bsearch(idToSearch, mid+1, last);
        }
    } 

}
