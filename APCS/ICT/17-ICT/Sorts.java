
import java.util.*;

public class Sorts
{
    private long mySteps;   // disregard this for now

    public Sorts()
    {
        mySteps = 0;    // disregard this for now
    }

    public void bubbleSort(List <Comparable> list)
    {
        for (int outer = 0; outer < list.size() - 1; outer++)
        {
            for (int inner = 0; inner < list.size()-outer-1; inner++)
            {
                mySteps += 3;
                if (list.get(inner).compareTo(list.get(inner + 1)) < 0)
                {
                    //swap list[inner] & list[inner+1]
                    mySteps += 4;
                    Comparable temp = list.get(inner);
                    list.set(inner, list.get(inner + 1));
                    list.set(inner + 1, temp);
                }
            }
        }

    } 

    /**
     *  Description of the Method
     *
     * @param  list  reference to an array of integers to be sorted
     */
    public void selectionSort(List <Comparable> list)
    {
        int min;
        Comparable temp;
        for (int outer = 0; outer < list.size() - 1; outer++)
        {
            min = outer;
            for (int inner = outer + 1; inner < list.size(); inner++)
            {
                mySteps += 3;
                if (list.get(inner).compareTo(list.get(min)) < 0)
                    min = inner;  // a new smallest item is found

            }
            //swap list[outer] & list[min]
            temp = list.get(outer);
            list.set(outer, list.get(min));
            list.set(min, temp);
            mySteps += 4;
        }

    }    

    /**
     *  Description of the Method
     *
     * @param  list  reference to an array of integers to be sorted
     */
    public void insertionSort(List <Comparable> list)
    {
        for (int outer = 1; outer < list.size(); outer++){
            int position = outer;
            Comparable key = list.get(position);

            // Shift larger values to the right
            while (position > 0 && list.get(position - 1).compareTo(key) > 0)
            {
                list.set(position, list.get(position - 1));
                position--;
                mySteps += 4;
            }
            list.set(position,  key);
            mySteps+=3;
        }
    }

    //  Recursively divides a list in half, over and over. When the
    //  sublist has one or two values, stop subdividing.

    public void mergeSort(List <Comparable> list, int first, int last)
    {
        if(last - first == 0)
        {
        }
        else if(last - first == 1)
        {
            if(list.get(first).compareTo(list.get(last)) > 0)
            {
                Comparable temp = list.get(first);
                list.set(first, list.get(last));
                list.set(last, temp);
                ///mySteps+=3;
            }
        }
        else
        {
            int mid = (first + last) / 2;
            mergeSort(list, first, mid);
            mergeSort(list, mid+1, last);
            merge(list, first, mid, last);
            //mySteps +=4;
        }
    }

    // creates a copy of ArrayList list called temp, and uses temps values to properly merge(sort) list
    // from first to last 

    public void merge(List<Comparable> list, int first, int mid, int last)   
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
                mySteps +=2;
            }
            else if(lastSection > last)
            {
                list.set(i, temp.get(firstSection));
                firstSection++;
                             mySteps +=3;
            }
            else if(temp.get(firstSection).compareTo(temp.get(lastSection)) < 0)
            {
                list.set(i, temp.get(firstSection));
                firstSection++;
                             mySteps +=4;
            }
            else
            {
                list.set(i, temp.get(lastSection));
                lastSection++;
                             mySteps +=5;
            }
        }
    }

    public void quickSort (List <Comparable> list, int first, int last)
    {
        int g = first, h = last;

        int midIndex = (first + last) / 2;
        Comparable dividingValue = list.get(midIndex);
        do{
            while (list.get(g).compareTo(dividingValue) < 0)
            {g++;
                mySteps++;
            }
            while (list.get(h).compareTo(dividingValue) > 0)
            {h--;
                mySteps++;
            }
            if (g <= h){
                //swap(list[g], list[h]);
                swap(list,g,h);
                g++;
                h--;
                mySteps+=3;
            }
        }while (g < h);
        if (h > first)
        {mySteps++;
            quickSort (list,first,h);
        }
        if (g < last)
        {
            mySteps++;
            quickSort (list,g,last);
        }

    }

    public void swap(List <Comparable> list, int one, int second)
    {
        Comparable temp = list.get(one);
        list.set(one, list.get(second));
        list.set(second, temp);
    }

    /**
     *  Accessor method to return the current value of mySteps
     *
     */
    public long getStepCount()
    {
        return mySteps;
    }

    /**
     *  Modifier method to set or reset the step count. Usually called
     *  prior to invocation of a sort method.
     *
     * @param  stepCount   value assigned to mySteps
     */
    public void setStepCount(long stepCount)
    {
        mySteps = stepCount;
    }   
}
