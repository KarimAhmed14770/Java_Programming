import java.lang.*;
import java.util.*;

/*
public java.lang.String[] split(java.lang.String, int);,takes a patern to split upon string and number
of splits
public java.lang.String[] splitWithDelimiters(java.lang.String, int);
public java.lang.String[] split(java.lang.String);
*/
public class StringChallenges {
    public static void main(String []args)
    {
        /**Challenge 1:given an email we want to classify if its gmail or not,and extract username**/
        String mail="karim.ahmed8025@gmail.com";
        String mailProvider="";
        String userName="";
        userName=mail.split("@",2)[0];
        System.out.println(userName);
        mailProvider=(mail.split("@",2)[1]).split(".com",2)[0];
        System.out.println(mailProvider);

        /*Challenge2:Write a regular expression to check
        * a)if a number is binary or not
        * b)if a number is hexa or not
        * c)if a number is in date format or not
        */
       /* Scanner sc=new Scanner(System.in);

        System.out.println("Enter a binary number:");
        String binary=sc.nextLine();
        if(binary.matches("0*b*[01]+"))
        {
            System.out.println(binary +" is binary");
        }
        else
        {
            System.out.println(binary +" is not binary");
        }

        System.out.println("Enter a Hexadecimal number:");
        String hexaDecimal=sc.nextLine();

        if(hexaDecimal.matches("0*x*X*[0-9A-Fa-f]+"))
        {
            System.out.println(hexaDecimal +" is Hexadecimal");
        }
        else
        {
            System.out.println(hexaDecimal +" is not Hexadecimal");
        }

        System.out.println("Enter a Date in the format dd/mm/yyyy");
        String date=sc.nextLine();
        if(date.matches("[0-3]?[0-9]?/[0-1]?[0-9]?/\\d+"))
        {
            System.out.println(date +" is date");
        }
        else
        {
            System.out.println(date +" is not valid date");
        }
*/
        /*Challenge3:Write a regular expression to check
         * a)remove special characters from a string
         * b)if there is more than one space between words make it only 1
         * c)find number of words in a string
         */
        String Name2="K@arim.. Ahmed@@&*Ha(@m!^dy";
        String modifiedName=Name2.replaceAll("\\W","");
        System.out.println(modifiedName);

        String Words2="yesterday    i went to the     bahamas   lucky  me the   food    was great.";
        String modifiedWords=Words2.replaceAll("  +"," ");
        System.out.println(modifiedWords);

        String Article="Generally speaking, the atomic bomb made by oppenheimer was a disaster, a new" +
                "era has begun and the hydrogen bomb became just a matter of time, i guess humans are" +
                "gonna destroy the world";

        String[] Words=Article.split("[ (, )]");
        System.out.println(Words.length);


    }
}
