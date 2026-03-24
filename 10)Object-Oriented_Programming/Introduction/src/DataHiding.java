import java.lang.*;
import java.util.Scanner;

/*In this file we explain the methods of data hiding in java classes
the principle of encapsulation:bundling data fields and methods together while hiding
the internal details
there are 4 levels of access in java
1.private:only the class itself can access the data or the method,nothing outside the class
can access, even the child classes(highest restriction)
2.public:the data or the method can be accesses from anywhere(no restrictions)
3.protected:can be accessed from the classes in the same package and from child classes in
different packages, classes in different packages that r not related can't be accessed
4.default(no modifier):classes in the same package can access,classes in other packages can't


to access private data we define something called property methods known as getters and
setters
note:you can't duplicate class names in the same project even if in different files


types of properties(we have 3 types of properties)
1.Read-Write property:when you write both get and set for the property
2.Read Only property:when you write get only and never allow to set
3.Write only:when you write set only and never allow to get(rare case)
 */

class Rectangle2
{
    private int length;
    private int width;


    Rectangle2()
    {
        //a class constructor is a method that holds the same class name with no return type
        //by default java makes a default constructor, if u don't but if u define a constructor
        //there is no default constructor made by java
        //you can overload constructors,make constructors with different parameters
        this.length=1;
        this.width=1;
    }
    //length and width can't be accessed at all outside this class
    //therefore we should make methods to access these properties safely
    public void setLength(int length)
    {
        this.length=length;//this is a reference to the current class object
        //we use it to avoid naming conflicts
    }
    public void setWidth(int width)
    {
        this.width=width;
    }
    public int getLength()
    {
        return this.length;
    }
    public int getWidth()
    {
        return this.width;
    }
    public int perimeter()
    {
        return 2*(length+width);
    }
    public int area()
    {
        return length*width;
    }
}
public class DataHiding {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Rectangle2 r=new Rectangle2();
        //r.length=5; will give error because length is private,can't be accessed outside class
        System.out.println("Enter the length and width of a rectangle:");
        r.setLength(sc.nextInt());
        r.setWidth(sc.nextInt());
        System.out.println(("Perimeter= "+r.perimeter()));
        System.out.println(("Area= "+r.area()));



    }
}
