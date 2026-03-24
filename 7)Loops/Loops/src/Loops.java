import java.lang.*;
import java.util.*;



/* in this file we explain loops in java, there are 4 loops in java(while,do-while,for,for each)
we use while loop when we want to loop based on a condition, and for loop when we know the number
of repetitions that the loop requires.
syntax:
while(condition)
{
    body
    condition update
}

do{
    body
    condition update
}while(condition);

for(initialization;condition;update) the three are optional
{
    body
}
ex: for(int i=0;i<10;i++)
{
    s.o.p(i);
}
you can do more than one initialization and updates
for(int i=0,j=0;i<=9;i++,j++)
{
    body
}
for(int x :A) where A is an array of integers, this is the for each loop
{
    s.o.p(x);
}


 */
public class Loops {
    /*challenge 4: convert a given string to an int*/
    static int stringToInt(String s)
    {
       int result=0;
        for(int index=0,power=s.length()-1;index<s.length();index++,power--)
        {
            boolean shouldBreak=false;
            switch(s.charAt(index))
            {
                case '0':
                    result+=0;
                    break;
                case '1':
                    result+=((int)Math.pow(10,power));
                    break;
                case '2':
                    result+=2*((int)Math.pow(10,power));
                    break;
                case '3':
                    result+=3*((int)Math.pow(10,power));

                    break;
                case '4':
                    result+=4*((int)Math.pow(10,power));
                    break;
                case '5':
                    result+=5*((int)Math.pow(10,power));
                    break;
                case '6':
                    result+=6*((int)Math.pow(10,power));
                    break;
                case '7':
                    result+=7*((int)Math.pow(10,power));
                    break;
                case '8':
                    result+=8*((int)Math.pow(10,power));
                    break;
                case '9':
                    result+=9*((int)Math.pow(10,power));
                    break;
                default:
                    shouldBreak=true;
                    System.out.println("Invalid Input");
                    break;

            }
            if(shouldBreak)
            {
                break;
            }
        }
       return result;
    }

    static double stringToFloat(String s){
        String intPart=s.substring(0,s.indexOf('.'));
        String floatPart=s.substring(s.indexOf('.')+1);
        boolean shouldBreak=false;
        double result=0;
        result+=stringToInt(intPart);
        for(int index=0;index<floatPart.length();index++)
        {
            switch (floatPart.charAt(index))
            {
                case '0':
                    result+=0;
                    break;
                case '1':
                    result+=(Math.pow(10,-(index+1)));
                    break;
                case '2':
                    result+=2*(Math.pow(10,-(index+1)));
                    break;
                case '3':
                    result+=3*(Math.pow(10,-(index+1)));

                    break;
                case '4':
                    result+=4*(Math.pow(10,-(index+1)));
                    break;
                case '5':
                    result+=5*(Math.pow(10,-(index+1)));
                    break;
                case '6':
                    result+=6*(Math.pow(10,-(index+1)));
                    break;
                case '7':
                    result+=7*(Math.pow(10,-(index+1)));
                    break;
                case '8':
                    result+=8*(Math.pow(10,-(index+1)));
                    break;
                case '9':
                    result+=9*(Math.pow(10,-(index+1)));
                    break;
                default:
                    shouldBreak=true;
                    System.out.println("Invalid Input");
                    break;

            }
            if(shouldBreak)
            {
                break;
            }
            }

        return result;
    }

    static int fibonnaci(int nth_term)
    {
        int fibn_2=0;
        int fibn_1=1;
        int fib=0;
        if(nth_term==0)
        {
            fib=0;
        }
        else if(nth_term==1)
        {
            fib=1;
        }
        else {
            for (int i = 2; i <= nth_term; i++) {
                fib = fibn_2 + fibn_1;
                fibn_2 = fibn_1;
                fibn_1 = fib;
            }
        }
        return fib;
    }

    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        /*Challenge 1:display multiplication table*/
        /*
        int inputNumber;
        System.out.println("Enter a Number to get its multiplication table:");
        inputNumber=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(inputNumber+" * "+i+" = "+(inputNumber*i));
        }
        */

        /*challenge 2: find sum of n numbers*/
        /*
        int inputNumber1;
        System.out.println("Enter a Number to get the sum");
        inputNumber1=sc.nextInt();
        int sum=0;
        for(int i=1;i<=inputNumber1;i++)
        {
            sum+=i;
        }
        System.out.println("Sum= "+sum);
         */
        /*challenge 3: get the factorial of a number */
        /*
        int inputNumber2;
        System.out.println("Enter a Number to get the factorial");
        inputNumber2=sc.nextInt();
        int factorial=1;
        for(int i=1;i<=inputNumber2;i++)
        {
            factorial*=i;
        }
        System.out.println("Factorial= "+factorial);

         */

        /*challenge 4:convert a given integer in string format to an int*/
        String number="257602010";
        int num=stringToInt(number);
        System.out.println(number+5);
        /*challenge 5:convert a given float in string format to a double*/
        String number2="257602010.92341";
        double num2=stringToFloat(number2);
        System.out.printf("%f\n",num2);

        /*challenge 6: fibonacci**/
        System.out.println(fibonnaci(9));


        /*Patterns*/
        /*challenge 1:1 2 3 4 5
        *             1 2 3 4 5
        *             1 2 3 4 5
        * */
        int rows_num=5;
        int col_num=5;
        for(int i=0;i<rows_num;i++)
        {
            for(int j=0;j<rows_num;j++)
            {
                System.out.print((j+1)+" ");
            }
            System.out.println("");
        }
        System.out.println("\n");
        /*challenge 2: 1 1 1 1 1
         *             2 2 2 2 2
         *             3 3 3 3 3
         * */
        for(int i=0;i<rows_num;i++)
        {
            for(int j=0;j<rows_num;j++)
            {
                System.out.print((i+1)+" ");
            }
            System.out.println("");
        }

        /*challenge 2: 1
         *             1 2
         *             1 2 3
         * */
        for(int i=0;i<rows_num;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print((j+1)+" ");
            }
            System.out.println("");
        }
    }
}
