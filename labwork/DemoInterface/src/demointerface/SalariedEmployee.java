
package demointerface;

public class SalariedEmployee extends Employee
{
    double WeeklySalary;
    
    @Override
    void setter()
    {
        FName = "NotAssigned";
        LName = "NotAssigned";
        SSN = "000000000";
        WeeklySalary = 0;
    }
    
    void setter(double WeeklySalary)
    {
        this.WeeklySalary = WeeklySalary;
    }
    
    double getWeeklySalary()
    {
        return this.WeeklySalary;
    }
    
    @Override
    public double getPaymentAmmount()
    {
        super.Salary = WeeklySalary * 4;
        return super.Salary;
    }
}
