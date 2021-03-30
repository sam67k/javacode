package problem2;

public class account
{
    protected double balance;
    
    public account()
    {
        balance = 0;
    }
    
    public account(double balance)
    {
        this.balance = balance;
    }
    
    void deposit(double Amount)
    {
        balance += Amount;
    }
    
    void withdraw(double Amount)
    {
        balance += Amount;
    }
    
    double getBalance()
    {
        return balance;
    }
    
}
