
package problem3;

public class order 
{
    orderitem orderItems[];
    int i = 0;
    
    order(){
        
    }
    
    order(int size)
    {
       orderItems = new orderitem[size];
    }
    
    public void add0rderitem(orderitem oi)
    {
        orderItems[i] = oi;
        i++;
    }
    
    public int getTotal()
    {
        int total=0;
        
        if(i>0)
        {
            for(int j = 0; j < i; j++)
            {
                total = total + orderItems[j].getCost();
            }    
        }
        return total;
    }
    
    public void printOrderItems()
    {
        if(i > 0)
        {
            for(int j = 0; j < i; j++)
            {
                System.out.println(orderItems[i].toString() +"\t\t"+ orderItems[i].getquantity() +"\t\t"+ orderItems[i].getprice() +"\t\t"+ orderItems[i].getCost() +"\t\t   "+ 0);
            }

        }
    }
    public int getnooforders()
    {   
        return i;
    }

}