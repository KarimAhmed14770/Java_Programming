
package javaapplication;

public class JavaApplication {
    /*Operators and Expressions*/
  
    public static void main(String[] args) {
        // TODO code application logic here
        /*Arithmetic Operators: +,-,*,/,%*/
        /*+,-,*,/
        can be performed on any datatype except booleans(int,float,double,char)or mix of them
        % can be performed on integers or floats
        Expressions:
        Arithmetic Operators Precedence
        1)*,/,%
        2)+,-
        */
        int a=5,c=2;
        System.out.println(a+c/2);
        System.out.println(a*a+c*c/2);
        
        /*The resulted data type of an expression
        any combinations of byte,short,int will produce int data type, byte + byte gives integer expression
        i+f =float result (operation not only +, any arithmetic operation
        i+f the compiler will first cast the integer into float and then perform arithmetic operation on two floats
        l+f gives float result
        char can be used to hold numbers of size 2 bytes
        l+d will give double result
        the result of an expression is */
        byte b=10;
        short s=7;
        int i=9;
        long l=78l;
        float f=12.34f;
        double d=44.56d;
        char ch=78;
        
        int result;
        result=b+s;
        System.out.println(result);
        result=b/s;
        System.out.println(result);
        result=b%s;
        System.out.println(result);
        result=ch+i;
        System.out.println(result);
        
        
        
        
        
        

    }
    
}
