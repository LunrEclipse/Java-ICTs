public class TaxesDriver
{
    public static void main(String[] args)
    {
        double HOURS = 30.0;
        double RATE = 12.35;
        Taxes steve = new Taxes(HOURS, RATE);

        System.out.println("Hours worked: " + steve.getHours());
        System.out.println("Hourly rate: " + steve.getRate());

        System.out.println("\nGross pay: " + steve.grossPay());
        
        System.out.println("\nFederal Tax (15.4%): " + steve.getFedTax());
        System.out.println("FICA Tax (7.75%): " + steve.getFicaTax());
        System.out.println("State Tax (4.0%): " + steve.getStateTax());
        
        System.out.println("\nNet Pay: " + steve.getNetPay());


   
    }
}