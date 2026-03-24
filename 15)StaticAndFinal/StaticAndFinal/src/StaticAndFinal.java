
/*Static
*static keyword is used to represent metadata, metadata is data about data,it is used to represent information
* about the class and not about a certain object,all the objects of this class share this data
* so static members are used to share information about a class
* we have, static members, static methods, static nested classes, static blocks
* class HondaCity{
    static long price=1000000;//now this is a HondaCity car class, all cars share the same price
    //but they r not all the same car, that's why we use the keyword static, to indicate this is shared data
    int x,y;
}
* note that static members(functions,classes,blocks) can't access non-static members
* if u have multiple static methods in your class, u can make an inner static class that groups all the
* static methods.
* you can't use this or super in a static method or class because they refer to object instances
*
* if u try to access a static member by using an instance of object it will give a warning because it is
* not the best practice,the best practice is to access static members through class name
* static members can be accessed using class name only without creating an object
* static members exist even if u don't create an object they don't exist in heap, they are created in
* the method area when the class is loaded
* we can create a set of statements in a block and declare them as static, these statements will then be
* executed once the class is loaded without creating an object of the class
* in a static block u can access static variables or methods or classes
* static blocks are executed the first thing in a class,even before the constructor
 */
class HondaCity{
    static long price =1000000;//this member is shared between all class objects
    //it occupies only 1 place in memory, that is seen by all class objects
    int x,y;//non-static members can have different value for each object

    static double onRoadPrice(String city)
    {//this is a static method for the information of price which may differ upon the area
        //it can only access static members of the class and can't access non-static members
        switch (city)
        {
            case "Cairo":
                price= price +1000;
                break;
            case "Giza":
                price =price+2000;
                break;
            default:
                price++;
                break;
        }
        return price;

    }
}

/*Static Blocks*/
class My{
    static int s;
    int x;
    My()
    {
        System.out.println("I am Constructor");
    }
    static {
        System.out.println("Block 1");
        s=10;
    }
    /*we can have multiple static blocks in a class, we use them to initialize static members
    * they get executed by order once the class is loaded,the class is loaded when you use it */
    static {
        System.out.println("Block 2:s= "+s);
    }

}
public class StaticAndFinal {

    public  static void main(String[] args)
    {
        HondaCity car1=new HondaCity();
        HondaCity car2=new HondaCity();
        //you can access a static member using className.member because it is static
        System.out.println(HondaCity.price);
        System.out.println(car1.price);//if u try to access a st
        System.out.println(car2.price);
        car1.price=10000;
        System.out.println(HondaCity.price);
        car1.onRoadPrice("Cairo");

        My my1=new My();
    }
}
