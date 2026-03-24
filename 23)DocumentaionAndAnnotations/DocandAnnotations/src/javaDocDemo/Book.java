/**java package
 * @author Karim Ahmed
 * @version 2.0
 * @since 2023
 */

package javaDocDemo;

/**This is a class for library book
 * @author Karim Ahmed
 *
 **/
public class Book {
    /**
     * Static variable for the maximum retry count.
     * The default value is 10.
     */
    public static int value=10;

    /**
     *Parameterized Constructor
     * @param s  Book Name
     */
    public Book(String s){

    }

    /**
     *Issue a book to a student
     * @param roll  the roll number of a student
     * @throws Exception  if book is not available throw the exception
     *
     */
    public void issue(int roll)throws Exception{

    }

    /**
     * checks if a book is available or not
     * @param str book name
     * @return returns 1 if book is available else returns 0
     */

    public boolean isAvailable(String str){
        return true;
    }
}
