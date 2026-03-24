import java.awt.image.ImageConsumer;
import java.lang.*;
import java.util.Scanner;

/*In this file we explain interfaces in java
* an interface is used to achieve polymorphism it has nothing to do with abstract classes, it doesn't
* give anything to a subclass, interfaces can't be inherited or extended
* when do we use interfaces?
* when you want something that forces overriding and doesn't allow inheritance we use interfaces
* it is like an abstract class with all its method are abstract and has nothing to give
*
*   Note: abstract class may give members and some defined methods and 1 abstract method, but interfaces
* can't give any defined method, all its methods are abstract it is a must for interfaces
*
* you don't have to write public abstract before an interface method, they are public abstract by default
*
* note that interfaces are implemented and not extended,
* it is recommended that the overridden methods in the implementation class are set to be public too
*
* note that inheritance: a subclass can only inherit or extend 1 superclass and no more
* in interfaces a class can implement multiple interfaces
*
* you can't create an object from an interface it is abstract and not concrete
* you can create an interface reference to an object that implements the interface and it will only access
* the methods stated in the interface and no more
*
* interfaces are only meant for overriding and achieving runtime polymorphism
*
* you can create an anonymous object from an anonymous class and assign an interface refernce to
* it on the moment of instantiation
*
* there is a naming convention in java to write a capital I at the beginning of an interface name
*
* note that if a subclass inherits a super class and implements multiple interface and you want to
* create an object of this class
* 1)if the reference is of the subclass, you can access everything through the refernce
* 2)if the reference is of the superclass,you can only access superclass features
* 3)if the reference is of an interface,you can only access this interface features
*
*
* rules of interfaces:
* 1)by default a method in an interface is abstract public
* 2)you can't make a method in an interface as private
* 3)you can have a variable inside an interface but you must write it in capital letters
* 4)Identifiers in an interface by default are static and final for interface members
* 5)by default all the methods in an interface is abstract, but if you want to define a method
* in an interface you can use static keyword
* 6)you can asccess Interface constants or static methods by Interface_name.member
* 7)an interface can extend another interface but a class only implements an interface
* 8)if an interface extends another interface,when implementing it the class must implement all
* the functions of the base and derived interfaces
* 9)you can define a default method inside an interface but what is a default method ?
*
* default method in an interface:in an interface you have abstract methods that must be implemented
* in the class and default methods that are defined in the interface, if you want to override default
* methods in the class it is okay, if u don't want to there definition exists in the interface
* using the keyword default makes a method default
* it was introduced, so that if you want to modify an inteface that is implemented by many classes
* if u add an abstract function all classes becomes abstract but if u add a default function,classes
* are not affected, then you can override this function in the target class
* so default method was introduced to make the interface editing easier
*
* you can write non-abstract private method in an interface so it is used as internal processing
* between default functions in an interface
* */


/***Example1 starts****/

interface Test1
{
    void meth1();//you don't have to write public abstract, interfaces methods are public abstract
    //by default
    public abstract void meth2();//you can write it also but not mandatory
}

class Test2 implements Test1
{
    @Override
    public void meth1()
    {
        System.out.println("Test2 Meth1");
    }
    @Override
    public void meth2()
    {
        System.out.println("Test2 Meth2");
    }
    public void meth3()
    {
        System.out.println("Test2 Meth3");
    }
}

class Test3 implements Test1
{
    @Override
    public void meth1()
    {
        System.out.println("Test3 Meth1");
    }
    @Override
    public void meth2()
    {
        System.out.println("Test3 Meth2");
    }
}

/***Example1 End****/


/***Example2 starts****/
class Phone{
    void call(){
        System.out.println("Calling");
    }
    void sms(){
        System.out.println("sms");
    }
}

interface Icamera{
    void click();
    void record();
}

interface IMusicPlayer
{
    void play();
    void pause();
    void stop();
}


