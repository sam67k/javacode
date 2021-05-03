
package problem3;

public class orderitem
{
    String upc;
    int quantity, price, day;
    
    void setter(String upc, int quantity, int price)
    {
        this.upc = upc;
        this.quantity = quantity;
        this.price = price;
    }
    
    void setter(String upc, int quantity, int price, int day)
    {
        this.upc = upc;
        this.quantity = quantity;
        this.price = price;
        this.day = day;
    }
    
    String getupc()
    {
        return this.upc;
    }
    
    int getquantity()
    {
        return this.quantity;
    }
    
    int getprice()
    {
        return this.price;
    }
    
    int getday()
    {
        return this.day;
    }
    
    public int getCost()
    {
        return price*quantity;
    }
    
}
