import java.lang.*;
import java.util.*;

/*in this file we study conditional statements in java
* there are two statements for control flow based on a condition if-else, switch
*if(condition)
* {
*
* }
* else if(condition)
* {
*
* }
* else
* {
*
* }
*
* switch(expression)
* {
*   case value1:
*
*   break;
*
*   case value2:
*
*   break;
*
*   default:
*
*   break;
* }
*
* Relational operators(<,<=,>,>=,==,!=)
* Logical Operators(&&,||,!)
 */

public class ConditionalStatements {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        /*challenge 1 find if a given number is odd or even*/
        /*int inputNumber;
        System.out.println("Enter an Integer: ");
        inputNumber=sc.nextInt();
        if(inputNumber%2==0)
        {
            System.out.println(inputNumber+" is even");
        }
        else
        {
            System.out.println(inputNumber+" is odd");
        }*/
        /*challenge 2 :decide if a person is young or old*/
        /*System.out.println("Enter your Age: ");
        int inputAge;
        inputAge=sc.nextInt();
        if(inputAge<=50)
        {
            System.out.println(inputAge+" is young");
        }
        else
        {
            System.out.println(inputAge+" is old");
        }*/
        /*check the radix of a number*/
       /* System.out.println("enter a number in any numbering system(binary,octal,decimal,hexadecimal:");
        String input=sc.nextLine();
        if(input.matches("[0]?[b|B]?[0-1]+"))
        {
            System.out.println(input +" is a binary number");
        }
        else if(input.matches("[0]?[o|O]?[0-7]+"))
        {
            System.out.println(input +" is a Octal number");
        }
        else if(input.matches("[0-9]+")) {
            System.out.println(input + " is a decimal number");
        }
        else if(input.matches("[0]?[x|X]?[0-9A-Fa-f]+"))
        {
            System.out.println(input +" is a Hexadecimal number");
        }
        else
        {
            System.out.println("Invalid Input");
        }
        */

        int day_no=1;
        switch (day_no)
        {
            case 0:
                System.out.println("Friday");
                break;
            case 1:
                System.out.println("Saturday");
                break;
            case 2:
                System.out.println("Sunday");
                break;
            case 3:
                System.out.println("Monday");
                break;
            case 4:
                System.out.println("Tuesday");
                break;
            case 5:
                System.out.println("Wednesday");
                break;
            case 6:
                System.out.println("Thursday");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
