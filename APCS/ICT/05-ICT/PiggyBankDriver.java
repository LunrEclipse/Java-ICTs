public class PiggyBankDriver
{
    public static void main(String[] args)  
    {
        PiggyBank bakon = new PiggyBank(3, 4, 5, 6);
        System.out.println("Initial piggy bank stats: \n");
        System.out.println("\tQuarters:  " + bakon.getQuarters());
        System.out.println("\tDimes:     " + bakon.getDimes());
        System.out.println("\tNickels:   " + bakon.getNickels());
        System.out.println("\tPennies:   " + bakon.getPennies());
        System.out.println("\n\tTotal:    $" + bakon.getBalance());
        
        bakon.addCoins(2, 3, 4, 5);
        System.out.println("\nAfter adding 5 Quarters, 4 Dimes, 3 Nickels, and 2 Pennies:");
        
        System.out.println("\nCurrent piggy bank stats: \n");
        System.out.println("\tQuarters:  " + bakon.getQuarters());
        System.out.println("\tDimes:     " + bakon.getDimes());
        System.out.println("\tNickels:   " + bakon.getNickels());
        System.out.println("\tPennies:   " + bakon.getPennies());
        System.out.println("\n\tTotal:    $" + bakon.getBalance());
        
        bakon = new PiggyBank();
        System.out.println("\n\nInitial piggy bank stats: \n");
        System.out.println("\tQuarters:  " + bakon.getQuarters());
        System.out.println("\tDimes:     " + bakon.getDimes());
        System.out.println("\tNickels:   " + bakon.getNickels());
        System.out.println("\tPennies:   " + bakon.getPennies());
        System.out.println("\n\tTotal:    $" + bakon.getBalance());
        
        bakon.addCoins(2, 3, 4, 5);
        System.out.println("\nAfter adding 5 Quarters, 4 Dimes, 3 Nickels, and 2 Pennies:");
        
        System.out.println("\nCurrent piggy bank stats: \n");
        System.out.println("\tQuarters:  " + bakon.getQuarters());
        System.out.println("\tDimes:     " + bakon.getDimes());
        System.out.println("\tNickels:   " + bakon.getNickels());
        System.out.println("\tPennies:   " + bakon.getPennies());
        System.out.println("\n\tTotal:    $" + bakon.getBalance());
    }
}