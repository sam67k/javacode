
package problem2;

public class savingaccount extends account
{
    double defaultInterstRate = 2.5;
    double InterstRate;
    
    public savingaccount()
    {
        super();
    }
    
    public savingaccount(double balance)
    {
        super(balance);
    }
    
    void setDefaultInterstRate(double inRate)
    {
        defaultInterstRate = inRate;
    }
    
    double getDefaultInterstRate()
    {
        return defaultInterstRate;
    }
    
    void applyDefaultIntersetRate()
    {
        System.out.println("Interest Ammout on Current Balance : "+(balance * this.defaultInterstRate) / 100);
    }
    
}

