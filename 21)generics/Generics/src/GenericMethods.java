
/*generic 4*/

/*
* just like generic classes we can have generic methods
* to define a generic method we put the generic before the return type
* we can make a genric method inside a class that is not generic
* we can make a generic argument within a method that is not generic using wildcard
* */


@SuppressWarnings("unchecked")
class MyGeneric2<T>{
    private T[] data=(T[])new Object[10];
    private int length;

    MyGeneric2(){
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

class GenericMethodsDemo{
    /*generic methods*/
    public static <T>void display(T[] list){
        for(T x:list){
            System.out.println(x);
        }
    }
    public static <E extends Number>void show(E... list){//variable argument of any type
        for (E x:list){
            System.out.println(x);
        }
    }

    /*generic arguments*/
    public static void fun(MyGeneric2 obj){//Mygeneric2 is a generic class so making
        //a parameter of it is passing a generic atgument
        obj.display();
    }
    //same could be done using wild card<?>
    public static void fun2(MyGeneric2<?> obj){
        obj.display();
    }

    public static void fun3(MyGeneric2<? extends Number> obj){
        obj.display();
    }

    /*u can set an upperbound usign wild card<? extends Number> any class that extends Number
    or lower bound <? super Number> any class that is super to number
     */
}

public class GenericMethods {
    public static void main(String[] args){
        GenericMethodsDemo.show(10,20,30,40);
        //GenericMethodsDemo.show("Hi","bye","Good","Boy");
        GenericMethodsDemo.show(10.2,20.4,30.3,40.3);

        GenericMethodsDemo.display(new String[]{"kimo","Bebo","ronaldo"});
        MyGeneric2<String>a=new MyGeneric2<>();
        a.append("Kimo");
        a.append("meero");

        MyGeneric2<Double>b=new MyGeneric2<>();
        b.append(10.0);
        b.append(20.1);

        GenericMethodsDemo.fun(a);
        GenericMethodsDemo.fun(b);

        GenericMethodsDemo.fun2(a);
        GenericMethodsDemo.fun2(b);

        //GenericMethodsDemo.fun3(a);will cause exception
        GenericMethodsDemo.fun3(b);

    }
}
