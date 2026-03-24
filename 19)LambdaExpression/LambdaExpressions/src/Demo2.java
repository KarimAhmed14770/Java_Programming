


/*
lambda expression syntax
 MyLambda m2=()->{
            System.out.println("lambda expression");
        };
        m2.display();
 (parameters list) ->{
    Body
 }

 if you have ony 1 parameter you can omit braces
 if u have body as a single statement you can omit braces
 if u use braces u must use return


a functional interface might have multiple static or default methods as long as it has only
one abstract method
* */

/*
* you can replace lambda expression with method reference
*
* My m2=System.out::println
* */
@FunctionalInterface
interface My2{
    public abstract void display(String str);
}



@FunctionalInterface
interface My3{
    public abstract int add(int a,int b);
}





public class Demo2 {
    public static void main(String[] Args){
        My2 m=(s)->{
            System.out.println(s);
        };

        m.display("kimo is here");


        My2 m2=s->System.out.println(s);
        m2.display("kimo");

        My2 m3=System.out::println;//method reference
        m3.display("bye");

        My3 m1=(a,b)->{
            return a+b;
        };
        System.out.println(m1.add(5,10));
    }
}
