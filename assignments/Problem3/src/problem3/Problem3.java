
package problem3;

import java.util.Scanner;

public class Problem3 {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        orderitem oit = new orderitem();
        order o = new order(1);
        rushorder r = new rushorder();
        
        System.out.print("Item Name : ");
        String upc = s.next();
        
        System.out.print("Quantity : ");
        int q = s.nextInt();
        
        System.out.print("Price : ");
        int p = s.nextInt();
        
        oit.setter(upc, q, p);
        
        o.add0rderitem(oit);
        
        System.out.println("Name: "+oit.getupc());
        System.out.println("Quan: "+oit.getquantity());
        System.out.println("Price: "+oit.getprice());
        System.out.println("Cost: "+oit.getCost());
        System.out.println("Total: "+o.getTotal());
        
        System.out.println(o.getnooforders());
        
        r.rushorder(1);
        
        System.out.println(r.getTotal());
        
    }
    
}
