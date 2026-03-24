package ExceptionHandlingDemo;

public class ExceptionHandling {
    public int divide(int a,int b)
    {
        int result=0;
        try{
            result=a/b;
        }
        catch (ArithmeticException e)
        {
            System.out.println("Can't divide by zero");
        }
        return result;
    }
}
