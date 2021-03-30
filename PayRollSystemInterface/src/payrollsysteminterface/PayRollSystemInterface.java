
package payrollsysteminterface;

import java.util.Scanner;

public class PayRollSystemInterface
{

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        Employee e = new Employee() {
            @Override
            public double getPaymentAmmount() {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        };
        
        SalariedEmployee se = new SalariedEmployee();
        HourlyEmployee he = new HourlyEmployee();
        CommissionEmployee ce = new CommissionEmployee();
        BasicPayCommissionEmployee bpce = new BasicPayCommissionEmployee();
        
        System.out.println("============================================="
                      + "\n         Welcome to Pay Roll Syatem\n\n");
        
        System.out.print("Enter your First Name : ");
        e.FName = s.next();
        
        System.out.print("Enter your Last Name : ");
        e.LName = s.next();
        
        System.out.print("Enter your SSN(Social Security Number) : ");
        e.SSN = s.next();
        
        e.setter(e.FName, e.LName, e.SSN);
        
        Payable[] pay = {se ,he ,ce ,bpce};
        
        for (int i = 0; i < 4; i++)
        {
            switch(i)
            {
                case 0:
                    System.out.print("Enter your Weekly Salary : ");
                    double sal = s.nextDouble();
                    se.setter(sal);
                    e.earnings = se.getPaymentAmmount();
                    break;
                case 1:
                    System.out.print("Enter your Hourly Wage : ");
                    double hw = s.nextDouble();
                    System.out.print("Enter Hours you have worked for : ");
                    int h = s.nextInt();
                    he.setter(hw, h);
                    e.earnings = he.getPaymentAmmount();
                    break;
                case 2:
                    System.out.print("Enter your Ammount of Gross Sales : ");
                    double gs = s.nextDouble();
                    System.out.print("Enter Commission Rate : ");
                    int cr = s.nextInt();
                    ce.setter(gs, cr);
                    e.earnings = ce.getPaymentAmmount();
                    break;
                case 3:
                    System.out.print("Enter Your Basic Salary : ");
                    double bsal = s.nextDouble();
                    System.out.print("Enter your Ammount of Gross Sales : ");
                    gs = s.nextDouble();
                    System.out.print("Enter Commission Rate : ");
                    cr = s.nextInt();
                    bpce.setter(bsal, gs, cr);
                    e.earnings = bpce.getPaymentAmmount();
                    break;        
            }
        }
        
        System.out.println(pay[0].getPaymentAmmount());
        System.out.println(pay[1].getPaymentAmmount());
        System.out.println(pay[2].getPaymentAmmount());
        System.out.println(pay[3].getPaymentAmmount());
        
    }
}