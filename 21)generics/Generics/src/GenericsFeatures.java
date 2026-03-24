
/*generics 3*/


/*some questions need to be answered
* 1)what happens if io didn't mention type while decalring a generic class?
* nothing will happen, it will allow the class to hold any datatype
*
* 2)can i declare multiple parameters for a generic ex<T,K>?
* yes u can, it is used with pairing or mapping or key-value types
*
*
* 3)what happens if a class extends a generic class?
* like any class it takes all its functionalities
*
* 4)can we limit the DataTypes that T can be ?
* yes we can do this using bounded types
* if we write <T extends class>, t can only be of this class type or any class that is child to it
* */

@SuppressWarnings("unchecked")
class MyGeneric<T>{
    private T[] data=(T[])new Object[10];
    private int length;

    MyGeneric(){
        length=0;
    }

    public void append(T value){
        data[length++]=value;
    }

    public T get(int index){
        return data[index];
    }
    public void set(int index,T value){
        data[index]=value;
    }
    public void display(){
        for(int i=0;i<length;i++){
            System.out.println(data[i]);
        }
    }
}
/*2)can i declare multiple parameters for a generic ex<T,K>?
* yes u can, it is used with pairing or mapping or key-value types*/
@SuppressWarnings("unchecked")
class MyDict<Key,Value>{
    Key[] keys=(Key[])new Object[10];
    Value[] values=(Value[])new Object[10];
}


/*3)what happens if a class extends a generic class?
* it can happen in 3 different ways
* */
//first method
class Sub extends MyGeneric{

}

//second method
class Sub2 extends MyGeneric<String>{

}

//third method
class Sub3<T> extends MyGeneric<T> {

}

/*4)can we limit the DataTypes that T can be ?
* yes we can do this using bounded types
* if we write <T extends class>, t can only be of this class type or any class that is child to it
*/


class MyNumbers<T extends Number> extends MyGeneric<T>{

}

public class GenericsFeatures {
    public static void main(String[] args){
        /*1)what happens if io didn't mention type while decalring a generic class?
        * nothing will happen, it will allow the class to hold any datatype
        * */
        MyGeneric gen=new MyGeneric<>();
        gen.append(10);
        gen.append("Hello");
        gen.display();

        /*3)what happens if a class extends a generic class?*/
        Sub g=new Sub();
        g.append(10);
        g.append(12.5f);
        g.append("Hey");
        g.display();

        Sub2 s=new Sub2();
        //s.append(10);will not happen because it extends as a string

        s.append("Bye");
        s.append("i am karim");
        s.display();

        Sub3 <Integer> s3=new Sub3<Integer>();
        s3.append(10);
        s3.append(20);
        //s3.append("hi");
        s3.display();

        MyNumbers<Float> mn=new MyNumbers<Float>();
        mn.append(12.5f);
        mn.append(13.2f);
        mn.display();
       // MyNumbers<String> mn=new MyNumbers<String>(); can't happen due to bounded types
    }
}
