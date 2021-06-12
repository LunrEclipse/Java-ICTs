public class MultiplicationTable
{
    public static void MultiplicationTable(int rows, int columns)
    {
        for(int i = 1; i <= rows; i++)
        {
            for(int j = 1; j<=columns; j++)
            {
                System.out.printf("%5d", i*j);
            }
            System.out.println();
        }
    }
}