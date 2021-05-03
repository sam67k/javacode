
package payrollsystem;

public class BasicPayCommissionEmployee extends CommissionEmployee
{
    double BaseSalary;
    
    @Override
    void setter()
    {
        FName = "NotAssigned";
        LName = "NotAssigned";
        SSN = "000000000";
        GrossSales = 0;
        CommissionRate = 0;
    }
    
    void setter(double BaseSalary, double GrossSales, double CommissionRate)
    {
        this.BaseSalary = BaseSalary;
        this.GrossSales = GrossSales;
        this.CommissionRate = CommissionRate;
    }
    
    double getBaseSalary()
    {
        return this.BaseSalary;
    }
    
    @Override
    double getGrossSales()
    {
        return this.GrossSales;
    }
    
    @Override
    double getCommissionRate()
    {
        return this.CommissionRate;
    }
    
    @Override
    double Earnings()
    {
        this.Salary = ( GrossSales * ( CommissionRate / 100) ) + BaseSalary;
        return this.Salary;
    }
}