
package problem1;

public class circle extends point {
    
    protected double radius;
    
    double area()
    {
        double result = 2*(Math.PI)*(Math.pow(radius, 2)); 
        return result;
    }
}
