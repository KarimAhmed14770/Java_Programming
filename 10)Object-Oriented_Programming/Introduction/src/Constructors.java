import java.lang.*;
import java.util.Scanner;


/*Constructors: in this file we explain constructors
*Constructor is used to initialize an object at the time of creation(instantiation),not
* create an object and then afterwards set each property
* so it is used for initializing the properties of an object at the time of creation
*Constructor is a method of class that is automatically called whenever an object is created
* every class has a default constructor provided by java even if u didn't write a constructor
* if u wrote a constructor then the default constructor is removed
* you can overload a constructor and write different constructors with different parameters
* syntax of writing a constructor:
* it is a method that have the exact name of the class with no return type and it is usually
* public, you can overload constructors, so that a constructor is called based on the parameter list
* constructors can also be private but this is sooo rare
 */

class Cuboid{
    private int length;
    private int width;
    private int height;

    Cuboid()
    {
        this.length=1;
        this.height=1;
        this.width=1;
    }
    Cuboid(int length,int width,int height)//parameterized constructor
    {
        this.length=length;
        this.height=height;
        this.width=width;
    }

    public void setLength(int length){
        this.length=length;
    }
    public void setWidth(int width){
        this.width=width;
    }
    public void setHeight(int height){
        this.height=height;
    }

    public int getLength(){
        return length;
    }
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }

    public int volume()
    {
        return length*width*height;
    }
}
public class Constructors {
    public static void main(String[] args) {
        Cuboid c = new Cuboid();
        System.out.println("Length= "+c.getLength());
        System.out.println("Width= "+c.getWidth());
        System.out.println("Height= "+c.getHeight());
        Cuboid c2=new Cuboid(10,20,5);
        System.out.println("Length= "+c2.getLength());
        System.out.println("Width= "+c2.getWidth());
        System.out.println("Height= "+c2.getHeight());
        Cuboid c3=new Cuboid();
        c3.setHeight(10);
        c3.setLength(100);
        c3.setWidth(50);
        System.out.println("Length= "+c3.getLength());
        System.out.println("Width= "+c3.getWidth());
        System.out.println("Height= "+c3.getHeight());

    }
}
