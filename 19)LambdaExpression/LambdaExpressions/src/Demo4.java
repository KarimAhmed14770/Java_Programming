
/*can we pass a lambda expression as a parameter to a function?
* yes we can
* */

interface Lambda{
    public abstract void display();
}

class UseLambda{
    public void callLambda(Lambda l){
        l.display();
    }
}
public class Demo4 {
    public static void main(String[] Args){
        UseLambda ul=new UseLambda();
        ul.callLambda(()->{System.out.println("Hello");});
    }
}
