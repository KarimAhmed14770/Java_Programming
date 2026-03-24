import java.lang.*;
import java.util.Scanner;


/*it is required to make a class shape that is abstract and make classes circle,rectangle
 */

abstract class Shape
{
    abstract double perimeter();
    abstract double area();
}

class Circle extends Shape
{
    private double radius;

    Circle()
    {
        radius=1;
    }
    Circle(double radius)
    {
        this.radius=radius;
    }

    public void setRadius(double radius)
    {
        this.radius=radius;
    }
    public double getRadius()
    {
        return radius;
    }

    @Override
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }

    @Override
    public double area()
    {
        return Math.PI*radius*radius;
    }

}

class Rectangle extends Shape
{
    private double length;
    private double width;

    Rectangle()
    {
        length=1;
        width=1;
    }

    Rectangle(double length,double width)
    {
        this.length=length;
        this.width=width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width)
    {
        this.width=width;
    }
    public void setLength(double length)
    {
        this.length=length;
    }

    @Override
    public double perimeter()
    {
        return 2*(length+width);
    }

    @Override
    public double area()
    {
        return length*width;
    }
}


public class Challenge {
    public static void main(String[] args)
    {
        Shape sh1=new Circle(10);
        System.out.println(sh1.perimeter());
        System.out.println(sh1.area());

        Shape sh2=new Rectangle(10,5);
        System.out.println(sh2.perimeter());
        System.out.println(sh2.area());
    }
}
