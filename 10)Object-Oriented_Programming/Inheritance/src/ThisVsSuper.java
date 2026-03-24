import java.lang.*;
import java.util.Scanner;



/*in this file we explain the difference between this keyword and super keyword in java
this: it is a keyword used to reference to the current object or instance, it is used inside the class
only
Rectangle r1=new Rectangle();
this line of code makes a rectangle object in heap, and r1 becomes a reference to that object and
it is stored in the main stack
the same way: this is a reference to the current object and it can be used inside the class only

super:is a reference to the super class, when passing parameters to it it calls the super class constructpr
if there is a variable with the same name in both super and derived class
if you use this.varname in any class you are accessing the variable in that class specificaly
if you use super.varname from the derived class u r accessing the variable in the super class
 */

class Rectangle{
    int length;
    int width;
    int x=10;
    Rectangle()
    {
        length=1;
        width=1;
    }
    Rectangle(int length,int width)
    {
        this.length=length;
        this.width=width;
    }
}

class Cuboid extends Rectangle{
    int height;
    int x=20;
    Cuboid(){
        height=1;
    }
    Cuboid(int height)
    {
        this.height=height;
    }
    Cuboid(int length,int width,int height)
    {
        super(length,width);
        this.height=height;
    }
    void display()
    {
        System.out.println(this.x);
        System.out.println(super.x);
    }
}
public class ThisVsSuper {
    public static void main(String[] args)
    {
        Cuboid c1=new Cuboid(10,5,1);
        c1.display();
    }
}
