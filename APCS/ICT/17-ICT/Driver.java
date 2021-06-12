import java.util.*;
public class Driver extends MergeSort
{
    public static void main(String[] args)
    {
        List<Comparable> test = new ArrayList<Comparable>();
        test.add("filler");
        test.add("filler");
        test.add("a");
        test.add("c");
        test.add("e");
        test.add("b");
        test.add("d");
        test.add("f");
        test.add("filler");
        test.add("filler");
        System.out.println("Pre-Merge:");
        for(int i = 0; i < test.size(); i++)
            System.out.println(test.get(i));
        MergeSort.merge(test, 2, 4, 7);
        System.out.println("\n\nPost-Merge:");
        for(int i = 0; i < test.size(); i++)
            System.out.println(test.get(i)); 
        
        test = new ArrayList<Comparable>();
        test.add("filler");
        test.add("filler");
        test.add("1");
        test.add("3");
        test.add("5");
        test.add("2");
        test.add("4");
        test.add("6");
        test.add("filler");
        test.add("filler");
        System.out.println("\n\nPre-Merge:");
        for(int i = 0; i < test.size(); i++)
            System.out.println(test.get(i));
        MergeSort.merge(test, 2, 4, 7);
        System.out.println("\n\nPost-Merge:");
        for(int i = 0; i < test.size(); i++)
            System.out.println(test.get(i)); 
    }
}
