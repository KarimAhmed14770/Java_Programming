import java.lang.*;

/*
*this file explains regular expressions, they are used for pattern matching,searching
* for single characters we have
* Regular Expression                Description
* 1) .                              it means any single character is accepted
* 2) [abc]                          it means a single character of a or b or c
* 3) [abc][VZ]                      it means the first char must be a or b or c and the second V or Z
* 4)[^abc]                          the char can be anything except a or b or c
* 5)[a-z1-9]                        range from a to z or from 1 to 9, only single character
* 6) A|B                            A or B are accepted
* 7) XZ                             exactly XZ
*
* there are other characters called Meta characters
* Regular Expression                Description
* 1)\d                              for digits
* 2)\D                              anything except digits
* 3)\s                              for space
* 4)\S                              anything except spaces
* 5)\w                              digits or alphabets
* 6)\W                              anything except digits or alphabets
* note they must be written \\ with two slashes in a string to avoid escape sequence
*
* then there are quantifiers:they determine the number of characters allowed in the pattern
*
* Regular Expression                Description
* 1)*                               0 or more
* 2)+                               1 or more
* 3)?                               0 or once
* 4){m}                             exactly m times
* 5){m,n}                           ranges from m times to n times
*/


/*there is a method in the string class
* public boolean matches(java.lang.String);it checks whether a string matches the input pattern or not
*/
public class RegularExpressions {
    public static void main(String[] args)
    {
        String str="Hello";
        String str2="@";
        System.out.println(str.matches("Hello"));
        System.out.println(str.matches("Helo"));
        System.out.println(str2.matches("."));
        System.out.println("karim.ahmed14770@gmail.com".matches("(.+)@\\w+.com"));



    }
}
