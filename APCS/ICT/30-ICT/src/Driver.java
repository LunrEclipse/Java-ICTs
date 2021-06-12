import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;
import java.io.*;

public class Driver {
    public static void main(String[] args)
    {
        BinarySearchTree3 tree = new BinarySearchTree3();
        Driver.mainMenu(tree);
    }



    public static void mainMenu (BinarySearchTree3 tree){
        String choice;
        Scanner console = new Scanner(System.in);

        do{
            System.out.println("Linked List algorithm menu\n"); //Done
            System.out.println("(1) Read data from disk"); //Done
            System.out.println("(2) Print Preorder"); //Done
            System.out.println("(3) Print InOrder"); //Done
            System.out.println("(4) Print PostOrder"); //Done
            System.out.println("(5) Count Nodes"); //Done
            System.out.println("(6) Count Leaves"); //Done
            System.out.println("(7) Height of Tree"); //Done
            System.out.println("(8) Width of Tree"); //Done
            System.out.println("(9) Clear Tree"); //Done
            System.out.println("(10) Interchange the Tree"); //Done
            System.out.println("(11) Print Level"); //Done
            System.out.println("(12) isAncestor"); //Done
            System.out.println("(13) Delete"); //Done
            System.out.println("(14) Find"); //Done
            System.out.println("(Q) Quit\n");
            System.out.print("Choice ---> ");
            choice = console.nextLine() + " ";  // kludge to ensure choice.charAt(0) > 0
            System.out.println();
            if(choice.charAt(0) == 'Q' || choice.charAt(0) == 'q')
                return;
            int selection = Integer.parseInt(choice.substring(0, choice.length()-1));
            if (selection >= 1 && selection <= 14){
                switch (selection){
                    case 1 : //Option 1: Reading from File
                        try
                        {
                            Scanner infile = new Scanner(new File("fileB.txt"));
                            while(infile.hasNext()){
                                tree.insert(infile.nextLine());
                            }
                        }
                        catch(Exception E)
                        {
                            System.out.println("Error");
                        }
                        break;
                    case 3 : //Printing In Order
                        System.out.println();
                        System.out.println("The tree printed inorder\n");
                        tree.printInorder();
                        System.out.println();
                        break;
                    case 2 : //Printing PreOrder
                        System.out.println();
                        System.out.println("The tree printed preorder\n");
                        tree.printPreOrder();
                        System.out.println();
                        break;
                    case 4 : //Printing PostOrder
                        System.out.println();
                        System.out.println("The tree printed postorder\n");
                        tree.printPostOrder();
                        System.out.println();
                        break;
                    case 5 : //Counting The Nodes In the Tree
                        System.out.println("Number of nodes = " + tree.countNodes());
                        System.out.println();
                        break;
                    case 6 : //Counting the Leaves In the Tree
                        System.out.println("Number of leaves = " + tree.countLeaves());
                        System.out.println();
                        break;
                    case 9 : //Clear Tree
                        System.out.println("Tree Cleared");
                        tree.clearTree();
                        System.out.println();
                        break;
                    case 7 : //Find Height
                        System.out.println("Height = " + tree.height());
                        System.out.println();
                        break;
                    case 8 : //Find Width
                        System.out.println("Width = " + tree.width());
                        System.out.println();
                        break;
                    case 10 : //Interchange
                        System.out.println("Tree Interchanged");
                        tree.interchange();
                        System.out.println();
                        break;
                    case 12: //IsAncestor
                        String ancesetor;
                        String descendant;

                        System.out.println("Is Ancestor\n");
                        System.out.print("Enter Ancestor (-1 To Quit) --> ");
                        ancesetor = console.nextLine().toUpperCase();
                        if(ancesetor.equals("-1"))
                            break;
                        System.out.print("Enter Descendant (-1 To Quit) --> ");
                        descendant = console.nextLine().toUpperCase();

                        while (!ancesetor.equals("-1") && !descendant.equals("-1")){

                            if (tree.isAncestor(ancesetor, descendant))
                                System.out.println(ancesetor + " Is an Ancestor of " + descendant);
                            else{
                                System.out.println(ancesetor + " Is Not an Ancestor of " + descendant);
                            }
                            System.out.println();
                            System.out.print("Enter Ancestor (-1 To Quit) --> ");
                            ancesetor = console.nextLine().toUpperCase();
                            if(ancesetor.equals("-1"))
                                break;
                            System.out.print("Enter Descendant (-1 To Quit) --> ");
                            descendant = console.nextLine().toUpperCase();
                        }
                        break;
                    case 13: //Delete
                        String toDelete;

                        System.out.println("Testing delete algorithm\n");
                        System.out.print("Enter string to delete (-1 to quit) --> ");
                        toDelete = console.nextLine().toUpperCase();

                        while (!toDelete.equals("-1")){

                            tree.delete(toDelete);
                            System.out.print("Enter string to delete (-1 to quit) --> ");
                            toDelete = console.nextLine().toUpperCase();

                        }
                        break;
                    case 11: //Print Level
                        int printLevel;

                        System.out.println("Print Level\n");
                        System.out.print("Enter Level to Print (-1 to quit) --> ");
                        printLevel = console.nextInt();
                        console.nextLine();

                        while (printLevel >= 0){
                            tree.printLevel(printLevel);
                            System.out.println();
                            System.out.print("Enter Level to Print (-1 to quit) --> ");
                            printLevel = console.nextInt();
                            console.nextLine();
                        }
                        break;

                    case 14: //Find
                        String toFind;

                        System.out.println("Testing Find algorithm\n");
                        System.out.print("Enter string to find (-1 to quit) --> ");
                        toFind = console.nextLine().toUpperCase();

                        while (!toFind.equals("-1")){

                            Object cur = tree.find(toFind);
                            if(cur != null)
                            {
                                System.out.println(toFind + " is in the tree");
                            }
                            else
                            {
                                System.out.println(toFind + " is not in the tree");
                            }
                            System.out.print("Enter string to find (-1 to quit) --> ");
                            toFind = console.nextLine().toUpperCase();

                        }
                        break;
                }
            }
        }
        while (choice.charAt(0) != 'Q' && choice.charAt(0) != 'q');
    }

}


