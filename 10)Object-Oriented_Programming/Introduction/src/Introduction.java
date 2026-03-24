import java.lang.*;
import java.util.*;

/*
*ther 4 major principles of object-oriented programming are(Abstraction,polymorphism,encapsulation
* and inheritance
* Abstraction:hiding internal details and showing only required features
* Encapsulation:everything is in a capsule or a single box
* Inheritance:when you have an old blueprint you can make a class derived from this blueprint
* and add extra features
* Polymorphism:same name different functionality
*

* class vas object: in oop we say that everything in the world is an object and each object has
* properties(Data) and behaviors(Methods),behaviors either affect properties or use them.
* before creating an object there must exist a blueprint for that object, a template this template
* is called class, we can create different objects from the same class with each object has differences
* in the properties ,but they belong to the same class after-all,
* the class definition is represented once in heap
* objects are created on heap, each object has its own place in heap memory
* any variable in a method gets stored in the method stack frame on calling the method
* in java programming there is a certain space in memory for holding methods definition
* Syntax of creating a class:
* class ClassName{ the naming convention is the first letter of each word must be capital
*           properties(must have access modifiers) if u didn't write access modifier it is given
*           a default modifier(not public or private or protected) it is called default access
*           so there is always an access modifier
*
*           methods()(must have access modifiers)
* }
*
* to create an object
* className obj_name=new constructor();
* a constructor is method that has the same class name
*
* how to write a class: think about the properties of an object from this class
* for example a circle, it has 1 property which is radius
* but what about area,circumference?
* since they can be calculated from radius, then the must mention property is radius
* calculations can be done using methods and return of the method
*
* to acces a property or a method from the class an object must be created
* objname.property or objname.method and, it depends on the access modifiers
* if you want to create a property or a method that can be used without creating an object
* use static keyword
*
* when you build a java program there is a compiled .class file for all existing classes
 */

/*First class*/
class FirstClass{
    private int a;
    private int b;


    public void display()
    {
        System.out.println(a+b);
    }
}

class Television{
    private int channel;
    private int volume;

    public void changeChannel()
    {
        System.out.println("Changing Channel");
    }
    public void changeVolume()
    {
        System.out.println("Changing Volume");
    }
}

class Circle
{
    public double radius;

    double perimeter()
    {
        return 2*Math.PI*radius;
    }
    double area()
    {
        return Math.PI*radius*radius;
    }

}

class Rectangle{
    int length;
    public int width;


    public int area()
    {
        return length*width;
    }
    public int perimeter()
    {
        return 2*(length+width);
    }

}


public class Introduction {
    public static void main(String[] args)
    {
        /*creating an object syntax*/
        FirstClass f=new FirstClass();
        f.display();
        Television t=new Television();
        t.changeChannel();
        t.changeVolume();

        Circle c=new Circle();
        c.radius=10;
        System.out.println("perimeter= "+c.perimeter());
        System.out.println("area= "+c.area());

        Rectangle r=new Rectangle();
        r.length=10;
        r.width=5;
        System.out.println("perimeter= "+r.perimeter());
        System.out.println("area= "+r.area());
    }
}
