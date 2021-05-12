import java.util.*;

/**
 *  Implementation of lists, using singly linked elements.
 *
 * @author     G. Peck
 * @created    April 27, 2002
 *
 * Modified by Jason Quesenberry and Nancy Quesenberry
 * February 9,2006
 */
public class CircularlyLinkedList
{
    private DListNode first;  // first element
    private DListNode last; //last element
    /**
     *  Constructor for the SinglyLinkedList object
     *  Generates an empty list.
     */
    public CircularlyLinkedList()
    {
        first = null;
        last = null;
    }

    public DListNode getFirstNode()
    {
        return first;
    }

    public DListNode getLastNode()
    {
        return last;
    }

    /**
     *  Returns the first element in this list.
     *
     * @return  the first element in the linked list.
     */
    public Object getFirst()
    {
        if (first == null)
        {
            throw new NoSuchElementException();
        }
        else
            return first.getValue();
    }

    public Object getLast()
    {
        if (last == null)
        {
            throw new NoSuchElementException();
        }
        else
            return last.getValue();
    }

    public void addLast(Object value)
    {
        if(last == null && first == null)
        {
            addFirst(value);
        }
        else
        {
            last.setNext(new DListNode(value, first, last));
            last = last.getNext();
            first.setPrevious(last);
        }
    }


    /**
     *  Inserts the given element at the beginning of this list.
     *
     * @param  value  the element to be inserted at the beginning of this list.
     */
    public void addFirst(Object value)
    {
        if(last == null && first == null)
        {
            DListNode temp = new DListNode(value, null, null);
            temp.setNext(temp);
            temp.setPrevious(temp);
            last = temp;
            first = temp;
        }
        else
        {
            first.setPrevious(new DListNode(value, first, last));
            first = first.getPrevious();
            last.setNext(first);
        }

    }

    public int size()
    {
        int count = 0;
        DListNode cur = first;
        boolean run = true;
        while(cur != null && run) {
            cur = cur.getNext();
            count++;
            if(cur == first)
                run = false;
        }
        return count;
    }


    /**
     *  Print the contents of the entire linked list
     */
    public void printList()
    {
        System.out.print("CircularlyLinkedList:\n");
        DListNode cur = first;
        while(cur != null)
        {
            System.out.println(cur.getValue());
            cur = cur.getNext();
            if(cur == first)
                return;
        }
    }

    /**
     *  Returns a string representation of this list. The string
     *  representation consists of the list's elements in order,
     *  enclosed in square brackets ("[]"). Adjacent elements are
     *  separated by the characters ", " (comma and space).
     *
     * @return    string representation of this list
     */
    public String toString()
    {
        String s = "[";

        DListNode temp = first;  // start from the first node
        boolean run = true;
        while (temp != null && run)
        {
            s += temp.getValue(); // append the data
            temp = temp.getNext();      // go to next node
            if (temp != null)
                s += ", ";
            if(temp == first)
                run = false;
        }
        s += "]";
        return s;
    }

    public void insert(Item value)
    {
        if(first == null) {
            addFirst(value);
        }
        else if(value.compareTo((Item)first.getValue()) <= 0)
            addFirst(value);
        else
        {
            DListNode cur = first.getNext();
            while(cur != first && value.compareTo((Item)cur.getValue()) > 0) {
                cur = cur.getNext();
            }
            if(cur == first)
                addLast(value);
            else {
                DListNode previous = cur.getPrevious();
                previous.setNext(new DListNode(value, cur, previous));
                cur.setPrevious(previous.getNext());
            }
        }

    }

    public DListNode find(Item value)
    {
        if(first != null) {
            if (((Item) first.getValue()).compareTo(value) == 0)
                return first;
            DListNode cur = first.getNext();
            while (cur != first) {
                if (((Item) cur.getValue()).compareTo(value) == 0)
                    return cur;
                cur = cur.getNext();
            }
        }
        return null;
    }

    public boolean remove(Item value)
    {
        if(first == null)
            return false;
        DListNode cur = find(value);
        if(cur == null)
            return false;
       // if(cur.getNext() == first && cur.getPrevious() == first && size() == 2)
   /*    if(size == 2)
        {
            DListNode remaining = cur.getPrevious();
            clear();
            addFirst(remaining);
            return true;
        } */
     //  else if(cur.getNext() == first && cur.getPrevious() == first)
         if (first == last)
        {
            clear();
            return true;
        }
      //else if(cur.getNext() == first)
        else if (cur == last)
        {
            DListNode previous = cur.getPrevious();
            previous.setNext(first);
            first.setPrevious(previous);
            last = previous;
            return true;
        }
       // else if(cur.getPrevious() == last)
        else if (cur == first)
        {
            DListNode next = cur.getNext();
            next.setPrevious(last);
            last.setNext(next);
            first = next;
            return true;
        }
        else //if(cur != null)
        {
            DListNode previous = cur.getPrevious();
            DListNode next = cur.getNext();
            previous.setNext(next);
            next.setPrevious(previous);
            return true;
        }
      //  else
       //     return false;
    }

    public void clear()
    {
        first = null;
        last = null;
    }

    public void printBackwards()
    {
        System.out.print("CircularlyLinkedList:\n");
        DListNode cur = last;
        while(cur != null)
        {
            System.out.println(cur.getValue());
            cur = cur.getPrevious();
            if(cur == last)
                return;
        }
    }




}
