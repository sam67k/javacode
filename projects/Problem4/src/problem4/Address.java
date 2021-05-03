
package problem4;

public class Address 
{
    String Street ,City ,State;
    int ZipCode;
    
    public Address()
    {
        Street = "UnAssigned";
        City = "UnAssigned";
        State = "UnAssigned";
        ZipCode = -1;
    }
    
    public void setAddress(String Street, String City, String State, int ZipCode)
    {
        this.Street = Street;
        this.City = City;
        this.State = State;
        this.ZipCode = ZipCode;
    }
    
    public String getAddress()
    {
        String string = this.Street + ", " + this.City + ", " + this.State + ", " + this.ZipCode;
        return string;
    }
    
}

