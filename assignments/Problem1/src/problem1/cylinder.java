
package problem1;

public class cylinder extends circle {
    
    protected double height;
    
    double area()
    {
        double result = 2*(Math.PI)*radius*height + 2*(Math.PI)*radius*2;
        return result;
    }
    
    double volume()
    {
        double result = (Math.PI)*(radius*radius)*(height);
        return result;
    }
    
}
