import java.util.*;
public class MergeSort
{
    public static void merge (List<Comparable> list, int first, int mid, int last)
    {
        int firstSection = first;
        int lastSection = mid + 1;
        List<Comparable> temp = new ArrayList<Comparable>(list);
        for(int i = first; i <= last; i++)
        {
            if(firstSection > mid)
            {
                list.set(i, temp.get(lastSection));
                lastSection++;
            }
            else if(lastSection > last)
            {
                list.set(i, temp.get(firstSection));
                firstSection++;
            }
            else if(temp.get(firstSection).compareTo(temp.get(lastSection)) < 0)
            {
                list.set(i, temp.get(firstSection));
                firstSection++;
            }
            else
            {
                list.set(i, temp.get(lastSection));
                lastSection++;
            }
        }
    }
}
