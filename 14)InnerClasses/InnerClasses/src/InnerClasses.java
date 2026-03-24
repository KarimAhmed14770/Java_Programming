
/*we can define a class inside another class this is known by inner classes
* Inner-Classes are classified into 4 types:
* Nested Inner classes
* Local Inner classes
* Anonymous Inner Classes
* public Inner classes
*
* 1)Nested Inner classes:when you define a class inside a class this is called nested inner
* class, the outer class can't access the members of the inner class directly, it must create
* an object of the inner class and access its member through it
* inner class can directly access outer class members
* mostly we create an inner class to reduce complexity of outer class
*
* 2)Local Inner-Class:
* when you define a class template inside a method, this class will only be available or seen
* in that method , its scope is local to that method, it can have the name of an existing global
* scope because it is local, this class is only accessible through this function, u can't create an object of
* that class
*
* 3)Anonymous Inner-class: Anonymous inner class can be defined at the time of creation of an object itself
* usually useful with interfaces and abstract class, we define the class at the time of object creation
* this class has no name so it is anonymous class, this is not creating an object of the same class, it is
* defining the class upon creation of an object from the abstract class,
* u can only use this class through the object
*
* 4)Static Inner-class:
* when you create a static inner class you can create an object of the inner class without creating an object
* of the outer class,static inner classes can only access the static members of the outer class, they can't
* access any non-static member.
* */

/*Nested Inner Class*/
class Outer{
    int x=10; //first member in the outer class
    class Inner{//a class definition made in the outer class
        int y=20;//a member of the inner class which is only accessible through inner class
        void innerDisplay()//member of the inner class
        {
            System.out.println(x);//inner class members can access outer class members
            System.out.println(y);
        }
    }
    void outerDisplay()//a member of the outer class
    {
        Inner i=new Inner();//must create an object of the inner class to use it in the
        i.innerDisplay();//outer class
        System.out.println(i.y);
    }
}

/*Local Inner-Class*/

class Outer2{
    void display()
    {
        class Inner{
            void InnerDisplay()
            {
                System.out.println("Hello\n");
            }
        }
        Inner i=new Inner();
        i.InnerDisplay();
    }
}

/*Anonymous Inner Class*/
abstract class MyClass{
    abstract void display();
}

class Outer3{
    public void meth1()
    {
        MyClass m=new MyClass() {
            @Override
            void display() {
                System.out.println("HEYYY");
            }
        };
        m.display();
    }
}

/*Static Inner-Class*/
class Outer4{
    static int x=10;
    int y=20;
    static class Inner2{
        void display()
        {
            System.out.println(x);//no problem x is a static member
            //System.out.println(y); error y is non static member
        }
    }
}
public class InnerClasses {
    public static void main()
    {
        /*Nested Inner Class example*/
        Outer O=new Outer();
        O.outerDisplay();//this method made the functionality of the inner class, so we create an object
        //of the outer class and make the functionality of the inner class through this object

        /*we can also create an object of the inner class here and make its functionality but this does
        * not make any sense*/
        Outer.Inner i=new Outer().new Inner();//when creating an object of inner class you must do it this way
        //because the inner class accesses the outer class members, so outer class constructor must be called first

        /*Local Inner-Class Example*/
        Outer2 O2=new Outer2();
        O2.display();

        /*Anonymous Inner class example*/
        Outer3 O3=new Outer3();
        O3.meth1();

        /*Static inner classes example*/
        Outer4.Inner2 i2=new Outer4.Inner2();//this is for static object creation
        i2.display();

        //Outer4.Inner2 i3=new Outer4().new Inner2(); this is for non static object creation
    }
}
