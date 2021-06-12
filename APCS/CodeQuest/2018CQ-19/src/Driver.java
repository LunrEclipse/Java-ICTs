import java.lang.reflect.Array;
import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args)
    {
        try {
            Scanner infile = new Scanner(new File("Prob19.in.txt"));
            int num = infile.nextInt();
            infile.nextLine();
            for(int i = 0; i < num; i++)
            {
                //Create Rotors
                ArrayList<Integer> Rotor1 = new ArrayList<Integer>(Arrays.asList(1,3,6,0,5,4,8,7,9,2));
                ArrayList<Integer> Rotor2 = new ArrayList<Integer>(Arrays.asList(0,3,5,2,6,9,1,4,8,7));
                ArrayList<Integer> Rotor3 = new ArrayList<Integer>(Arrays.asList(5,9,1,7,3,8,0,2,4,6));
                ArrayList<Integer> Rotor4 = new ArrayList<Integer>(Arrays.asList(1,6,5,2,9,0,7,4,3,8));
                ArrayList<Integer> Mirror = new ArrayList<Integer>(Arrays.asList(3,6,8,0,5,4,1,9,2,7));

                ArrayList<ArrayList<Integer>> rotors = new ArrayList<ArrayList<Integer>>();
                ArrayList<ArrayList<Integer>> originals = new ArrayList<ArrayList<Integer>>();

                //Read Original Positions and Message
                for(int j = 0; j <=2; j++)
                {
                    int rotor = infile.nextInt();
                    int originalPos = infile.nextInt();
                    infile.nextLine();
                    for(int k = 0; k < originalPos; k++)
                    {
                        if(rotor == 1)
                        {
                            Rotor1 = Shift(Rotor1);
                        }
                        if(rotor == 2)
                        {
                            Rotor2 = Shift(Rotor2);
                        }
                        if(rotor == 3)
                        {
                            Rotor3 = Shift(Rotor3);
                        }
                        if(rotor == 4)
                        {
                            Rotor4 = Shift(Rotor4);
                        }
                    }
                    if(rotor == 1)
                    {
                        rotors.add(Rotor1);
                        originals.add(Rotor1);
                    }
                    if(rotor == 2)
                    {
                        rotors.add(Rotor2);
                        originals.add(Rotor2);
                    }
                    if(rotor == 3)
                    {
                        rotors.add(Rotor3);
                        originals.add(Rotor3);
                    }
                    if(rotor == 4)
                    {
                        rotors.add(Rotor4);
                        originals.add(Rotor4);
                    }
                }
                for(int j = 2; j >= 0; j--)
                {
                    rotors.add(Reverse(rotors.get(j)));
                }
                String message = infile.nextLine();
                //Code Message
                String res = "";


                for(int j = 0; j < message.length(); j++)
                {
                    int cur = Integer.parseInt(message.substring(j, j+1));
                    for(int k = 0; k < 3; k++)
                    {
                        cur = rotors.get(k).get(cur);
                    }
                    cur = Mirror.get(cur);
                    for(int k = 3; k <= 5; k++)
                    {
                        cur = rotors.get(k).get(cur);
                    }
                    res += cur;
                        rotors.set(2, Shift(rotors.get(2)));
                        rotors.set(3,Reverse((rotors.get(2))));
                        if(rotors.get(2).equals(originals.get(2)))
                        {
                            rotors.set(1, Shift(rotors.get(1)));
                            rotors.set(4,Reverse((rotors.get(1))));
                            if(rotors.get(1).equals(originals.get(1)))
                            {
                                rotors.set(0, Shift(rotors.get(0)));
                                rotors.set(5,Reverse((rotors.get(0))));
                            }
                        }
                }

                System.out.println(res);


            }
        }
        catch(Exception e)
        {
            System.out.println("Error");
        }
    }

    public static ArrayList<Integer> Shift(ArrayList<Integer> cur)
    {
        ArrayList<Integer> temp = new ArrayList<Integer>(cur);
        for(int i = 1; i < cur.size(); i++)
        {
            int current_number = cur.get(i-1);
            current_number++;
            if(current_number > 9)
                current_number = 0;
            temp.set(i, current_number);
        }
        int current_number = cur.get(cur.size()-1);
        current_number++;
        if(current_number > 9)
            current_number = 0;
        temp.set(0, current_number);
        return temp;
    }

    public static ArrayList<Integer> Reverse(ArrayList<Integer> list)
    {
        ArrayList<Integer> reverse = new ArrayList<Integer>(list);
        for(int i = 0; i < list.size(); i++)
        {
            reverse.set(i, list.indexOf(i));
        }
        return reverse;
    }

    public static void Print(ArrayList<Integer> list)
    {
        for(int i = 0; i < list.size(); i++)
        {
            System.out.print(list.get(i));
        }
        System.out.println();
    }
}
