/*
can we create local variables in lambda ?

 */

interface MyLambda2{abstract public void display();}


public class Demo3 {
    static int z=10;

    public static void main(String[]Args){
        int x=0,y=0;
        changeZ();
        MyLambda2 m=()->{
            int count=0;//it is normal to create local variable inside a lambda expression
            count++;
            System.out.println("Hi");
            System.out.println("Bye"+count);
            System.out.println(x);//though x is not final but it is effectively final
            //because it was never modified.


            //System.out.println(y);this is not accepted because it is not final and it is modified
            //outside the lambda scope
            /*a lambda expression can only access final or effectively final variables
            outside its scope

            but note: if lambda is defined within a class that has variable members, lambda can
            access them whether they are final or not
            * */
            System.out.println(z);
        };
        y++;

        m.display();
    }
    private static void changeZ(){
        z++;
    }
}
