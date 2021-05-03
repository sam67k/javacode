
package demo;

class Shape
{
    void show()
    {
        System.out.println("Shape!");
    }
}

class Square extends Shape
{
    void show()
    {
        System.out.println("Square!");
    }
}

class Rectangle extends Shape
{
    void show()
    {
        System.out.println("Rectangle!");
    }
}

class Circle extends Shape
{
    void show()
    {
        System.out.println("Circle!");
    }
}

class Triangle extends Shape
{
    void show()
    {
        System.out.println("Triangle!");
    }
}

public class Demo
{
    public static void main(String[] args)
    {
        Shape s = new Shape();
        s.show();
        
        Square sq = new Square();
        sq.show();
        
        Rectangle rect = new Rectangle();
        rect.show();
        
        Circle cir = new Circle();
        cir.show();
        
        Triangle tri = new Triangle();
        tri.show();
    }
}