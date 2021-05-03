
package bicycleregistration;

public class Bicycle
{
    private String ownername;
    private int ID;
    
    public Bicycle()
    {
        ownername = "Unknown";
        
    }
    
    public Bicycle(String N)
    {
        ownername = N;
    }
    
    public Bicycle(String N, int id)
    {
        ownername = N;
        ID = id;
        
    }
    
    public String getOwnerName()
    {
        return ownername;
    }
    
    public String getOwnerData()
    {
        String data;
        data = "Owner Name : "+ownername+"\nBicycle ID : "+ID;
        return data;
    }
    
    public void getOwnerName(String name)
    {
        ownername = name;
    }
    
    public void setOwnerData(String name, int id)
    {
        ownername = name;
        ID = id;
    }
}
