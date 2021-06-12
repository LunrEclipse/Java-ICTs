public class PiggyBank
{
    private int myPennies;
    private int myNickels;
    private int myDimes;
    private int myQuarters;
    
    public PiggyBank(int pennies, int nickels, int dimes, int quarters)
    {
        myPennies = pennies;
        myNickels = nickels;
        myDimes = dimes;
        myQuarters = quarters;
    }

    public PiggyBank()
    {
        myPennies = 0;
        myNickels = 0;
        myDimes = 0;
        myQuarters = 0;
    }

    public void addCoins(int pennies, int nickels, int dimes, int quarters)
    {
        myPennies += pennies;
        myNickels += nickels;
        myDimes += dimes;
        myQuarters += quarters;
    }

    public void addQuarters(int quarters)
    {
        myQuarters += quarters;
    }

    public void addDimes(int dimes)
    {
        myDimes += dimes;
    }

    public void addNickels(int nickels)
    {
        myNickels += nickels;
    }

    public void addPennies(int pennies)
    {
        myPennies += pennies;
    }

    public int getPennies()
    {
        return myPennies;
    }

    public int getNickels()
    {
        return myNickels;
    }

    public int getDimes()
    {
        return myDimes;
    }

    public int getQuarters()
    {
        return myQuarters;
    }

    public double getBalance()
    {
        return ((myPennies * 0.01) + (myNickels * 0.05) + (myDimes * 0.1) + (myQuarters * 0.25));
    }
}