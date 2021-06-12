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
public class DoublyLinkedList
{
    private DListNode first;  // first element
    private DListNode last; //last element
    /**
     *  Constructor for the SinglyLinkedList object
     *  Generates an empty list.
     */
    public DoublyLinkedList()
    {
        first = null;
        last = null;
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
            DListNode temp = new DListNode(value, null, null);
            last = temp;
            first = temp;
        }
        else
        {
            last.setNext(new DListNode(value, null, last));
            last = last.getNext();
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
            last = temp;
            first = temp;
        }
        else
        {
            first.setPrevious(new DListNode(value, first, null));
            first = first.getPrevious();
        }

    }

    public int size()
    {
        int count = 0;
        DListNode cur = first;
        while(cur != null) {
            count++;
            cur = cur.getNext();
        }
        return count;
    }


    /**
     *  Print the contents of the entire linked list
     */
    public void printList()
    {
        System.out.print("DoublyLinkedList:\n");
        DListNode cur = first;
        while(cur != null)
        {
            System.out.println(cur.getValue());
            cur = cur.getNext();
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
        while (temp != null)
        {
            s += temp.getValue(); // append the data
            temp = temp.getNext();      // go to next node
            if (temp != null)
                s += ", ";
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
            DListNode cur = first;
            while(cur != null && value.compareTo((Item)cur.getValue()) > 0) {
                cur = cur.getNext();
            }
            if(cur == null)
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
        DListNode cur = first;
        while(cur != null)
        {
            if(((Item)cur.getValue()).compareTo(value) == 0)
                return cur;
            cur = cur.getNext();
        }
        return null;
    }

    public boolean remove(Item value)
    {
        if(first == null)
            return false;
        DListNode temp = first;
        if(first.getNext() == null && first.getPrevious() == null)
        {
            clear();
            return true;
        }
        if(((Item)temp.getValue()).compareTo(value) == 0 && first.getPrevious() == null)
        {
            DListNode next = temp.getNext();
            next.setPrevious(null);
            first = next;
            return true;
        }


        while(temp.getNext()!= null)
        {
            if(((Item)temp.getValue()).compareTo(value) == 0)
            {
                DListNode previous = temp.getPrevious();
                DListNode next = temp.getNext();
                previous.setNext(next);
                next.setPrevious(previous);
                return true;
            }
            temp = temp.getNext();
        }
        if (((Item)temp.getValue()).compareTo(value) == 0 && temp.getNext() == null)
        {
            DListNode previous = temp.getPrevious();
            previous.setNext(null);
            last = previous;
            return true;
        }
            return false;
    }

    public void clear()
    {
        first = null;
        last = null;
    }

    public void printBackwards()
    {
        System.out.print("DoublyLinkedList:\n");
        DListNode cur = last;
        while(cur != null)
        {
            System.out.println(cur.getValue());
            cur = cur.getPrevious();
        }
    }




}
