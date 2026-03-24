/*Final keyword is like const in c,cpp but it has various usages
1)Final Variables
2)Final Methods
3)Final Classes

a)Final Variables:are constants with fixed values, once they are assigned they can't be changed
final variable naming convention is to make all the letters uppercase
there are 3 methods of initializing a final variable
* initializing on the time of declaration
*initializing using a static block
*initializing in the constructor, but it can only be assigned once, u can assign it in different constructors
as in the end only one constructor is performed
final variable can only be assigned once

2)Final Methods: they can't be overridden, if u write a final method this means this is the final
version of this method, and it can't be overridden, it can be inherited but can't be overridden

3)Final class:final class can't be inherited or extended

there is something called singelton class
singelton class allows only one object to be created, whoever wants to use the class functionality
can use this single object, it is like a coffee machine in workspace
 */

class My2{
    final int MIN=1;//first method of initializing
    final int MAX;
    static final int AVG;
    My2()
    {
        MAX=100;//second method of initializing
    }
    static {
        AVG=50;//third method of initializing
    }
}

/*Singelton class*/
class CoffeeMachine{
    private float coffeeQty;
    private float waterQty;
    static private CoffeeMachine our=null;

    /*u make a private constructor so that no one can create an object by the standard way*/
    private CoffeeMachine()
    {
        coffeeQty=10;
        waterQty=30;
    }
    static public CoffeeMachine coffeeMachineGetInstance()
    {
        if(our==null)
        {
            our=new CoffeeMachine();

        }
        return our;
    }
    void makeCoffee()
    {
        System.out.println("Making coffee");
    }
    void makeMocha()
    {
        System.out.println("Making Mocha");
    }
}
public class Final {
    public static void main(String[] args)
    {
        CoffeeMachine machine1=CoffeeMachine.coffeeMachineGetInstance();
        machine1.makeCoffee();
        machine1.makeMocha();
    }
}
