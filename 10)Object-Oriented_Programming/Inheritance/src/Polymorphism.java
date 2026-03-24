import java.lang.*;
import java.util.Scanner;


/*polymorphism means same name different functionality,
it can be achieved in two methods in java either:
method overloading(the same name and return type but different parameters)
method overriding(redefinition of the method of the parent class in the child class)
overriding a function:when a function that has exactly the same signature(return type,name,parameters)
is redefined in a base class

Dynamic method dispatch:
this happens when a reference of the super class points to an object of the subclass
this reference can access all the methods of the super class, and the overridden method in the subclass
but can't access the new features in the subclass
this is also called achieving runtime polymorphism using overriding

Rules of Method overriding:
1)the signature of the function that will override must be exactly the same as the function in the
superclass
2)there is only one case where you can only change the return type and its still method overriding
and it is when the function in the super returns an object and the function in the sub
returns an object that is derived from that object in the super
3)a method that has final keyword can't be overridden
4)a method that has static Keyword can't be overridden


Polymorphism can be achieved using method overloading within the same class (compile time polymorphism)
or using method overriding when a derived class inherits a base class
* */

/*Example of method overriding*/
class Super
{
    public void welcome()
    {
        System.out.println("Welcome");
    }
    public void display()
    {
        System.out.println("Hello");
    }
}

class Sub extends Super
{
    /*since this is a subclass it inherits everything from the super class*/
    @Override
    public void display()
    {
        System.out.println("Hello Welcome");
    }
    public void Bye()
    {
        System.out.println("Bye");
    }
}

class Tv{
    public void switchOn()
    {
        System.out.println("Tv is switching on");
    }
    public void changeChannel()
    {
        System.out.println("Tv is changing channel");
    }
}


class SmartTv extends Tv
{
    @Override
    public void switchOn()
    {
        System.out.println("Smart Tv is switching on");
    }
    @Override
    public void changeChannel()
    {
        System.out.println("Smart Tv is changing channel");
    }
    public void browse()
    {
        System.out.println("Smart Tv is Browsing the network");
    }
}

/*the only case where the return type could be different and it is still method overriding*/
class A{}
class B extends A{}

class Super2{
    public A display()
    {
        A a=new A();
        System.out.println("Display with A object return type");
        return a;
    }
}

class Sub2 extends Super2
{
    @Override
    public B display()
    {
        B a=new B();
        System.out.println("Display with B object return type");
        return a;
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Super su = new Super();//this creates a Super object in heap with a super reference in main stack
        //pointing to it
        //now the object in heap has only 1 member which is the display() function
        su.display();
        Sub sb=new Sub();//this creates a Sub object in heap and sb is a Sub reference refering to this object
        //this object has two methods display() from super class(this method is shadowed), display() from
        //subclass this method is available and seen by the reference
        sb.display();

        Super su1=new Sub();
        su1.display();//access the overridden method
        su1.welcome();
        //su1.bye(); error

        Tv t1=new Tv();
        t1.switchOn();
        t1.changeChannel();

        SmartTv t2=new SmartTv();
        t2.switchOn();
        t2.changeChannel();
        t2.browse();

        Tv t3=new SmartTv();
        /*
        the word new means that the object is created at runtime, so the program will not know
        which function to perform at compile time, it is only known at runtime
        */
        t3.switchOn();
        t3.changeChannel();
        //t3.browse(); can't be done

        Super2 sup=new Sub2();
        sup.display();//dynamic method dispatch
    }
}
