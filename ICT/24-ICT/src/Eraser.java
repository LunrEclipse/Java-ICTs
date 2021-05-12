import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Eraser {

    private boolean[][] myMatrix;

    public Eraser (String filename)
    {
        myMatrix = new boolean[20][20];
        loadFile(filename);
    }

    private void loadFile(String file)
    {
        Scanner inFile;

        try
        {
            inFile = new Scanner(new File(file));
            int num = inFile.nextInt();
            for(int i = 0; i < num; i++)
            {
                int xpos = inFile.nextInt() - 1;
                int ypos = inFile.nextInt() - 1;
                myMatrix[xpos][ypos] = true;
            }
        }
        catch(IOException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void run()
    {
        System.out.println("Version 69, LESS GOO!!!\n");
        output();
        Scanner scan = new Scanner(System.in);
        int row = Integer.MAX_VALUE;
        while(row == Integer.MAX_VALUE)
        {
            try{
                System.out.print("\nEnter Row: ");
                int rowTemp = Integer.parseInt(scan.nextLine()) - 1;
                if(myMatrix[rowTemp][0])
                {

                }
                row = rowTemp;
            }
            catch(Exception e)
            {
                if(e.toString().contains("ArrayIndex"))
                {
                    System.out.println("\nError: Enter a Valid Number Between 1 and 20");
                }
                else
                {
                    System.out.println("\nError: Enter an Int");
                }
            }
        }


        int col = Integer.MAX_VALUE;
        while(col == Integer.MAX_VALUE)
        {
            try{
                System.out.print("\nEnter Col: ");
                int colTemp = Integer.parseInt(scan.nextLine()) - 1;
                if(myMatrix[0][colTemp])
                {

                }
                col = colTemp;
            }
            catch(Exception e)
            {
                if(e.toString().contains("ArrayIndex"))
                {
                    System.out.println("\nError: Enter a Valid Number Between 1 and 20");
                }
                else
                {
                    System.out.println("\nError: Enter an Int");
                }
            }
        }

        if(row >= 0 && row < myMatrix.length && col >= 0 && col <myMatrix[0].length && myMatrix[row][col])
        {
            move(row, col);
            output();
        }
        else
        {
            System.out.println("\nThere is Nothing There");
        }

        int cont = Integer.MAX_VALUE;
        while(cont == Integer.MAX_VALUE)
        {
            try
            {
                System.out.print("\nDo You Want To Continue? (1 = yes, any other number = no): ");
                cont = scan.nextInt();
                output();
                scan.nextLine();
            }
            catch(Exception e)
            {
                System.out.println("\nEnter a Number");
                scan.nextLine();
            }
        }
        while(cont == 1)
        {
            row = Integer.MAX_VALUE;
            while(row == Integer.MAX_VALUE)
            {
                try{
                    System.out.print("\nEnter Row: ");
                    int rowTemp = Integer.parseInt(scan.nextLine()) - 1;
                    if(myMatrix[rowTemp][0])
                    {

                    }
                    row = rowTemp;
                }
                catch(Exception e)
                {
                    if(e.toString().contains("ArrayIndex"))
                    {
                        System.out.println("\nError: Enter a Valid Number Between 1 and 20");
                    }
                    else
                    {
                        System.out.println("\nError: Enter an Int");
                    }
                }
            }


            col = Integer.MAX_VALUE;
            while(col == Integer.MAX_VALUE)
            {
                try{
                    System.out.print("\nEnter Col: ");
                    int colTemp = Integer.parseInt(scan.nextLine()) - 1;
                    if(myMatrix[0][colTemp])
                    {

                    }
                    col = colTemp;
                }
                catch(Exception e)
                {
                    if(e.toString().contains("ArrayIndex"))
                    {
                        System.out.println("\nError: Enter a Valid Number Between 1 and 20");
                    }
                    else
                    {
                        System.out.println("\nError: Enter an Int");
                    }
                }
            }

            if(row >= 0 && row < myMatrix.length && col >= 0 && col <myMatrix[0].length && myMatrix[row][col])
            {
                move(row, col);
                output();
            }
            else
            {
                System.out.println("\nThere is Nothing There");
            }
            cont = Integer.MAX_VALUE;
            while(cont == Integer.MAX_VALUE)
            {
                try
                {
                    System.out.print("\nDo You Want To Continue? (1 = yes, any other number = no): ");
                    cont = scan.nextInt();
                    output();
                    scan.nextLine();
                }
                catch(Exception e)
                {
                    System.out.println("\nEnter a Number");
                    scan.nextLine();
                }
            }
        }

        System.out.println("Final Result");
    }

    private void move(int row, int col)
    {
        if(row >= 0 && row < myMatrix.length && col >= 0 && col <myMatrix[0].length && myMatrix[row][col])
        {
            myMatrix[row][col] = false;
            move(row + 1, col);
            move(row, col  + 1);
            move(row - 1, col);
            move(row, col  - 1);
        }

    }

    public void output()
    {
        System.out.print("   ");
        for(int i = 1; i <=20; i++)
        {
            System.out.print(i%10);
        }
        System.out.println();
        for(int i = 0; i < myMatrix.length; i++)
        {
            System.out.printf("%2s", i + 1);
            System.out.print(" ");
            for(int j = 0; j<myMatrix[i].length; j++)
            {
                if(myMatrix[i][j])
                    System.out.print("@");
                else
                    System.out.print("-");
            }
            System.out.println();
        }
    }
}
