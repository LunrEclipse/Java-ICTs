/**
 *  Description of the Class
 *
 * @author     G. Peck
 * @created    July 18, 2002
 */

public class Item implements Comparable
{
  private int myId;
  private int myInv;
  private int myHashValue;
  private int myHashValue2;

  /**
   *  Constructor for the Item object
   *
   * @param  id   id value
   * @param  inv  inventory value
   */
  public Item(int id, int inv, int hashValue, int hashValue2)
  {
    myId = id;
    myInv = inv;
    myHashValue = hashValue;
    myHashValue2 = hashValue2;
  }

  /**
   *  Gets the id attribute of the Item object
   *
   * @return    The id value
   */
  public int getId()
  {
    return myId;
  }

  /**
   *  Gets the inv attribute of the Item object
   *
   * @return    The inv value
   */
  public int getInv()
  {
    return myInv;
  }

  public int hashCode()
  {
    /*

    51.50
    int cur = myId;
    float comp = 1;
    while(cur != 0)
    {
      comp += cur % 10;
      cur = cur / 10;
    }
    comp = (float)Math.pow(myId, 2) * comp;
	return (int)(comp % 599);



    51.00
    return comp % 599;


    49.00
    long hash = myId;
    for(int i = 0; i <= myId; i++)
    {
      hash = hash * 33 + i;
    }
    return Math.abs((int)(hash % 599));


    48.50
    long hash = myId;
    for(int i = 0; i <= myId; i++)
    {
      hash = hash * 33 + i;
    }
    hash = Math.abs(hash);
    long reverse = 0;
    while(hash != 0)
    {
      reverse += hash % 10;
      hash = hash / 10;
    }
    reverse += myId;
    return (int)(reverse % 599);


     */

      long hash = myId;
      for(int i = 0; i <= myId; i++)
      {
          hash = hash * myHashValue + myHashValue2; //13 Best
      }
      hash = Math.abs(hash);
      long reverse = 0;
      while(hash != 0)
      {
          reverse += hash % 10;
          hash = hash / 10;
      }
      reverse += myId;
      return (int)(reverse % 599);


  }

  /**
   *  Compares two Item objects by their Id (myId) fields
   *
   * @param  otherObject  Item object to compare to
   * @return              positive int if myId > otherObject.myId
   *                      0 if myId == otherObject.myId
   *                      negative int if myId < otherObject.myId
   */
  public int compareTo(Object otherObject)
  {
    Item other = (Item) otherObject;

    return myId - other.myId;
  }

  /**
   *  Compares the Item to the specified object
   *
   * @param  otherObject  Item object to compare to
   * @return              true if equal, false otherwise
   */
  public boolean equals(Object otherObject)
  {
    return this.compareTo(otherObject) == 0;
    //Item other = (Item)otherObject;
    //return myId == other.myId;
  }

  public String toString()
  {
    return "Id= " + myId + ",Inv= " + myInv;
  }
}

