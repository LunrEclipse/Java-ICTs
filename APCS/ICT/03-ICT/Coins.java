public class Coins
{
    private int a;
    public Coins(int amount)
    {
        a = amount;
    }

    public void calculate()
    {
        int numberCoins = 0;
        System.out.println(a + " cents =>");
        
        numberCoins = a / 25;
        a = a % 25;
        System.out.println("\tQuarter(s)  " + numberCoins); 
        
        numberCoins = a / 10;
        a = a % 10;
        System.out.println("\tDime(s)     " + numberCoins);
        
        numberCoins = a / 5;
        a = a % 5;
        System.out.println("\tNickel(s)   " + numberCoins);
        
        System.out.println("\tPenny(s)    " + a + "\n");
    }
}
