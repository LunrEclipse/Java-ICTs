public class PriorityQueue<E>{
    private ArrayList<E> myQueue;
    public PriorityQueue()
    {
        myQueue = new ArrayList<E>();
        myQueue.add(null);
    }

    public void add(E Item)
    {
        myQueue.add(Item);
        heapUp();
    }

    public boolean isEmpty()
    {
        return (myQueue.size() == 1);
    }

    public E peek()
    {
        if(myQueue.size() == 1)
            return null;
        else
            return myQueue.get(1);
    }

    public E remove()
    {
        if(myQueue.size() == 1)
            throw new java.util.NoSuchElementException();
        E removed = peek();
        if(myQueue.size() == 2)
            return myQueue.remove(1);
        else
            myQueue.set(1, myQueue.remove(myQueue.size()-1));

        heapDown();
        return removed;
    }

    private void heapDown()
    {
        int cur = 1;
        boolean isGreater = true;
        while(cur*2 < myQueue.size() && isGreater)
        {
            if(cur*2+1 < myQueue.size()) {
                if (((Comparable) myQueue.get(cur * 2)).compareTo((Comparable) myQueue.get(cur * 2 + 1)) < 0) {
                    if (((Comparable) myQueue.get(cur)).compareTo((Comparable) myQueue.get(cur * 2)) > 0) {
                        swap(cur, cur * 2);
                        cur = cur * 2;
                    } else
                        isGreater = false;
                } else {
                    if (((Comparable) myQueue.get(cur)).compareTo((Comparable) myQueue.get(cur * 2+1)) > 0) {
                        swap(cur, cur * 2 + 1);
                        cur = cur * 2 + 1;
                    } else
                        isGreater = false;
                }
            }
            else
            {
                if (((Comparable) myQueue.get(cur)).compareTo((Comparable) myQueue.get(cur * 2)) > 0) {
                    swap(cur, cur * 2);
                    cur = cur * 2;
                } else
                    isGreater = false;
            }
        }
    }

    private void heapUp()
    {
        int cur = myQueue.size()-1;
        boolean isSmaller = true;
        while(isSmaller && cur/2 > 0)
        {
            if( ((Comparable)myQueue.get(cur)).compareTo((Comparable)myQueue.get(cur/2)) < 0) {
                swap(cur, cur / 2);
                cur = cur / 2;
            }
            else
                isSmaller = false;
        }
    }


    private void swap(int a, int b)
    {
        E temp = myQueue.get(a);
        myQueue.set(a, myQueue.get(b));
        myQueue.set(b, temp);
    }

}
