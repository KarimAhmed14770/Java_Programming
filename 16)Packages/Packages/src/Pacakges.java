/*a package is a collection of classes and interfaces or other packages, they are used for
* organizing a java project,if a java project contains lots of classes and interfaces, u can group
* related classes and interfaces in a single package
* in java the src file is .java, when you compile it it produces a .class file for each class
* package is like organizing classes in folders
* java provides some built-in packages, u will find them in the jdk folder lib in the src zip file
* it contains all the built-in packages provided by java
* to use a package we must provide its path and use import
* built-in packages doesn't need providing a path, import is enough
* */


/*How to create a package using cmd
*open a new folder and open cmd and create a new java class
* important:if the filename is the same as class name, this class must be public
*when u create the file make a class with the same file name as public and create a normal
* display function, and the first line of the class should be package packagename;
* if u write package mypack1; as the first line, u r telling the compiler that this class belongs to
* mypack1
* but the package hasn't been made yet
* to create the package go to cmd and type
* javac -d [PATH] file.jav
* -d makes a directory
* [PATH] is the path u want to create ur package in, if u place . it means current path
* after this line is executed u will find a folder by the name of the package, when u open this folder
* u will find a file.class
* how to add another class to the same package??
* open a new file with the class name and make the class public put the first line package packagename;
* and then compile
*
* okay then how to create a subpackage?
* the first line should be package packagename.subpackagename;
* and write the class as usual
*
* to use these packages they must exist with me in the directory of the file
*
* Access Modifiers in java, access modifiers in java are related to packages and classes as java is all
* object-oriented
* there are 4 access modifiers in java:default,public,private,protected
* okay, let's revise where we can use access modifiers
* the 4 access modifiers can be applied to any member of a class
* variables,methods,inner classes
* but the outer class can only be default or public nothing else
* we can have relationships between classes in different packages
*
* public:a public member can be accessed anywhere whether in the same package or a different package
* private:a private member can be accessed within the same class only
* default:a default member can be accessed anywhere within the same package
* protected:a protected member can be accessed anywhere within the same package, and in sub classes from
* a different package
*
 */

import java.lang.*;//i am importing this package with all its classes, this increases compile time
import java.lang.String;//i am only importing the string class, this will save compile time
import java.lang.Runnable;//i am only importing this interface, this will save compile time
import FirstPackage.*;
class sub extends Demo2{
    public void display()
    {
        System.out.println("Welcome to Demo2 "+x);
    }
}
public class Pacakges {
    public static void main(String[] args) {
        String str = new String("Hello");//i can use this if i imported the string class
        //if i didn't import it
        java.lang.String str2=new java.lang.String("hello");//this without importing
        System.out.println(str +" "+ str2);

        Demo1 d1=new Demo1();
        d1.display();
        sub s=new sub();
        s.display();
    }



}
