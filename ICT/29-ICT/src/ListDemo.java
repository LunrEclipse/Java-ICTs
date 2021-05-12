import java.util.*;
import java.io.*;

/**
 *  Demonstrates the use of the SinglyLinkedList class.
 *
 * @author     G. Peck
 * @created    May 12, 2002
 */
public class ListDemo
{
  SinglyLinkedList myList;

  public ListDemo()
  {
    myList = new SinglyLinkedList();
  }

  /**
   *  Creates a SinglyLinkedList of 5 Integer nodes
   */
  public void createList()
  {
    for (int k = 1; k < 21; k++){
      myList.addLast(new Integer(k));
    }
  }

  public void loadFile(String file)
  {
    try
    {
      Scanner infile = new Scanner(new File(file));
      while(infile.hasNextInt())
      {
        Item temp = new Item(infile.nextInt(), infile.nextInt());
        myList.addLast(temp);
      }
    }
    catch(Exception e)
    {
      System.out.print("Load File");
    }
  }

  /**
   *  Display the first element of the list
   */
  public void displayFirst()
  {
    System.out.println("First Element: " + myList.getFirst());
  }
  public void displayLast()
  {
    System.out.println("Last Element: " + myList.getLast());
  }

  /**
   *  Print the contents of myList
   */
  public void print()
  {
    myList.printList();
    System.out.println();
  }

  public SinglyLinkedList getMyList()
  {
    return myList;
  }

  
  public void getNodes()
  {
      System.out.println("Number of List Nodes: "+myList.size()); 
  }
}
