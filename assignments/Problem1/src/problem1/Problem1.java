
package problem1;

import java.util.Scanner;

public class Problem1 {
    
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        point p = new point();
        
        p.x = 0;
        p.y = 0;
        
        circle c = new circle();
        
        System.out.print("Radius of Circle : ");
        c.radius = s.nextDouble();
        
        System.out.println("Area of Circle having Radius 5 units : "+c.area());
        
        cylinder cy = new cylinder();
        
        System.out.print("Radius of Cylinder : ");
        cy.radius = s.nextDouble();
        
        System.out.print("Height of Cylinder : ");
        cy.height = s.nextDouble();
        
        System.out.println("Area of Cylinder : "+cy.area());
        System.out.println("Volume of Cylinder : "+cy.volume());
        
    }
    
}
