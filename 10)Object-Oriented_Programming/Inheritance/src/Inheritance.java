import java.lang.*;
import java.util.Scanner;

/*in this file we will explain inheritance in oop and in  java
* inheritance is when a child class inherits the method and properties that exist in a parent class, and
add extra features to them or redefine some behaviors
* 1)generalization: we have a samsung phone, an iphone, Xiaomi phones, all these phones shares common
* attributes and behaviors so we could group them under one class called smart-phones this is
* generalization
* 2)Specialization:when we have an Iphone x as a class, and we make another class derived from it and calling
* it Iphone xs it has all properties if iphone x and added features on it, so it is a subclass of
* the super class
*
* in java if you have multiple classes(iphone,samsung,LG) you can group them under 1 class(smart-phone)
* in java if u have a class(iphone) you can derive a new class from it (iphone x \) which has all members
* of iphone class with added or modified features
*
* specialization is achieved using inheritance
* generalization is achieved using interfaces
* there is something in between called Abstract classes
*
* so what is inheritance???
* it is the process of acquiring the features of an existing class into a new class
* Inheritance syntax
* class Base{
*   body
* }
*
* class Derived extends Base
* {
*       body
* }
* the part extends base states that the derived class has all the features of the base class
* anything is written in the derived class is for the derived class only as added features
*
*
* Constructors inheritance
* when you make a derived class then create an object constructor of the super class is called first
* then the constructor of the derived class is called, which constructor specifically called in each
* class depends on the parameters and the constructor overloading
*
* super:it is a keyword that refers to the super class and when you pass a parameter to it you are
* calling the super class constructor
 */

/*Example circle and cylinder classes*/

class Circle{
    protected double radius;//protected so it can be accessed by derived classes

    Circle()
    {
        radius=1;
        System.out.println("Non parameterized circle constructor");
    }
    Circle(double radius)
    {
        this.radius=radius;
        System.out.println("parameterized circle constructor");
    }
    public double area()
    {
        return Math.PI *radius*radius;
    }
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
}

class Cylinder extends Circle{
    /*now since class cylinder inherits class circle
    everything in class circle is available for class cylinder except private members
    any added features to Cylinder is modifications on the base class circle
     */
    protected double height;

    Cylinder()
    {
        height=1;
        System.out.println("Non parameterized Cylinder constructor");
    }
    Cylinder(double height)
    {
        this.height=height;
        System.out.println("parameterized(1) Cylinder constructor");
    }
    Cylinder(double radius,double height)
    {
        super(radius);//calling the constructor of the base class, this must be the first line
        //this calls the super class constructor
        this.height=height;
        System.out.println("parameterized(2) Cylinder constructor");
    }
    public double volume()
    {
        return area()*height;
    }
}

class ImaginaryFigure extends Cylinder
{
    private double imaginaryAttribute;

    ImaginaryFigure()
    {
        imaginaryAttribute=1;
        System.out.println("Non Parameterized Imaginary Constructor");
    }

    ImaginaryFigure(double imaginaryAttribute)
    {
        this.imaginaryAttribute=imaginaryAttribute;
        System.out.println("Parameterized(1) Imaginary Constructor");
    }
    ImaginaryFigure(double imaginaryAttribute,double height)
    {
        super(height);
        this.imaginaryAttribute=imaginaryAttribute;
        System.out.println("Parameterized(2) Imaginary Constructor");
    }
    ImaginaryFigure(double imaginaryAttribute,double height,double radius)
    {
        super(radius,height);
        this.imaginaryAttribute=imaginaryAttribute;
        System.out.println("Parameterized(3) Imaginary Constructor");
    }


}

public class Inheritance {
    public static void main(String[] args)
    {
        Circle c=new Circle(10);
        System.out.println(c.perimeter());
        System.out.println(c.area());

        Cylinder cl=new Cylinder(10);
        System.out.println(cl.volume());
        /*Constructor inheritance
        Cylinder cl=new Cylinder(10); in this line because cylinder is extended from Circle
        on creating a cylinder object first the circle constructor is called then the cylinder constructor
        based on the constructor over loading
        * */
        System.out.println();
        Cylinder cl1=new Cylinder();//both non parameterized constructors are called
        System.out.println();
        Cylinder cl2=new Cylinder(11);//non parameterized circle constructor then parameterized
        //cylinder constructor
        System.out.println();
        Cylinder cl3=new Cylinder(11,32);//both parameterized constructors are called
        System.out.println();
        /*this works the same way if there is a class that inherits from the second class*/
        ImaginaryFigure im=new ImaginaryFigure(10,20,30);
        System.out.println(im.radius);


    }
}
