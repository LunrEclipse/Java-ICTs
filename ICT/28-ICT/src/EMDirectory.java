/**
   Lab Assignment AB28.1 - Email Directory
   
   File Name: EMDirectory.java

   The class EMDirectory stores email addresses as strings that are stored
   and accessed by name. The directory is initially setup in the constructor
   that reads  the information from the indicated file and creates the
   email directory. The email directory is then be able to add additonal names
   and email addresses, lookup the email address that goes with a name,
   look up all email addresses that have names with the same last name,
   and display all name - email pairs.
 
   @author     Your Name Here
   @created    Month ##, ####  
   
   Period ##
  
   Sources: Chris Nevison
   Modifiied by Jason Quesenberry and Nancy Quesenberry
   February 9, 2006
 */
import java.io.*;
import java.util.*;

public class EMDirectory{
  private Map<Name, String> dir;

  /**
     Constructs an empty email directory map.
   */
  public EMDirectory(){
    dir = new TreeMap<Name, String>();
  }

  /**
     Constructs an email directory map by reading name and email
     information from the indicated file name and adding them to the
     email directory map. The name information serves as the key for
     the email address items
   
     @param dirFile - file name containing names and email addresses
   */
  public EMDirectory(String dirFile){
    dir = new TreeMap<Name, String>();

    Scanner in;
    
    try{
    	in = new Scanner(new File(dirFile));
    	while(in.hasNext()){
      		String lastName = "";
      		String firstName = "";
      		String emailAddr = "";
      		if(in.hasNext())
        		firstName = in.next();
      		if(in.hasNext())
        		lastName = in.next();
      		if(in.hasNext())
        		emailAddr = in.next();

      		addEntry(new Name(lastName, firstName), emailAddr);
    	}
    }catch(IOException i){
    	System.out.println("Error: " + i.getMessage());
    }
  }

  /**
     Your description here
   
     @param name  Your description here
     @param emailAddr  Your description here
   */
  public void addEntry(Name name, String emailAddr){
    dir.put(name, emailAddr);
  }

  /**
     Your description here
   
     @param name  Your description here
     @returns  Your description here
   */
  public String lookup(Name name){
    // to be implemented
    return dir.get(name);
  }

  /**
     Your description here
   
     @param lastName  Your description here
     @returns  Your description here
   */
  public Set<String> lookupLastName(String lastName) {
    Set<String> result = new TreeSet<String>();

    Iterator<Name> names = dir.keySet().iterator();
    while(names.hasNext())
    {
        Name cur = names.next();
        if(cur.last().equals(lastName))
            result.add(dir.get(cur));
    }

    
    return result;
  }

  /**
     Your description here
   */
  public void listAll(){
      Iterator<Name> list = dir.keySet().iterator();
      while(list.hasNext())
      {
          Name cur = list.next();
          System.out.println(cur.toString() + " - " + (String)dir.get(cur));
      }
  }
}

