
/*exception handling
* what are exceptions: exceptions are runtime errors,that might be faced be the user
* we have 3 types of errors:
* 1)Syntax error:compile time error, no compilation when u write wrong syntax
* 2)Logical error: the code is compiled but functioning wrong, requires debugging
* 3)runtime errors(Exceptions):errors at runtime faced by a user, user can't solve the error
* because user can't access the program, so exceptions that might face the user must be
* predicted and handled by the developer before hitting the user experience
* they probably happen because the user misuses the program:
* 1)giving wrong input throws and exception
* 2)using a deleted field throws an exception
* 3)unavailability of resources gives an exception
* it's like if the user wants to drive but he didn't supply the car with gasoline, the problem
* is not in the car, it is in the misuse of the car
* Exceptions if not handled crashes the program, it is very bad to hand the user a program that
* crashes on facing an exception, this means the user sees u as a bad developer and u lose
* clients
* what should we do upon facing an exception?
* the developer should handle the exception and avoid the crashing of the program and inform
* the user about his misuse in a professional way.
* why is it called exception handling:
* it is like a user came and asked for a program that does certain function
* u listened to the user and u both agreed on the details but u told the user
* i will make u a calculator that divides numbers {except} division by zero won't be allowed
* this word is why it is called exception handling
*
* how to handle an exception in java
* we has three blocks try-catch-finally
* try block(where u put the lines of code that may cause an exception)
* catch block(it catches the exception and handles it if it occurs, if no exception happened
* the catch block will not process)
* finally block(it is processed whether an exception happens or not, it has some uses)
*
* what happens in sequence?
*
* if the program faced an exception, it will check i am in a try block?
* if the exception didn't happen in a try block the program will crash
* if the exception happened in a try block it will exit the try block and search for a catch
* block that catches this type of exception, if it finds the catch block then the exception
* is handled
* when the exception happens at a line in try block, rest of lines in the same block aren't
* processed the exception is handled and the block is exited
* you can have multiple catch blocks for multiple exceptions, they can be multiple catch blocks
* or nested catch blocks
*
* finally block:always gets executed whether there is an exception or not
*
* Exception classes in java:
* there are two types of exception classes in java:
* a)Built in classes                    b)user defined Exception classes
* Object class Mother class of all java classes
* |
* |
* Throwable
* |
* |______________________________________________________
* |                                                     |
* Exception(Handled by developer)                       Error (Handled by JVM)
* classNotFoundException (checked)
* IoException   (checked)
* InterruptedException  (checked)
* NumberFormatException (checked)
* RuntimeException-------------
*                             |
*                             ArithmeticException (unchecked)
*                             IndexOutOfBoundsException (unchecked)
*                             NullPointerException      (unchecked)
*
* all Exception classes fall under two categories:
* checked exceptions:the developer must handle them using try and catch, if there is a
* possibility of this exception the developer is forced to handle it
* unchecked exception: it is developer choice to handle them or not, but of course if an
* exception occurred and it was not handled the program will crash
*
*catch(Exception e) will handle any java exception
* there are some methods in the class Exception
* */

import ExceptionHandlingDemo.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] Args)
    {
        Scanner sc=new Scanner(System.in);
        ExceptionHandling demo1=new ExceptionHandling();
        System.out.println("Enter two numbers for the division process");
        int a=0;
        int b=0;
        int c=0;
        try {//sc might give an exception if the user entered invalid input
            a = sc.nextInt();
            b = sc.nextInt();
            c=a/b;
        }
        catch (InputMismatchException e)
        {
            System.out.println("Invalid Input\n"+e);
        }
        catch (ArithmeticException e)
        {
            System.out.println("No Division By zero");
        }
        finally
        {
            System.out.println("I will always be executed, i am the finally block");
        }
        System.out.println(demo1.divide(a,b));

        int A[]={11,0,13,14,15,16};
        int r=0;
        try{
            r=A[0]/A[0];//if an exception happened here it will exit the try block
            //go to the catch block that catches ArithmeticException
            System.out.println(r);
            System.out.println(A[29]);
        }
        /*catch(Exception e)
        {
           this here will cause an error, don't start with a super class exception
        }*/
        catch (ArithmeticException e)
        {
            System.out.println("No Division By zero(2)");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index Boundary issue");
        }
        /*Very important note
        * the Exception class is the super class to all java exceptions
        * if u are having multiple exceptions never start catching with the super
        * class exception,start with the sub-classes because if u start with the super
        * it will catch all the exceptions, and this will cause syntax error in java
        * */

        /*we have nested try and catch also*/
        try{
            System.out.println(A[20]);
            try{
                a=A[0]/A[1];
            }
            catch (ArithmeticException e)
            {
                System.out.println("No Division By zero(3)");
            }
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index Boundary issue(1)");
        }

        /*u can use try with finally only*/
        try{
            a=10/0;
        }
        finally {
            System.out.println("I will always be executed, i am the finally block2");
            //this will get executed before the program crashes
        }
    }
}
