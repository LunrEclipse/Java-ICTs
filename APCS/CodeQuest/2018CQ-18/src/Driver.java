import java.lang.reflect.Array;
import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args)
    {
        try {
            Scanner infile = new Scanner(new File("Prob18.in.txt"));
            int num = infile.nextInt();
            infile.nextLine();
            for(int i = 0; i < num; i++)
            {
                //Initialization of All Variables
                ArrayList<Integer> path_distances = new ArrayList<Integer>();
                path_distances.add(null);
                path_distances.add(infile.nextInt());
                path_distances.add(infile.nextInt());
                path_distances.add(infile.nextInt());
                path_distances.add(infile.nextInt());
                path_distances.add(infile.nextInt());
                path_distances.add(infile.nextInt());
                path_distances.add(infile.nextInt());
                infile.nextLine();
                ArrayList<ArrayList<Integer>> paths = new ArrayList<ArrayList<Integer>>();
                ArrayList<Integer>[][] optimal_paths = new ArrayList[5][5];
                ArrayList<Integer> min = new ArrayList<Integer>();
                int lowest = Integer.MAX_VALUE;
                ArrayList<ArrayList<Integer>> optimal = new ArrayList<ArrayList<Integer>>();

                //Optimal From 1 to 2
                optimal = new ArrayList<ArrayList<Integer>>();
                optimal.add(new ArrayList<Integer>(Arrays.asList(2)));
                optimal.add(new ArrayList<Integer>(Arrays.asList(1,3)));
                optimal.add(new ArrayList<Integer>(Arrays.asList(1,5,4)));
                min = new ArrayList<Integer>();
                lowest = Integer.MAX_VALUE;
                for(int j = 0; j < optimal.size(); j++)
                {
                    ArrayList<Integer> temp = optimal.get(j);
                    int cur = 0;
                    for(int k = 0; k < temp.size(); k++)
                    {
                        cur += path_distances.get(temp.get(k));
                    }
                    if( cur < lowest)
                    {
                        min = temp;
                        lowest = cur;
                    }
                }
                optimal_paths[1][2] = min;

                //Optimal From 1 To 3

                optimal = new ArrayList<ArrayList<Integer>>();
                optimal.add(new ArrayList<Integer>(Arrays.asList(1,5)));
                optimal.add(new ArrayList<Integer>(Arrays.asList(2,4)));
                optimal.add(new ArrayList<Integer>(Arrays.asList(1,7,6)));
                optimal.add(new ArrayList<Integer>(Arrays.asList(1,3,4)));
                optimal.add(new ArrayList<Integer>(Arrays.asList(2,3,5)));
                min = new ArrayList<Integer>();
                lowest = Integer.MAX_VALUE;
                for(int j = 0; j < optimal.size(); j++)
                {
                    ArrayList<Integer> temp = optimal.get(j);
                    int cur = 0;
                    for(int k = 0; k < temp.size(); k++)
                    {
                        cur += path_distances.get(temp.get(k));
                    }
                    if( cur < lowest)
                    {
                        min = temp;
                        lowest = cur;
                    }
                }
                optimal_paths[1][3] = min;

                //Optimal from 1 to 4

                optimal = new ArrayList<ArrayList<Integer>>();
                optimal.add(new ArrayList<Integer>(Arrays.asList(1,7)));
                optimal.add(new ArrayList<Integer>(Arrays.asList(1,5,6)));
                optimal.add(new ArrayList<Integer>(Arrays.asList(1,3,4,6)));
                optimal.add(new ArrayList<Integer>(Arrays.asList(2,4,6)));
                optimal.add(new ArrayList<Integer>(Arrays.asList(2,3,7)));
                optimal.add(new ArrayList<Integer>(Arrays.asList(2,3,5,6)));
                optimal.add(new ArrayList<Integer>(Arrays.asList(2,4,5,7)));
                min = new ArrayList<Integer>();
                lowest = Integer.MAX_VALUE;
                for(int j = 0; j < optimal.size(); j++)
                {
                    ArrayList<Integer> temp = optimal.get(j);
                    int cur = 0;
                    for(int k = 0; k < temp.size(); k++)
                    {
                        cur += path_distances.get(temp.get(k));
                    }
                    if( cur < lowest)
                    {
                        min = temp;
                        lowest = cur;
                    }
                }
                optimal_paths[1][4] = min;


                //Optimal From 2 to 1

                optimal = new ArrayList<ArrayList<Integer>>();
                optimal.add(new ArrayList<Integer>(Arrays.asList(2)));
                optimal.add(new ArrayList<Integer>(Arrays.asList(3,1)));
                optimal.add(new ArrayList<Integer>(Arrays.asList(4,5,1)));
                min = new ArrayList<Integer>();
                lowest = Integer.MAX_VALUE;
                for(int j = 0; j < optimal.size(); j++)
                {
                    ArrayList<Integer> temp = optimal.get(j);
                    int cur = 0;
                    for(int k = 0; k < temp.size(); k++)
                    {
                        cur += path_distances.get(temp.get(k));
                    }
                    if( cur < lowest)
                    {
                        min = temp;
                        lowest = cur;
                    }
                }
                optimal_paths[2][1] = min;

                //Optimal from 2 to 3

                optimal = new ArrayList<ArrayList<Integer>>();
                optimal.add(new ArrayList<Integer>(Arrays.asList(4)));
                optimal.add(new ArrayList<Integer>(Arrays.asList(3,5)));
                optimal.add(new ArrayList<Integer>(Arrays.asList(3,7,6)));
                optimal.add(new ArrayList<Integer>(Arrays.asList(2,1,5)));
                min = new ArrayList<Integer>();
                lowest = Integer.MAX_VALUE;
                for(int j = 0; j < optimal.size(); j++)
                {
                    ArrayList<Integer> temp = optimal.get(j);
                    int cur = 0;
                    for(int k = 0; k < temp.size(); k++)
                    {
                        cur += path_distances.get(temp.get(k));
                    }
                    if( cur < lowest)
                    {
                        min = temp;
                        lowest = cur;
                    }
                }
                optimal_paths[2][3] = min;

                //Optimal From 2 to 4

                optimal = new ArrayList<ArrayList<Integer>>();
                optimal.add(new ArrayList<Integer>(Arrays.asList(4,6)));
                optimal.add(new ArrayList<Integer>(Arrays.asList(4,5,7)));
                optimal.add(new ArrayList<Integer>(Arrays.asList(3,7)));
                optimal.add(new ArrayList<Integer>(Arrays.asList(3,5,6)));
                optimal.add(new ArrayList<Integer>(Arrays.asList(2,1,7)));
                optimal.add(new ArrayList<Integer>(Arrays.asList(2,1,5,6)));
                min = new ArrayList<Integer>();
                lowest = Integer.MAX_VALUE;
                for(int j = 0; j < optimal.size(); j++)
                {
                    ArrayList<Integer> temp = optimal.get(j);
                    int cur = 0;
                    for(int k = 0; k < temp.size(); k++)
                    {
                        cur += path_distances.get(temp.get(k));
                    }
                    if( cur < lowest)
                    {
                        min = temp;
                        lowest = cur;
                    }
                }
                optimal_paths[2][4] = min;

                //From 3 to 1

                optimal = new ArrayList<ArrayList<Integer>>();
                optimal.add(new ArrayList<Integer>(Arrays.asList(4,2)));
                optimal.add(new ArrayList<Integer>(Arrays.asList(4,3,1)));
                optimal.add(new ArrayList<Integer>(Arrays.asList(5,1)));
                optimal.add(new ArrayList<Integer>(Arrays.asList(5,3,2)));
                optimal.add(new ArrayList<Integer>(Arrays.asList(6,7,1)));
                optimal.add(new ArrayList<Integer>(Arrays.asList(6,7,3,4)));
                min = new ArrayList<Integer>();
                lowest = Integer.MAX_VALUE;
                for(int j = 0; j < optimal.size(); j++)
                {
                    ArrayList<Integer> temp = optimal.get(j);
                    int cur = 0;
                    for(int k = 0; k < temp.size(); k++)
                    {
                        cur += path_distances.get(temp.get(k));
                    }
                    if( cur < lowest)
                    {
                        min = temp;
                        lowest = cur;
                    }
                }
                optimal_paths[3][1] = min;

                //From 3 to 2

                optimal = new ArrayList<ArrayList<Integer>>();
                optimal.add(new ArrayList<Integer>(Arrays.asList(4)));
                optimal.add(new ArrayList<Integer>(Arrays.asList(5,3)));
                optimal.add(new ArrayList<Integer>(Arrays.asList(5,1,2)));
                optimal.add(new ArrayList<Integer>(Arrays.asList(6,7,3)));
                optimal.add(new ArrayList<Integer>(Arrays.asList(6,7,1,2)));
                min = new ArrayList<Integer>();
                lowest = Integer.MAX_VALUE;
                for(int j = 0; j < optimal.size(); j++)
                {
                    ArrayList<Integer> temp = optimal.get(j);
                    int cur = 0;
                    for(int k = 0; k < temp.size(); k++)
                    {
                        cur += path_distances.get(temp.get(k));
                    }
                    if( cur < lowest)
                    {
                        min = temp;
                        lowest = cur;
                    }
                }
                optimal_paths[3][2] = min;

                //From 3 to 4
                optimal = new ArrayList<ArrayList<Integer>>();
                optimal.add(new ArrayList<Integer>(Arrays.asList(6)));
                optimal.add(new ArrayList<Integer>(Arrays.asList(5,7)));
                optimal.add(new ArrayList<Integer>(Arrays.asList(4,3,7)));
                min = new ArrayList<Integer>();
                lowest = Integer.MAX_VALUE;
                for(int j = 0; j < optimal.size(); j++)
                {
                    ArrayList<Integer> temp = optimal.get(j);
                    int cur = 0;
                    for(int k = 0; k < temp.size(); k++)
                    {
                        cur += path_distances.get(temp.get(k));
                    }
                    if( cur < lowest)
                    {
                        min = temp;
                        lowest = cur;
                    }
                }
                optimal_paths[3][4] = min;

                //From 4 to 1

                optimal = new ArrayList<ArrayList<Integer>>();
                optimal.add(new ArrayList<Integer>(Arrays.asList(7,1)));
                optimal.add(new ArrayList<Integer>(Arrays.asList(7,3,2)));
                optimal.add(new ArrayList<Integer>(Arrays.asList(6,5,1)));
                optimal.add(new ArrayList<Integer>(Arrays.asList(6,4,2)));
                optimal.add(new ArrayList<Integer>(Arrays.asList(6,5,3,2)));
                min = new ArrayList<Integer>();
                lowest = Integer.MAX_VALUE;
                for(int j = 0; j < optimal.size(); j++)
                {
                    ArrayList<Integer> temp = optimal.get(j);
                    int cur = 0;
                    for(int k = 0; k < temp.size(); k++)
                    {
                        cur += path_distances.get(temp.get(k));
                    }
                    if( cur < lowest)
                    {
                        min = temp;
                        lowest = cur;
                    }
                }
                optimal_paths[4][1] = min;

                //From 4 to 2

                optimal = new ArrayList<ArrayList<Integer>>();
                optimal.add(new ArrayList<Integer>(Arrays.asList(6,4)));
                optimal.add(new ArrayList<Integer>(Arrays.asList(6,5,3)));
                optimal.add(new ArrayList<Integer>(Arrays.asList(6,5,1,2)));
                optimal.add(new ArrayList<Integer>(Arrays.asList(7,3)));
                optimal.add(new ArrayList<Integer>(Arrays.asList(7,5,4)));
                optimal.add(new ArrayList<Integer>(Arrays.asList(7,1,2)));
                min = new ArrayList<Integer>();
                lowest = Integer.MAX_VALUE;
                for(int j = 0; j < optimal.size(); j++)
                {
                    ArrayList<Integer> temp = optimal.get(j);
                    int cur = 0;
                    for(int k = 0; k < temp.size(); k++)
                    {
                        cur += path_distances.get(temp.get(k));
                    }
                    if( cur < lowest)
                    {
                        min = temp;
                        lowest = cur;
                    }
                }
                optimal_paths[4][2] = min;

                //From 4 to 3

                optimal = new ArrayList<ArrayList<Integer>>();
                optimal.add(new ArrayList<Integer>(Arrays.asList(6)));
                optimal.add(new ArrayList<Integer>(Arrays.asList(7,5)));
                optimal.add(new ArrayList<Integer>(Arrays.asList(7,3,4)));
                min = new ArrayList<Integer>();
                lowest = Integer.MAX_VALUE;
                for(int j = 0; j < optimal.size(); j++)
                {
                    ArrayList<Integer> temp = optimal.get(j);
                    int cur = 0;
                    for(int k = 0; k < temp.size(); k++)
                    {
                        cur += path_distances.get(temp.get(k));
                    }
                    if( cur < lowest)
                    {
                        min = temp;
                        lowest = cur;
                    }
                }
                optimal_paths[4][3] = min;

                //Creating Paths
                ArrayList<Integer> current_path = new ArrayList<Integer>();
                //1,2,3,4

                current_path = new ArrayList<Integer>();
                current_path.add(1);
                current_path.addAll(optimal_paths[1][2]);
                current_path.addAll(optimal_paths[2][3]);
                current_path.addAll(optimal_paths[3][4]);
                paths.add(current_path);

                //1,2,4,3

                current_path = new ArrayList<Integer>();
                current_path.add(1);
                current_path.addAll(optimal_paths[1][2]);
                current_path.addAll(optimal_paths[2][4]);
                current_path.addAll(optimal_paths[4][3]);
                paths.add(current_path);

                //1,3,2,4

                current_path = new ArrayList<Integer>();
                current_path.add(1);
                current_path.addAll(optimal_paths[1][3]);
                current_path.addAll(optimal_paths[3][2]);
                current_path.addAll(optimal_paths[2][4]);
                paths.add(current_path);

                //1,3,4,2

                current_path = new ArrayList<Integer>();
                current_path.add(1);
                current_path.addAll(optimal_paths[1][3]);
                current_path.addAll(optimal_paths[3][4]);
                current_path.addAll(optimal_paths[4][2]);
                paths.add(current_path);

                //1,4,2,3

                current_path = new ArrayList<Integer>();
                current_path.add(1);
                current_path.addAll(optimal_paths[1][4]);
                current_path.addAll(optimal_paths[4][2]);
                current_path.addAll(optimal_paths[2][3]);
                paths.add(current_path);

                //1,4,3,2

                current_path = new ArrayList<Integer>();
                current_path.add(1);
                current_path.addAll(optimal_paths[1][4]);
                current_path.addAll(optimal_paths[4][3]);
                current_path.addAll(optimal_paths[3][2]);
                paths.add(current_path);

                //3,1,2,4

                current_path = new ArrayList<Integer>();
                current_path.add(5);
                current_path.addAll(optimal_paths[3][1]);
                current_path.addAll(optimal_paths[1][2]);
                current_path.addAll(optimal_paths[2][4]);
                paths.add(current_path);

                //3,1,4,2

                current_path = new ArrayList<Integer>();
                current_path.add(5);
                current_path.addAll(optimal_paths[3][1]);
                current_path.addAll(optimal_paths[1][4]);
                current_path.addAll(optimal_paths[4][2]);
                paths.add(current_path);

                //3,2,4,1

                current_path = new ArrayList<Integer>();
                current_path.add(5);
                current_path.addAll(optimal_paths[3][2]);
                current_path.addAll(optimal_paths[2][4]);
                current_path.addAll(optimal_paths[4][1]);
                paths.add(current_path);

                //3,2,1,4

                current_path = new ArrayList<Integer>();
                current_path.add(5);
                current_path.addAll(optimal_paths[3][2]);
                current_path.addAll(optimal_paths[2][1]);
                current_path.addAll(optimal_paths[1][4]);
                paths.add(current_path);

                //3,4,1,2

                current_path = new ArrayList<Integer>();
                current_path.add(5);
                current_path.addAll(optimal_paths[3][4]);
                current_path.addAll(optimal_paths[4][1]);
                current_path.addAll(optimal_paths[1][2]);
                paths.add(current_path);

                //3,4,2,1

                current_path = new ArrayList<Integer>();
                current_path.add(5);
                current_path.addAll(optimal_paths[3][4]);
                current_path.addAll(optimal_paths[4][2]);
                current_path.addAll(optimal_paths[2][1]);
                paths.add(current_path);

                //2,1,3,4

                current_path = new ArrayList<Integer>();
                current_path.add(3);
                current_path.addAll(optimal_paths[2][1]);
                current_path.addAll(optimal_paths[1][3]);
                current_path.addAll(optimal_paths[3][4]);
                paths.add(current_path);

                //2,1,4,3

                current_path = new ArrayList<Integer>();
                current_path.add(3);
                current_path.addAll(optimal_paths[2][1]);
                current_path.addAll(optimal_paths[1][4]);
                current_path.addAll(optimal_paths[4][3]);
                paths.add(current_path);

                //2,3,1,4

                current_path = new ArrayList<Integer>();
                current_path.add(3);
                current_path.addAll(optimal_paths[2][3]);
                current_path.addAll(optimal_paths[3][1]);
                current_path.addAll(optimal_paths[1][4]);
                paths.add(current_path);

                //2,3,4,1

                current_path = new ArrayList<Integer>();
                current_path.add(3);
                current_path.addAll(optimal_paths[2][3]);
                current_path.addAll(optimal_paths[3][4]);
                current_path.addAll(optimal_paths[4][1]);
                paths.add(current_path);

                //2,4,1,3

                current_path = new ArrayList<Integer>();
                current_path.add(3);
                current_path.addAll(optimal_paths[2][4]);
                current_path.addAll(optimal_paths[4][1]);
                current_path.addAll(optimal_paths[1][3]);
                paths.add(current_path);

                //2,4,3,1

                current_path = new ArrayList<Integer>();
                current_path.add(3);
                current_path.addAll(optimal_paths[2][4]);
                current_path.addAll(optimal_paths[4][3]);
                current_path.addAll(optimal_paths[3][1]);
                paths.add(current_path);

                //4,1,2,3

                current_path = new ArrayList<Integer>();
                current_path.add(7);
                current_path.addAll(optimal_paths[4][1]);
                current_path.addAll(optimal_paths[1][2]);
                current_path.addAll(optimal_paths[2][3]);
                paths.add(current_path);

                //4,1,3,2

                current_path = new ArrayList<Integer>();
                current_path.add(7);
                current_path.addAll(optimal_paths[4][1]);
                current_path.addAll(optimal_paths[1][3]);
                current_path.addAll(optimal_paths[3][2]);
                paths.add(current_path);

                //4,2,1,3

                current_path = new ArrayList<Integer>();
                current_path.add(7);
                current_path.addAll(optimal_paths[4][2]);
                current_path.addAll(optimal_paths[2][1]);
                current_path.addAll(optimal_paths[1][3]);
                paths.add(current_path);

                //4,2,3,1

                current_path = new ArrayList<Integer>();
                current_path.add(7);
                current_path.addAll(optimal_paths[4][2]);
                current_path.addAll(optimal_paths[2][3]);
                current_path.addAll(optimal_paths[3][1]);
                paths.add(current_path);

                //4,3,1,2
                current_path = new ArrayList<Integer>();
                current_path.add(7);
                current_path.addAll(optimal_paths[4][3]);
                current_path.addAll(optimal_paths[3][1]);
                current_path.addAll(optimal_paths[1][2]);
                paths.add(current_path);

                //4,3,2,1

                current_path = new ArrayList<Integer>();
                current_path.add(7);
                current_path.addAll(optimal_paths[4][3]);
                current_path.addAll(optimal_paths[3][2]);
                current_path.addAll(optimal_paths[2][1]);
                paths.add(current_path);




                //Find Minimum
                min = new ArrayList<Integer>();
                lowest = Integer.MAX_VALUE;
                for(int j = 0; j < paths.size(); j++)
                {
                    ArrayList<Integer> temp = paths.get(j);
                    int cur = 0;
                    for(int k = 0; k < temp.size(); k++)
                    {
                        cur += path_distances.get(temp.get(k));
                    }
                    if( cur < lowest)
                    {
                        min = temp;
                        lowest = cur;
                    }
                }
                for(int j = 0; j < min.size(); j++)
                {
                    System.out.print(min.get(j) + " ");
                }
                System.out.println();

            }
        }
        catch(Exception e)
        {

        }
    }
}
