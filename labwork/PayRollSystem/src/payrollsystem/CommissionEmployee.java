
package payrollsystem;

public class CommissionEmployee extends Employee
{
    protected double GrossSales, CommissionRate;
    
    @Override
    void setter()
    {
        FName = "NotAssigned";
        LName = "NotAssigned";
        SSN = "000000000";
        GrossSales = 0;
        CommissionRate = 0;
    }
    
    void setter(double GrossSales, double CommissionRate)
    {
        this.GrossSales = GrossSales;
        this.CommissionRate = CommissionRate;
    }
    
    double getGrossSales()
    {
        return this.GrossSales;
    }
    
    double getCommissionRate()
    {
        return this.CommissionRate;
    }
    
    @Override
    double Earnings()
    {
        super.Salary = GrossSales * ( CommissionRate / 100);
        return super.Salary;
    }
}
