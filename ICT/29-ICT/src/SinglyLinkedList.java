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
public class SinglyLinkedList
{
  private ListNode first;  // first element
  private ListNode last; //last element
  /**
   *  Constructor for the SinglyLinkedList object
   *  Generates an empty list.
   */
  public SinglyLinkedList()
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
        ListNode temp = new ListNode(value, null);
        last = temp;
        first = temp;
      }
      else
      {
        ListNode cur = first;
        while(cur.getNext() != null)
          cur = cur.getNext();
        cur.setNext(new ListNode(value, null));
        last = cur.getNext();
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
      ListNode temp = new ListNode(value, null);
      last = temp;
      first = temp;
    }
    else
    {
      first = new ListNode(value, first);
    }
   
  }

  public int size()
  {
    int count = 0;
    ListNode cur = first;
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
    System.out.print("SinglyLinkedList:\n");
      ListNode cur = first;
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

    ListNode temp = first;  // start from the first node
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
      first = new ListNode(value);
      last = first;
    }
    else if(value.compareTo((Item)first.getValue()) < 0)
      first = new ListNode(value, first);
    else
    {
      ListNode front = first;
      ListNode back = first;
      while(front != null && value.compareTo((Item)front.getValue()) > 0)
      {
        back = front;
        front = front.getNext();
      }
      back.setNext(new ListNode(value, front));
    }
  }

  public ListNode find(Item value)
  {
    ListNode cur = first;
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
    if(((Item)first.getValue()).compareTo(value) == 0) {
      first = first.getNext();
      return true;
    }
    ListNode front = first.getNext();
    ListNode back = first;
    while(front != null)
    {
      if(((Item)front.getValue()).compareTo(value) == 0) {
        back.setNext(front.getNext());
        return true;
      }
      back = front;
      front = front.getNext();
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
    backwards(first);
  }

  public void backwards(ListNode node)
  {
    if(node != null)
   {
      backwards(node.getNext());
      System.out.println(node.getValue());
    }
  }


  
}
