/**
 *  Description of the Class
 *
 * @author     G. Peck
 * @created    July 18, 2002
 *
 * Modified by Jason Quesenberry and Nancy Quesenberry
 * February 9, 2006
 *
 */
import java.io.*;
import java.util.*;

public class HeapSort
{
  private PriorityQueue <Item> myHeapPQ;
  private Scanner console;


  public HeapSort() throws IOException {
    myHeapPQ = new PriorityQueue <Item>();
    console = new Scanner(System.in);
  }

  private void loadFile(String fileName){
    int id, inv;
    Scanner inFile;
	try{
   		inFile = new Scanner(new File(fileName));

    	while(inFile.hasNext()){
    		id = inFile.nextInt();
      		inv = inFile.nextInt();
      		myHeapPQ.add(new Item(id, inv));
    	}
    }catch(IOException i){
    	System.out.println("Error: " + i.getMessage());
    }
  }

  private void add() {
      console = new Scanner(System.in);
      System.out.println("All inputs will be added as Items");
      int id;
      int inv;
      do {
          console = new Scanner(System.in);
          System.out.print("Enter valid ID (-1 to quit): ");
          id = console.nextInt();
          console.nextLine();
          if (id <= -1)
              return;
          System.out.print("Enter inv: ");
          inv = console.nextInt();
          console.nextLine();
          if (inv != -1 && id != -1) {
              Item cur = new Item(id, inv);
              myHeapPQ.add(cur);
              System.out.println("Item: " + cur + "' has been added");
          }
      } while (id != -1);
  }

    public void mainMenu()
    {
        int choice;
        System.out.println("PriorityQueue Tester Has Been Initiated");
        do
        {
            System.out.println(" (1) Add");
            System.out.println(" (2) isEmpty");
            System.out.println(" (3) Peek");
            System.out.println(" (4) Remove");
            System.out.println(" (5) LoadFile");
            System.out.println("(-1) Quit\n");
            System.out.print("Choice ---> ");
            choice = console.nextInt();
            System.out.println();

            if (choice > 0 && choice <= 8)
            {
                switch(choice)
                {
                    case 1:
                        add();
                        break;

                    case 2:
                        if(myHeapPQ.isEmpty())
                            System.out.println("List is Empty");
                        else
                            System.out.println("List is not Empty");
                        break;

                    case 3:
                        if(myHeapPQ.peek() == null)
                        {
                            System.out.println("\nPeek: " + myHeapPQ.peek() + "");
                            System.out.println("Queue is Empty\n");
                        }
                        else {
                            System.out.println("\nPeek: " + myHeapPQ.peek() + "\n");
                        }
                        break;

                    case 4:
                        try{
                            System.out.println("\nRemoved:" + myHeapPQ.remove() + "\n");
                        }
                        catch(NoSuchElementException e)
                        {
                            System.out.println("\nPriority Queue is Empty\n" + e + "\n");
                        }
                        break;

                    case 5:
                        loadFile("file20.txt");
                        break;

                }
            }
            else if(choice == -1)
            {
                break;
            }
            else
            {
                System.out.println("Invalid Option Selected");
            }
        }
        while (choice != -1);
    }
  
}