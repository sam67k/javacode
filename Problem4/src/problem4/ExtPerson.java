
package problem4;

public class ExtPerson extends Person
{
    Date DateOfBirth;
    String Relationship;
    Address Address;
    String Number;
    
    ExtPerson()
    {
        super();
        DateOfBirth = null;
        Relationship = "UnAssigned";
        Address = null;
        Number = "00000000000";
    }
    
    public void setExtPerson(Date d ,String r ,Address a ,String n)
    {
        this.DateOfBirth = d;
        this.Relationship = r;
        this.Address = a;
        this.Number = n;
    }
    
    public void setDateOfBirth(Date d)
    {
        DateOfBirth = d;
    }
    
    public void setAddress(Address A)
    {
        Address = A;
    }
    
}
