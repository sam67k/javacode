
package problem3;

public class rushorder extends order
{
    protected int deliveryDay;
    
    public void rushorder(int d)
    {
        deliveryDay = d;
    }

    public int getTotal()
    {
        if(super.getTotal() != 0)
        {
            switch(deliveryDay)
            {
                case 1 :
                {
                    return super.getTotal() + 25;
                }
                case 2 :
                {
                    return super.getTotal() + 15;
                }
                case 3 :
                {
                    return super.getTotal() + 10;
                }
                default:
                {
                    return super.getTotal();
                }

            }
        }
        else
        {
            return 0;
        }
        
    }
}
