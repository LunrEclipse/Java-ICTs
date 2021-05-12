public class Driver {
    public static void main(String[] args)
    {
        Life test = new Life("life100.txt");
        for(int i = 0; i < 5; i++)
        {
            test.nextGeneration();
        }
        System.out.println(test.toString());
        System.out.println("\nNumber in Row 10 --> " + test.countRow(10) + "\n");
        System.out.println("\nNumber in Column 10 --> " + test.countCol(10) + "\n");
        System.out.println("\nNumber of living organisms --> " + test.totalAlive() + "\n");
    }
}
