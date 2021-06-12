import java.util.*;

public class Searches
{
    private List<Comparable> myList;
    
    public Searches(List<Comparable> list)
    {
        myList = list;
    }
    
    private int bsearch(Comparable toFind, int first, int last)
    {    
        int mid = (first + last) / 2;
        if(first > last)
            return -1;
        else if (myList.get(mid).compareTo(toFind) == 0)
        {
            return mid;
        }
        else if (myList.get(mid). compareTo(toFind) > 0)
        {
            return bsearch(toFind, first, mid - 1);
        }
        else
        {
            return bsearch(toFind, mid+1, last);
        }
    }

    private int bsearchLoop(Comparable toFind)
    {    
        int first = 0;
        int last = myList.size()-1;
        while(first < last)
        {
            int mid = (first + last) / 2;
            if (myList.get(mid).compareTo(toFind) == 0)
            {
                return mid;
            }
            else if (myList.get(mid). compareTo(toFind) > 0)
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
}