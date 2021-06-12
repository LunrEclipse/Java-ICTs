import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args)
    {
        try {
            Scanner infile = new Scanner(new File("Prob12.in.txt"));
            int num = infile.nextInt();
            infile.nextLine();
            for(int i = 0; i < num; i++)
            {
                int size = infile.nextInt();
                infile.nextLine();
                ArrayList<Integer> list = new ArrayList<Integer>();
                for(int j = 2; j <= size; j++)
                    list.add(j);
                for(int j = 0; j < list.size(); j++)
                {
                    if(isPrime(list.get(j)))
                    {
                        int count = 0;
                        for(int g = j+1; g <list.size(); g++)
                        {
                            if(list.get(g) % list.get(j) == 0) {
                                list.remove(g);
                                count++;
                            }
                        }
                        if(count > 0) {
                            System.out.println("Prime " + list.get(j) + " Composite Set Size: " + count);
                        }
                    }
                }
                System.out.print("{");
                for(int j = 0; j < list.size(); j++) {
                    if(j != list.size()-1)
                        System.out.print(list.get(j) + ",");
                    else
                        System.out.print(list.get(j));
                }
                System.out.print("}\n");
            }
        }
        catch(Exception e)
        {

        }
    }

    private static boolean isPrime(int num)
    {
        if (num == 2)
            return true;
        if (num < 2 || num % 2 == 0)
            return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0)
                return false;
        return true;
    }

}
