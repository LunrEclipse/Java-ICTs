/**
   Lab Assignment AB28.1 - Email Directory

   This lab creates a class EMDirectory that stores email addresses
   as strings that are stored and accessed by name. The directory is
   initially setup by passing a file name to a constructor that reads
   the information from that file and creates the directory. The
   email directory is then be able to add additonal names and email addresses,
   lookup the email address that goes with a name, look up all email addresses
   that have names with the same last name, and display all name - email pairs.
 
   @author     G. Peck
   @created    Februrary 22, 2004  
   
   Period 1-7
  
   Sources: Chris Nevison
   
   Modified by Jason Quesenberry and Nancy Quesenberry
   February 6, 2006
 */

import java.util.Set;
import java.util.Iterator;
import java.util.Scanner;

public class EMDirectoryTest
{
  public static void main(String[] args)
  {
    Scanner con = new Scanner(System.in);
    
    String defaultFileName = "emdir.txt";
    System.out.print("Enter the name of the file to read (enter for " +
                       defaultFileName + "): ");
    String fileName = con.nextLine();

    if (fileName.length() == 0)
    {
      fileName = defaultFileName;
    }

    EMDirectory dir = new EMDirectory(fileName);

    String name = "";

    while(!name.equals("quit"))
    {
      System.out.println();
      System.out.print("Enter name (quit to exit): ");
      name = con.nextLine();
      System.out.println();

      if(name.equals("all")){
        dir.listAll();
      }else if(!name.equals("quit")){        
        int space = name.indexOf(" ");
        if(space > 0){
          String fName = name.substring(0, space);
          String lName = name.substring(space+1);
          String emailAddr = dir.lookup(new Name(lName, fName));
          if(emailAddr != null){
            System.out.println(name + " " + emailAddr);
          }else{
            System.out.println(name + " not found");
          }
        }else{
          Set<String> emailSet = dir.lookupLastName(name);
          if(emailSet.size() > 0){
            System.out.println(name);
            Iterator<String> iter = emailSet.iterator();
            while(iter.hasNext())
              System.out.println("   " + iter.next());
          }else{
            System.out.println(name + " not found");
          }
        }
      }
    }
  }
}