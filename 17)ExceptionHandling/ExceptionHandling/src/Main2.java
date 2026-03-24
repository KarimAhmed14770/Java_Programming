/*Continuing on Main1 but in a new file*/

/*Exception class has some methods
* .String getMessage();
* .string toString();
* both of them returns a message about the exception but they work differently
*
* .void printStackTrace(); returns the stack trace and function calling sequence to trace
* where the exception has occurred and where it was thrown
* public int meth2()
    {
        return 10/0;
    }
    public int meth1()
    {
        return meth2();
    }
    * and in main u called meth1();
    * printStackTrace(); informs u of the exception place and the trace sequence
*
* how to write a userdefined Exception
* class classNameException extends Exception{
* @Override
* public string toString()
* {
*   return "Exception message";
* }
* }
* this is how to define a new exception, u extend exception class and override method
* .getcause() returns the exception cause
* */

class MyException extends Exception
{
    @Override
    public String toString()
    {
        return "MyException arised";
    }
}
public class Main2 {

    public static void main(String[] Args)
    {
        ArithmeticException e=new ArithmeticException();
        System.out.println(e.getMessage());
        System.out.println(e);//toString is called automatically

    }
}
