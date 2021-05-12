public class Driver {
    public static void main (String[] args)
    {
        int index1 = 1;
        int index2 = 1;
        double longest = 1.00;
        for(int i = 1; i < 1000; i++)
        {
            for(int j = 1; j < 1000; j++) {
                Hashing test = new Hashing();
                test.loadFile(i, j);
                double cur = test.stats();
                if (cur < longest) {
                    longest = cur;
                    index1 = i;
                    index2 = j;
                    System.out.println(i +", " + j + ": " + longest);
                }
            }
        }
        System.out.println(index1);
        System.out.println(index2);
        System.out.println(longest);
    }

}
