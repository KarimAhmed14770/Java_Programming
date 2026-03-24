import java.lang.*;
import java.util.Scanner;


/*
*what is a method? in modular programming it is called a function, in object-oriented programming
* it is called a method, in java everything is object-oriented.
* classes contain data and methods, methods are the functionality of the class
* method writing syntax:
* ReturnType methodName(parameterList)
* {
*   body;
* }
* static methods can be called without an instance of the class, and non-static methods must perform on
* an object created from the class.
* in java parameters passing is only done by copying the content of the actual parameters into the
* formal parameters
* public static add(int x,int y) x and y are formal parameters, they are created in the function stack
* {
*   return x+y;
* }
* ex: int a=5;int b=7; a and b are actual parameters they are created in the calling function(main) stack
* add(5,7); 5 is copied into x, and 7 is copied into y, note that x is not a and y is not b
* any change in x or y will not affect a or b unless they are references.
* the only way of parameters passing in java is by copying values, but if these values are references then
* the formal parameter has access to the actual parameters
*
* method overloading:creating a function with the same name but with different parameter lists
* upon calling the function it performs the function based on the parameter list
*/


/*Variable arguments methods
if we want a method to take a variable number of arguments and still work
Datatype method_name(datatype ...var_argName) the three dots determine that this is a variable argument
you can only have 1 variable argument per method and it must be the last parameter in a method
the name of varArg becomes a reference to the parameters in memory which are arranged like an array

Command line arguments, arguments given on the run of the file using command line


Recursion is when a function calls itself

 */
public class Methods {
    public int add(int a, int b)
    {
        return a+b;
    }
    static void check_passing(int a, int b)
    {
        a=5;
        b=6;
    }
     float add(float a,float b)
    {
        return a+b;
    }
     double add(double a, double b)//check the overloading by using break points
    {
        return a+b;
    }

    static void show(int ...x)
    {
        for(int i=0;i<x.length;i++)
        {
            System.out.print(x[i]+" ");
        }
        System.out.println();

    }
    static void printList(int start,String ...s)
    {
        for(int i=0;i<s.length;i++)
        {
            System.out.println(start+". "+s[i]);
            start++;
        }
    }
    static void recurive1(int n)
    {
        if(n>0)
        {
            System.out.println(n);
            recurive1(n-1);
        }
    }
    static void recurive2(int n)
    {
        if(n>0)
        {
            recurive2(n-1);
            System.out.println(n);

        }
    }
    public static void main(String[]args)
    {
        int x=3;int y=5;double a=3; double b=9.5; float c=5.2f; float d=3.2f;
        Methods mt=new Methods();
        System.out.println(mt.add(x,y));//to use a non-static method you create an object of the class
        System.out.println(mt.add(a,b));
        System.out.println(mt.add(c,d));
        check_passing(x,y);
        System.out.println("x= "+x+"\ty= "+y);//x and y will not change
        show(1,2,3,4,5,6,7,8,9);
        show(new int[]{10,20,30});
        printList(5,"Karim Ahmed","Marwan Ahmed","Zyad Waheed");
        for(int i=0;i< args.length;i++)
        {
            System.out.println("arg["+i+"]= "+args[i]);
        }
        recurive1(5);
        recurive2(5);

    }

}
