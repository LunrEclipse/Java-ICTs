import java.util.Scanner;
public class Main
{
    private Scanner console;
    private ArrayList<String> myList;

    public Main()
    {
        console = new Scanner(System.in);
        myList = new ArrayList<String>();
    }

    public Main(int length)
    {
        console = new Scanner(System.in);
        myList = new ArrayList<String>(length);
    }

    private void singleInput()
    {
        console = new Scanner(System.in);
        System.out.println("All inputs will be added to the list as strings");
        String input;
        do
        {
            System.out.print("Enter String input (-1 to quit): ");
            input = console.nextLine();
            if(input.equals("-1") == false)
                myList.add(input);
        }
        while(input.equals("-1") == false);
    }

    private void doubleInput()
    {
        console = new Scanner(System.in);
        System.out.println("All inputs will be added to the list as strings");
        String input;
        int index;
        do
        {
            console = new Scanner(System.in);
            System.out.print("Enter valid index (-1 to quit): ");
            index = console.nextInt();
            console.nextLine();
            if(index == -1)
                return;
            System.out.print("Enter String input: ");
            input = console.nextLine();
            if(input.equals("-1") == false && index != -1)
            {
                try
                {
                    myList.add(index,input);
                    System.out.println("Object '" + input + "' has been added to slot " + index);
                }
                catch(ArrayIndexOutOfBoundsException e) {
                    System.out.println("Invalid Input. No Objects were added to the list");
                    System.out.println(e);
                }
            }
        }while(index != -1);
    }

    private void set()
    {
        console = new Scanner(System.in);
        String item;
        int index;
        System.out.println("All new inputs will be handled as Strings");
        do
        {
            System.out.print("Enter Valid Index (-1 to quit): ");
            index = console.nextInt();
            console.nextLine();
            if(index == -1)
                return;
            System.out.print("Enter New String: ");
            item = console.nextLine();
            if(item.equals("-1") == false && index != -1) {
                try
                {
                    myList.set(index,item);
                    System.out.println("Object '" + item + "' has been set to slot " + index);
                }
                catch(ArrayIndexOutOfBoundsException e) {
                    System.out.println("Invalid Input. " + item + " was not set to " + index);
                    System.out.println(e);
                }
            }
        }while(index != -1);
    }

    private void printList()
    {
        for(int i = 0; i < myList.size(); i++)
        {
            System.out.println(i + ": " + myList.get(i));
        }
    }

    private void get()
    {
        console = new Scanner(System.in);
        int index;
        do
        {
            System.out.print("Enter input (-1 to quit): ");
            index = console.nextInt();
            if(index != -1)
            {
                try{
                    Object gotten = myList.get(index);
                    System.out.println("Object at index " + index + " is: " + gotten);
                }
                catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("No Object was found at " + index);
                    System.out.println(e);
                }
            }
        }while(index != -1);
    }

    private void remove()
    {
        console = new Scanner(System.in);
        int index;
        do
        {
            System.out.print("Enter input (-1 to quit): ");
            index = console.nextInt();
            if(index != -1)
            {
                try{
                    myList.remove(index);
                    System.out.println("Object at index " + index + " has been removed.");
                }
                catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("Invalid Input");
                    System.out.println(e);
                }
            }
        }while(index != -1);
    }

    public void mainMenu()
    {
        int choice;
        System.out.println("ArrayList Tester Has Been Initiated");
        do
        {
            System.out.println(" (1) Size");
            System.out.println(" (2) isEmpty");
            System.out.println(" (3) Add w/ 1 Parameter");
            System.out.println(" (4) Add w/ 2 Parameter");
            System.out.println(" (5) Set");
            System.out.println(" (6) Get");
            System.out.println(" (7) Remove");
            System.out.println(" (8) Print List");
            System.out.println("(-1) Quit\n");
            System.out.print("Choice ---> ");
            choice = console.nextInt();
            System.out.println();

            if (choice > 0 && choice <= 8)
            {
                switch(choice)
                {
                    case 1:
                        System.out.println("List Size: " + myList.size());
                        break;

                    case 2:
                        if(myList.size() == 0)
                            System.out.println("List is Empty");
                        else
                            System.out.println("List is not Empty");
                        break;

                    case 3:
                        singleInput();
                        break;

                    case 4:
                        doubleInput();
                        break;

                    case 5:
                        set();
                        break;

                    case 6:
                        get();
                        break;

                    case 7:
                        remove();
                        break;

                    case 8:
                        printList();
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

