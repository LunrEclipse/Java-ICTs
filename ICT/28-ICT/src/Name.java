public class Name implements Comparable
{
  private String lastName;
  private String firstName;

  public Name(){
    this("", "");
  }

  public Name(String last, String first){
    lastName = last;
    firstName = first;
  }

  public String last(){
    return lastName;
  }

  public String first(){
    return firstName;
  }
  
  /**
      Compares two Name objects by their Id fields
    
      @param  other  Name object to compare to
      @return        positive int if
                       lastName + firstName > other.lastName + other.firstName
                     0 if
                       lastName + firstName == other.lastName + other.firstName
                     negative int if
                       lastName + firstName > other.lastName + other.firstName
   */
  public int compareTo(Object other){
    Name otherName = (Name)other;
    
    String lastFirst = last() + first();
    return lastFirst.compareTo(otherName.last() + otherName.first());
  }

  /**
      Compares the Name to the specified object
   
      @param  otherObject  Name object to compare to
      @return              true if equal, false otherwise
   */
  public boolean equals(Object otherObject){
    return this.compareTo(otherObject) == 0;
  }
  
  public String toString(){
    return first() + " " + last();
  }
}


