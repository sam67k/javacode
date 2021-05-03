
package payrollsystem;

public abstract class Employee
{
    protected String FName, LName, SSN;
    protected double Salary, earnings;
    protected String input;
    
    void setter(){
        FName = "NotAssigned";
        LName = "NotAssigned";
        SSN = "000000000";
    }
    
    public void setter(String FName, String LName, String SSN)
    {
        this.FName = FName;
        this.LName = LName;
        this.SSN = SSN;
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
    
    public String getSSN()
    {
        return this.SSN;
    }
    
    abstract double Earnings();
}
