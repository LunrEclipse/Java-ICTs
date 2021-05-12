// Implementation of a node of a singly linked list.
public class ListNode
{
  private Object value;
  private ListNode next;

  public ListNode(Object initValue, ListNode initNext)
  // post: constructs a new element with object initValue,
  //       followed by next element
  {
    value = initValue;
    next = initNext;
  }

  public ListNode(Object initValue)
  // post: constructs a new tail of a list with object initValue
  {
      this(initValue, null);
  }

  public Object getValue()
  // post: returns value associated with this element
  {
    return value;
  }

  public ListNode getNext()
  // post: returns reference to next value in list
  {
    return next;
  }

  public void setValue(Object theNewValue)
  {
    value = theNewValue;
  }

  public void setNext(ListNode theNewNext)
  // post: sets reference to new next value
  {
    next = theNewNext;
  }
}