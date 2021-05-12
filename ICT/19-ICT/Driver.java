public class Driver extends Store
{
  public static void main(String[] args)
  {
    Store testStore = new Store("file50.txt");
    testStore.sort();
    System.out.println(testStore.toString());
    System.out.println("Iterative Search:\n\n");
    testStore.testSearch1();
    
    testStore = new Store();
    testStore.sort();
    testStore.displayStore();
    System.out.println("Recursive Search:\n\n");
    testStore.testSearch2();
  }
}