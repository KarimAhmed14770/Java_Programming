
/*generics demo 1*/

/*
* generics are used for generalization, before generics were introduced, Object class was used for
* generalization, but it had some drawbacks:
* Object class is a parent class for any java class, so a reference of object class can refer to any type
* of data class
* but for a child class to refer to object class it must use type casting
*
* look at the below code you will find that:
* Object class can be used for generalization but with drawbacks:
* 1)there is no type checking safety
* 2)you must always do type casting
* 3)if you make an array u can't guarantee it all carries the same data type
*
* we don't want that, we want to use generics so that we can make an array that holds any datatype but
* only that datatype, with type checking and no type casting headache everytime
* */


public class Generics {
    public static void main(String[] args){
        Object obj=new String("Hello");
        Object obj2=new Integer(20);
        Object objArr[]=new Object[3];

        //String str=obj;//this will give compile error because there is no type casting
        String str=(String) obj;//this will work fine at compile and runtime, because obj refers to
        //a string and it is being type casted to a string

        //str=(String) obj2;//this will compile fine with no errors because genralization using
        //Object class has no type checking safety, but it will give runtime exception as integer
        //can't be casted to a string

        objArr[0]=new String("Hi");
        objArr[1]=new String("Bye");
        objArr[2]=new Integer(10);
        /*this will allow different types of data in the array and will compile fun without warning us
        that datatypes are different
         */
    }
}
