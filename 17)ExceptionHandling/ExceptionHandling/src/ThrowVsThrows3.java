/*continuing after main2*/

/*some functions throw an exception and doesn't handle it internally, it throws it
* to the calling function to handle it
*
*
* int meth2(){ return 10/0;}
* void meth1(){int result=meth2();}
* void main()
* {
*   meth1();
* }
*
* what happens?
* the program entered the main function, stack frame is opened for main, main called meth1()
* stack frame is open for meth1, meth1 called meth2 so stack frame is open for meth2(),
* meth2 raises an exception, the exception searches for a try-catch block in meth2 but can't
* find it in the same method, so it will return to the calling method meth1() search for
* a try-catch, it can't find it so it will go to main to search for try-catch but it won't
* find it, so main will throw the exception to JVM, if an exception Reached JVM the program
* crashes
*
* this concept is called throwing an exception
* whenever a function will have an exception, and won't handle it internally this function
* must state that it will throw an exception to the calling function
* this statement is made in the function signature in the definition
* int meth2() throws Exception{
*   return 10/0;
* }
* now any one who would call this function knows that it throws an exception and that it
* should be handled externally
* whenever a function throws an exception,if the exception is checked, the developer must
* handle it or else he will face compile error, if the exception is unchecked, the developer
* may not handle it but if it occurs the program will crash
* a function will either return a value or throw an exception
*
*
* */

class NegativeDimensionException extends Exception{
    @Override
    public String toString(){
        return "Dimension can't be Negative";
    }
}

class Rectangle{
    int area(int length,int width) throws NegativeDimensionException{
        if(length<0 || width<0)
        {
            throw new NegativeDimensionException();
        }
        return length*width;
    }
}


public class ThrowVsThrows3 {
    public static void main(String[] Args)
    {
        Rectangle r=new Rectangle();
        try {
            System.out.println(r.area(5,-3));
        }
        catch (NegativeDimensionException e)
        {
            System.out.println(e);
        }

    }
}
