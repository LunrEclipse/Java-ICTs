
public class IRS
{
    // privates for status and income
    
    private int myStatus;
    private double myIncome;
    
    //constuctor for initializing status and income
    
    IRS(int status, double income)
    {
      myStatus = status;
      myIncome = income;
    }
    
    // myStatus is either 1 (single) or 2 (married)
    public double calcTax()
    {
        if (myStatus == 1)
            return calcSingleTax();
        else
            return calcMarriedTax();            
    }
    
    // myStatus = 1
    private double calcSingleTax()
    {
        double tax = 0;
        
        // calculate tax based on the options in the specs
        if( (myIncome > 0) && (myIncome <= 27050))
        {
            tax = myIncome * 0.15;
        }        
        else if( (myIncome > 27050) && (myIncome <= 65550))
        {
            tax = (myIncome - 27050) * 0.275 + 4057.50;
        }        
        else if( (myIncome > 65550) && (myIncome <= 136750))
        {
            tax = (myIncome - 65550) * 0.305 + 14645.00;
        }        
        else if( (myIncome > 136750) && (myIncome <= 297350))
        {
            tax = (myIncome - 136750) * 0.355 + 36361.00;
        }        
        else
        {
            tax = (myIncome - 297350) * 0.391 + 93374.00;
        }
        return tax;
    }
    
    // mystatus = 2
    private double calcMarriedTax()
    {
         double tax = 0;
        
        // calculate tax based on the options in the specs
        if( (myIncome > 0) && (myIncome <= 45200))
        {
            tax = myIncome * 0.15;
        }        
        else if( (myIncome > 45200) && (myIncome <= 109250))
        {
            tax = (myIncome - 45200) * 0.275 + 6780.00;
        }        
        else if( (myIncome > 109250) && (myIncome <= 166500))
        {
            tax = (myIncome - 109250) * 0.305 + 24393.75;
        }        
        else if( (myIncome > 166500) && (myIncome <= 297350))
        {
            tax = (myIncome - 166500) * 0.355 + 41855.00;
        }        
        else
        {
            tax = (myIncome - 297350) * 0.391 + 88306.00;
        }
        
        return tax;
    }
}