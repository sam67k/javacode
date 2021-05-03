
package demointerface;

import java.util.Scanner;

public class DemoInterface
{

    public static void main(String[] args)
    {
        
        Scanner s = new Scanner(System.in);
        
        Invoice i1 = new Invoice();
        i1.setter("RAM", 10, 100);
        
        Invoice i2 = new Invoice();
        i2.setter("CPU", 10, 100);
        
        Invoice i3 = new Invoice();
        i3.setter("GPU", 10, 100);
        
        SalariedEmployee s1 = new SalariedEmployee();
        s1.setter(100);
        
        SalariedEmployee s2 = new SalariedEmployee();
        s2.setter(1000);
        
        SalariedEmployee s3 = new SalariedEmployee();
        s3.setter(10000);
        
        Payable[] pay = {i1 ,i2 ,i3, s1 ,s2 ,s3};
        
    }
    
}
