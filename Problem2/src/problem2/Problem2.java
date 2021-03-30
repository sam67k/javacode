
package problem2;

public class Problem2
{
    public static void main(String[] args)
    {
        System.out.println("\nNormal Account Object\n");
        
        account a1 = new account(25000);
        System.out.println("Balance : "+a1.balance);
        
        a1.deposit(5000);
        System.out.println("Balance after deposit : "+a1.getBalance());
        
        a1.withdraw(300);
        System.out.println("Balance after withdrawl : "+a1.getBalance());
        
        System.out.println("\nSavings Account Object\n");
        
        savingaccount sa1 = new savingaccount(25000);
        
        System.out.println("Balance : "+sa1.getBalance());

        sa1.deposit(5000);
        System.out.println("Balance after deposit : "+sa1.getBalance());
        
        sa1.withdraw(300);
        System.out.println("Balance after withdrawl : "+sa1.getBalance());
                
        sa1.setDefaultInterstRate(2.6);
        sa1.applyDefaultIntersetRate();
        
    }
    
}
