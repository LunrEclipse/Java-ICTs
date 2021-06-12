public class Taxes
{
    private double myHoursWorked;
    private double myHourlyRate;
    private final double FEDERAL_TAX = 0.154;
    private final double FICA_TAX = 0.0775;
    private final double STATE_TAX = 0.04;

    Taxes(double hours, double rate)
    {
        myHoursWorked = hours;
        myHourlyRate = rate;
    }

    public double grossPay()
    {
        return (myHoursWorked * myHourlyRate);
    }

    public double getHours()
    {
        return myHoursWorked;
    }

    public double getRate()
    {
        return myHourlyRate;
    }

    public double getFedTax()
    {
        return (grossPay() * FEDERAL_TAX);
    }

    public double getFicaTax()
    {
        return (grossPay() * FICA_TAX);
    }
    
    public double getStateTax()
    {
        return (grossPay() * STATE_TAX);
    }

    public double getNetPay()
    {
        return (grossPay() - getFedTax() - getFicaTax() - getStateTax());
    }
}