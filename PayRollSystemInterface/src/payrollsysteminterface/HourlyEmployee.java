
package payrollsysteminterface;

public class HourlyEmployee extends Employee
{
    double Wage;
    int Hours;
    
    @Override
    void setter()
    {
        FName = "NotAssigned";
        LName = "NotAssigned";
        SSN = "000000000";
        Wage = 0;
        Hours = 0;
    }
    
    void setter(double Wage, int Hours)
    {
        this.Wage = Wage;
        this.Hours = Hours;
    }
    
    double getWage()
    {
        return this.Wage;
    }
    
    double getHours()
    {
        return this.Hours;
    }
    
    @Override
    public double getPaymentAmmount()
    {
        if (Hours < 40)
        {
            super.Salary = Wage * Hours;
        }
        else if (Hours > 40)
        {
            int EHours = Hours - 40;
            super.Salary = (Wage * 40) + ( ( Wage + ( Wage * 0.1 ) ) * EHours );
        }
        
        return super.Salary;
    }
}
