import java.lang.*;
import java.util.Scanner;




/*In this file we explain Abstract classes
*there are two types of classes:
* 1)Concrete classes: they are classes that are fully defined and therefore we can create an object from a
* concrete class
* 2)Abstract classes:Classes that are nit fully defined, if a single method is abstract then the class is
* abstract, we must use the keyword abstract before abstract classes and abstract methods
* you can't create an object of an abstract class you can only create a reference
*
* Abstract method:abstract method is a method that is not having a body, abstract keyword must be used
* if any class inherits from an abstract class it becomes abstract unless it overrides all the abstract
* methods, then it becomes a concrete class
*
* Very Important Note:Abstract classes are only meant for inheritance, there must be a subclass that
* inherits the abstract class and overrides the abstract methods,then we can create objects of the subclass
*
* why we use abstract classes?
* we use abstract classes when we need an incomplete blueprint that defines a structure but leaves
* some features to be defined by others
*
*
* how to use:
* 1)either a reference of the subclass that points to an object from the subclass
* and use the features of both classes
* 2)create a reference from the super class that points to an object from the subclass
*
*
* Rules:
* 1)you can't use the word final with abstract classes,because final means no inheritance allowed
* and abstract classes are made to be inherited
* 2)you can't make an abstract final method for the same reason
* 3)you can't make a static abstract class or a static method
* 4)if you have a subclass that extends and abstract class it must override abstract methods,if it doesn't
* it is also an abstract class and abstract keyword must be used
*
*
* very important note: in java you can extend only from one class, a subclass can only inherit 1 super
* class and no more

 */


/****Example1 start****/
abstract class Super{
    Super(){
        System.out.println("Super");
    }
    void meth1(){
        System.out.println("Super meth1");
    }
    abstract  void meth2();
    /*in this class we have an abstract method with no definition, so the class is abstract
    * we must use abstract keyword before any abstract method or class*/
}

class Sub extends Super
{
    @Override
    void meth2()
    {
        System.out.println("Sub meth2");
    }
    /*this class inherits the abstract class and overrides the only abstract method so it becomes a
    * concrete class*/
    void meth3()
    {
        System.out.println("Sub meth2");
    }
}

/****Example1 Finish****/

public class AbstractClasses {
    public static void main(String[] args)
    {
        /****Example1 start****/
        /*1)creating a refernce from the sub class that points to an object of the subclass*/
        Sub sb=new Sub();//the constructor of the super class is called first,then of the subclass
        sb.meth1();//inherited from the super class
        sb.meth2();//overridden in the subclass
        sb.meth3();//only available for subclass
        System.out.println();

        Super sp=new Sub();
        sp.meth1();//the method defined in the super class
        sp.meth2();//the abstract method that was overridden in subclass
        //sp.meth3(); a reference of the super class can't access a method that is only defined in subclass

        //Super sp=new Super(); error:super is abstract can't be instantiated



        /****Example1 Finish****/


    }
}
