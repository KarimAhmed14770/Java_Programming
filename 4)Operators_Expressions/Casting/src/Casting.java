
/*This file explains Implicit casting(Widening conversion) and Explicit casting
(narrowing conversion) in Java
 */

/*1)Implicit casting(Widening Conversion)
it happens automatically and safely(without data loss)
it happens when you try to store a lower size data type into a bigger size data type
byte → short → int → long → float → double
        ↑
       char → int → ...
 */

/*2)Explicit casting(Narrowing Conversion)
it is done manually, and has the risk of data loss
converting larger data type into smaller one
syntax (target type) expression
if you try to put a larger data type into a smaller one without explicit casting you will
have an error in java
 */

public class Casting {
    public static void main(String[] args) {
        byte b = 10;
        short s = 9;
        int i = 12;
        long l = 1900;
        float f = 5f;
        double d = 60d;
        char c = 67;
        boolean bol = true;
        /*Implicit Casting vs explicit casting*/
        s = b; //b is of type byte it is automatically cast to type short
        i=s; //s is of size short, it is automatically cast to int
        i=b; // b is of byte type, it is automatically cast to int
        //b=s; this will give error because you can't put larger size into smaller without
        //explicit casting or else you will face compile time error
        b=(byte)s; /*explicit casting, done manually, data loss risk*/
        s=(short)i;
        l=i;
        i=(int)l;
        f=l;
        l=(long)f;//possible data loss
        //f=5.6;will give error because 5.6 is double literal in java
        f=(float)5.6;
        d=f;
        f=(float)d;
        i=c;
        d=c;
        f=c;
        b=(byte)c;
        //c=b;//note you can't store byte in c automatically
        //c=s;//note you can't store a short in c automatically
        //c=i;//you can't store int in c automatically
        c=(char)b;
        c=(char)s;
        c=(char)i;
        //s=c;//u can't store c into s automatically
        s=(short)c;
        i=c;//u can store c into int directly




    }

}
