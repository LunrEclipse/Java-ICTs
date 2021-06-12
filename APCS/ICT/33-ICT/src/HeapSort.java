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
  private String myFile;
  private PrintWriter writer;

  public HeapSort() throws IOException {
    this("file20.txt");
  }

  public HeapSort(String fName) throws IOException {
    myHeapPQ = new PriorityQueue <Item>();
    writer = new PrintWriter(new BufferedWriter(new FileWriter("SortedItems.txt")));
    loadFile(fName);
    myFile = fName;
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

  public void sort(){
	System.out.println("sort");
	while(!myHeapPQ.isEmpty())
    {
        try {
            Item temp = myHeapPQ.remove();
            writer.println(temp);
            System.out.println(temp);
        }
        catch(Error i){
          System.out.println("Error: " + i.getMessage());
      }
    }
      writer.close();
  }
  
}