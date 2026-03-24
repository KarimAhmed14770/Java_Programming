
/*
lambda expressions are used to define anonymous functions(nameless methods)
they are implemented with the use of an interface

In simple terms, a Lambda is an anonymous function— a function that doesn't have a name,
a return type, or a class. It allows you to treat "behavior" as "data."

lambda can only be used with a functional interface
 */

/*example*/
@FunctionalInterface
        /*if an interface contains only 1 abstract function, it is called functional interface*/
interface MyLambda {public abstract void display();}

class My implements MyLambda{
    @Override
    public void display() {
        System.out.println("Normal class implementing an interface");
        /*this is the normal usage of a class implementing an interface*/
    }
}



/*
lambda expression syntax
 MyLambda m2=()->{
            System.out.println("lambda expression");
        };
        m2.display();
 (parameters list) ->{
    Body
 }

 if you have ony 1 parameter you can omit braces
 if u have body as a single statement you can omit braces
 if u use braces u must use return

* */


public class Demo1 {
    public static void main(String[] Args) {
        MyLambda ml = new MyLambda() {
            @Override
            public void display() {
                System.out.println("Anonymous Class implementing an interface");
                /*this is a second method of implementing an interface using anonymous class*/
            }
        };

        My m = new My();

        m.display();
        ml.display();
        System.out.println("till now there is no lambda expressions involved");

        MyLambda m2=()->{
            System.out.println("lambda expression");
            /*this is a lambda expression and this definition will be bounded to display
            * function in the interface because it is the only function there
            * since it is a functional interface*/
        };
        m2.display();


    }



}
