
/*generics demo 2*/

/*
generalization using Object class was bad so java introduced Generics where u can make an array
that can hold any type of data but only that type, it will have typechecking and type safety
and u will state the type of it only once and won't have to type cast every time of usage
 */

/*we use <T> to state that data is generic, and use T to define a generic type*/


class GenericStandard<T>{
    @SuppressWarnings("unchecked")
    private T data[]=(T[])new Object[10];
    private int size;
    //this is the standard way to deal with generics, to make the generic type private, and
    //type cast only once with warning suppression
    GenericStandard(){
        size=0;
    }
    public void append(T value){
        data[size]=value;
        size++;
    }
    public T get(int index){
        return data[index];
    }

    public void display(){
        for(int i=0;i<size;i++){
            System.out.println(data[i]);
        }
    }
}


public class GenericsDemo<T> {//stating that the class is generic
    T data[]=(T[])new Object[3];//to make an array of genrics you must
    //create an array of Object class and then type cast it to generics array


    public static void main(String[] args){
        /*the generic erasure problem*/
        /*
        GenericsDemo<String> gd=new GenericsDemo<>();//stating that the type of object is string
        gd.data[0]="Hi";//you don't have to type cast
        //gd.data[1]=10;//this will give compile error as there is type checking in generics
        gd.data[1]="Bye";
        gd.data[2]="Yes";
         */

        /*this code will give an exception anyway
        but why is that ?
        You’ve hit the most annoying part of Java Generics: Type Erasure.Your code will actually throw
        a ClassCastException at runtime. Here is exactly what is happening under the hood and how to fix it
        .🔍 The Problem: Type ErasureIn Java, Generics only exist at compile-time. Once the code is compiled
        , Java "erases" the type $T$ and replaces it with Object.
        When you write T data[] = (T[]) new Object[3];,
        you are creating an array of Object and trying to lie to the compiler by saying "Trust me,
        this is an array of $T$."However, an Object[] is not a String[] or an Integer[].
        When you later try to access that array as a specific type, the JVM realizes the lie and crashes.

        solutions:
        1)Use an Object array internally (The standard way)
        This is how the internal ArrayList in Java works. You keep the array as Object[],
        and only cast the individual elements when you get() them.
        public class GenericsDemo<T> {
        // Keep it as Object[] internally
        private Object[] data = new Object[3];

        public void set(int index, T value) {
            data[index] = value;
        }

        @SuppressWarnings("unchecked")
        public T get(int index) {
        // Cast the single element here
        return (T) data[index];
        }

    public static void main(String[] args) {
        GenericsDemo<String> gd = new GenericsDemo<>();
        gd.set(0, "Hi");
        String s = gd.get(0); // Works perfectly
        System.out.println(s);
    }
}
         */
        GenericStandard<String> g=new GenericStandard<>();
        g.append("Hi");
        g.append("Bye");
        g.append("yes");
        g.append("no");

        g.display();
        System.out.println(g.get(2));

        GenericStandard<Integer> g2=new GenericStandard<>();
        g2.append(10);
        g2.append(11);
        g2.append(12);
        g2.append(13);
        g2.display();
        System.out.println(g2.get(1));

        }
    }

