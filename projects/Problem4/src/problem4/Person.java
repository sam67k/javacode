
package problem4;

public class Person 
{
    private String FName ,LName ,Gender;
    
    public Person()
    {
        FName = "UnAssigned";
        LName = "UnAssigned";
        Gender = "UnAssigned";
    }
    
    public void setPerson(String FName ,String LName ,String Gender)
    {
        this.FName = FName;
        this.LName = LName;
        this.Gender = Gender;
    }
    
    public String getFName()
    {
        return this.FName;
    }
    
    public String getLName()
    {
        return this.LName;
    }
    
    public String getName()
    {
        String string = this.FName+" "+this.LName;
        return string;
    }
    
    public String getGender()
    {
        return this.Gender;
    }
    
}
