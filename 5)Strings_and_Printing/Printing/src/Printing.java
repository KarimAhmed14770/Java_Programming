import java.lang.*;
import java.util.*;

/*in this file we will explore several ways of printing on the Screen*/
/*Java Provides a Class called System inside the Java.lang package,
* to see the members of this class got to cmd>> javap java.lang.system
* you will find an object
*  public static final java.io.PrintStream out;
* this out object belong to PrintStream class and the out object is attached to our
* standard output(Monitor/console)
* to know the members of the PrintStream Class*
*cmd> javap java.io.PrintStream
*you will find overloaded Method print(it is not static function so it must operate
* on an object)
*public void print(boolean);
*public void print(char);
*public void print(int);
*public void print(long);
*public void print(float);
*public void print(double);
*public void print(char[]);
*public void print(java.lang.String);
*public void print(java.lang.Object);
*
*you will find overloaded method println
*public void println(boolean);
*public void println(char);
*public void println(int);
*public void println(long);
*public void println(float);
*public void println(double);
*public void println(char[]);
*public void println(java.lang.String);
*public void println(java.lang.Object);
*you will find overloaded method printf which is similar to C printf
*public java.io.PrintStream printf(java.lang.String, java.lang.Object...);
*public java.io.PrintStream printf(java.util.Locale, java.lang.String, java.lang.Object...);
*and overloaded method format
*public java.io.PrintStream format(java.lang.String, java.lang.Object...);
*public java.io.PrintStream format(java.util.Locale, java.lang.String, java.lang.Object...);
*these are the methods that we will use mainly for printing on the screen
 */



public class Printing {
    public static void main(String[] args)
    {
        String str="Java";
        byte b=102;
        short s=300;
        int i=1200;
        long l=10023L;
        float f=50.7f;
        double d=4009;
        char ch=67;

        /*Normal Printing print(),println(), note java has escape sequences just as c*/
        System.out.print(b+"\n");//this is considered as string concatenation
        System.out.print(f);//this is printing float
        System.out.print("\nHello\ni am Karim..\n");//this is using escape sequence in string
        System.out.println(i);
        System.out.println(f+i);//the expression is evaluated to float and this is considered
        //printing a float
        //System.out.print(x,y);//syntax error this method only take 1 parameter
        //System.out.println(x,y);//syntax error this method only take 1 parameter
        System.out.println("i="+i+"\ts="+s);

        System.out.println(i+s+"Sum");//operator associativity i+s is performed first then concatenation
        System.out.println("Sum "+i+s);//concatenation is performed producing a string then another concatenation is performed
        //to avoid such things we can use parenthesis
        System.out.println("Sum "+(i+s));


        /****Formatted Printing*****/
        /* there are two functions for formatted printing which are printf and fromat and both works the same way as in
         * c programming*/
        /*Format Printing rules: %[argument_index$][flags][width][.precision]Conversion  */
        /*Conversion:
        c for char
        d for decimal
        o for octal
        x for hexadecimal
        f for floating point
        e for scientefic representation
        s for string
         */
        /*flags
        '+' to show the sign of a number
        '0' fill empty spaces with zero
        '(' if the number is negative it will be printed within brackets, if positive no brackets
        '-' to make a string left alligned
         */

        String Name="Karim";
        byte age =25;
        char grade=65;
        float score=91.456f;
        int pos=90;
        double neg=-91.4;

        System.out.printf("Hello %1$s\nyour grade is: %3$c\nprovided age is: %2$d\n",Name,age,grade);
        System.out.printf("%20s\n",Name);//the width of printing is 20
        System.out.printf("%-20s\n",Name);//flag is - width is 20, conversion from string
        //System.out.printf("%020s",Name);//this zero flag will give error, 0 flag only works with numbers and nor strings
        System.out.printf("%09d\n",age);
        /*float precision*/
        System.out.printf("%.5f\n",score);
        System.out.printf("%+d\n",pos);
        System.out.printf("%+.4f\n",neg);
        System.out.printf("%(d\n",pos);
        System.out.printf("%(f\n",neg);






    }
}
