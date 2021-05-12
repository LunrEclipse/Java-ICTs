public class ArrayList<E>
{
    private E[] myArray;
    private int mySize;

    public ArrayList()
    {
        myArray = (E[])new Object[10];
        mySize = 0;
    }

    public ArrayList(int capacity)
    {
        myArray = (E[])new Object[capacity];
        mySize = 0;
    }

    public int size()
    {
        return mySize;
    }

    public boolean isEmpty()
    {
        return mySize > 0;
    }

    public boolean add(E element)
    {
        add(mySize, element);
        return true;
    }

    public void add(int j, E element)
    {
        if(j >= 0 && j <= mySize)
        {
            if (mySize < myArray.length)
            {
                E temp = myArray[j];
                myArray[j] = element;
                for (int i = j+1; i <= mySize; i++)
                {
                    E cur = myArray[i];
                    myArray[i] = temp;
                    temp = cur;
                }
                mySize++;
            }
            else
            {
                E[] temp = myArray;
                myArray = (E[])new Object[myArray.length * 2];
                myArray[j] = element;
                for(int i = 0; i < temp.length; i++)
                {
                    if(i >= j)
                    {
                        myArray[i+1] = temp[i];
                    }
                    else
                    {
                        myArray[i] = temp[i];
                    }
                }
                mySize++;
            }
        }
        else
            throw new ArrayIndexOutOfBoundsException("Index: " + j + ", Size: "+ mySize);
    }

    public E set(int i, E element)
    {
        if(i < size() && i >= 0)
        {
            E temp = myArray[i];
            myArray[i] = element;
            return temp;
        }
        else
            throw new ArrayIndexOutOfBoundsException("Index: " + i + ", Size: "+ mySize);
    }

    public E get(int i)
    {
        if(i < size() && i >= 0) {
            return myArray[i];
        }
        else
            throw new ArrayIndexOutOfBoundsException("Index: " + i + ", Size: "+ mySize);
    }

    public E remove(int i)
    {
        if(i < size() && i >= 0)
        {
            E removed;
            removed = myArray[i];
            for (int j = i; j < myArray.length - 1; j++)
            {
                myArray[j] = myArray[j + 1];
            }
            myArray[myArray.length - 1] = null;
            mySize--;
            return removed;
        }
        else
            throw new ArrayIndexOutOfBoundsException("Index: " + i + ", Size: "+ mySize);
    }
}