class SmartPhone extends Phone implements Icamera,IMusicPlayer
{
    //not that Smartphone is a phone that has a camera and has a music player
    //the is relationship is for inheritance and the has relationship is for interfaces
    @Override
    public void click()
    {
        System.out.println("SmartPhone's Camera Clicked");
    }
    @Override
    public void record()
    {
        System.out.println("SmartPhone's Camera Recording");
    }
    @Override
    public void play(){
        System.out.println("SmartPhone's MusicPlayer is Playing");
    }
    @Override
    public void pause(){
        System.out.println("SmartPhone's MusicPlayer is Paused");
    }
    @Override
    public void stop(){
        System.out.println("SmartPhone's MusicPlayer is Stopped");
    }
}
/***Example2 Ends****/


/***Example3 Starts****/
/*rules of interfaces:
 *you can have a variable inside an interface but you must write it in capital letters(naming convention)
 *Identifiers in an interface by default are static and final for interface members
 *a class that implements an interface can access all its members and methods,except static methods
 can't be accessed directly
 *by default all the methods in an interface is abstract, but if you want to define a method
 in an interface you can use static keyword
 *you can access Interface constants or static methods by Interface_name.member
 *an interface can extend another interface but a class only implements an interface,not extend it
 * if an interface extends another interface,when implementing it the class must implement all
 the functions of the base and derived interfaces
 * 9)you can define a default method inside an interface but what is a default method ?
 *default methods can be accessed directly by the implementation class
 * default method in an interface:in an interface you have abstract methods that must be implemented
 * in the class and default methods that are defined in the interface, if you want to override default
 * methods in the class it is okay, if u don't want to there definition exists in the interface
 * using the keyword default makes a method default
 * it was introduced, so that if you want to modify an inteface that is implemented by many classes
 * if u add an abstract function all classes becomes abstract but if u add a default function,classes
 * are not affected, then you can override this function in the target class
 * so default method was introduced to make the interface editing easier
 *
 * you can write non-abstract private method in an interface so it is used as internal processing
 * between default functions in an interface
 * only static functions are visible outside the interface and the implementation class
 * */

interface Test4
{
    int X=10;//by default this variable is static final
    static void display()
    {
        System.out.println(X);
    }
    void meth1();
    default void meth2()
    {
        System.out.println("Defining this method without affecting class Test5");
    }
    private void internalFunc()
    {
        System.out.println("Internal Function");
    }
    default void meth3()
    {
        System.out.print("using ");
        internalFunc();
    }
}

class Test5 implements Test4
{
    @Override
    public void meth1()
    {
        System.out.println(X);

    }


}
/***Example3 Ends****/


public class Interfaces {
    public static void main(String[] args)
    {
        /***Example1 starts****/
        /*to use it you can make an object reference that points to the object or
        an interface reference that points to the object
         */

        //Test1 t1=new Test1(); this is not allowed, you can't create an interface object
        Test1 interface_ref=new Test2();
        interface_ref.meth1();
        interface_ref.meth2();
        //interface_ref.meth3(); not allowed because meth 3 only exists in the class and not in the
        //interface

        Test1 interface_ref2=new Test3();
        interface_ref2.meth1();
        interface_ref2.meth2();
        /***Example1 Ends****/

        /*creating an anonymous object on the moment of instantiation*/
        Test1 in=new Test1() {
            @Override
            public void meth1() {
                System.out.println("Anonymous meth1");
            }

            @Override
            public void meth2() {
                System.out.println("Anonymous meth2");
            }
        };

        in.meth1();
        in.meth1();

        /***Example2 Starts****/
        SmartPhone sp=new SmartPhone();//smartphone is a smartphone(you have access to all smartphone
        //features)
        Phone p=new SmartPhone();//smartphone is a phone(you can only view it as a phone)
        Icamera c=new SmartPhone();//smartphone has a camera(you can only access camera functionality)
        IMusicPlayer mp=new SmartPhone();//(smartphone has a music player(you can only access
        // mp functionality)


        sp.play();
        sp.pause();
        sp.stop();
        sp.click();
        sp.record();
        sp.call();
        sp.sms();

        p.call();
        p.sms();

        c.click();
        c.record();

        mp.pause();
        mp.play();
        mp.stop();

        /***Example2 Ends****/

        /***Example3 Starts****/
        //Test.X=5; //error can't change a final variable
        Test4.display();
        Test5 t=new Test5();
        t.meth1();
        t.meth3();

        /***Example3 Ends****/

    }
}
