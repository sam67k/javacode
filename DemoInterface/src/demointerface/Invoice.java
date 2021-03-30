
package demointerface;

public class Invoice implements Payable
{
    
    String Name;
    double Price ,Result;
    int Quantity;
    
    Invoice()
    {
        this.Name = "UnAssigned";
        this.Quantity = 0;
        this.Price = 0;
    }
    
    void setter(String Name ,int Quantity ,double Price)
    {
        this.Name = Name;
        this.Quantity = Quantity;
        this.Price = Price;
    }
    
    String getName()
    {
        return this.Name;
    }
    
    int getQuantity()
    {
        return this.Quantity;
    }
    
    double getPrice()
    {
        return this.Price;
    }
    
    @Override
    public double getPaymentAmmount()
    {
        Result = Price * Quantity;
        return Result;
    }
    
}
