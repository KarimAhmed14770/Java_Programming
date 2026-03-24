import java.lang.*;
import java.util.Scanner;

/*to understand callback functions we need to imagine a scenario
imagine a store that has daily customers, some of these customers want to register with the store so that
the store gives them a message or a phone call before any sales or offers


 */

interface Imember{
    void callBack();
}
class Store
{
    //a store has other attributes and functionalities but lets focus on the example only
    //a store has a list of the registered members, the only functionality the store
    //wants to implement on a member is to call him before offers or sales
    Imember[] registered_members=new Imember[100];//this is an array that contains 100 members reference
    int members_count=0;

    void register(Imember m)
    {
        registered_members[members_count++]=m;
    }
}

class Customer implements Imember
{
    private String name;

    Customer(String name)
    {
        this.name=name;
    }
    @Override
    public void callBack()
    {
        System.out.println(name+" is informed");
    }
}

public class CallBackFunction {
    public static void main(String[] args)
    {
        Store adidas=new Store();
        Customer karim=new Customer("Karim Ahmed");
        Customer marwan=new Customer("Marwan Ahmed");
        adidas.register(karim);//since Customer implements interface(member) then customer is a member
        //since the interface can refer to the object that implements it
        //you can pass the object that implements it in the interface parameter
        adidas.register(marwan);
        boolean sale=true;
        if(sale)
        {
            for(int i=0;i<adidas.members_count;i++)
            {
                adidas.registered_members[i].callBack();
            }
        }
    }
}
