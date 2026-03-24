
/*file1*/

/*how to write to a file*/


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] Args) {

        try {
            /*1 write an array of bytes to a file*/
            FileOutputStream fos = new FileOutputStream
                    ("D:/Studies/Programming/Java/Practice/test.txt");
            //if the file exists it will open it, if it doesn't exist it will create it and open it

            String str="Hello Files Karim the King is here";
            fos.write(str.getBytes());
             /*
            note if the file already exists and u write to it this way, u r writing a new content
            the old content will be lost
             */
            fos.close();

            /*2 write byte by byte using a for loop*/
            FileOutputStream fos2 = new FileOutputStream
                    ("D:/Studies/Programming/Java/Practice/test2.txt");
            byte[] b=str.getBytes();
            for(byte x : b){
                fos2.write(x);
            }
            fos2.close();



        }
        catch (FileNotFoundException e){
            System.out.println(e);
        }
        catch (IOException e){
            System.out.println(e);
        }


        /*try with resources*/
        /*why use try with resource?
        The try-with-resources statement is one of those Java features that makes life significantly easier
        by handling the "cleanup" work for you. When dealing with FileOutputStream, it ensures that the
        file stream is closed automatically, preventing memory leaks and file locking issues.
        Before Java 7, you had to manually close your streams in a finally block. This was clunky and often
        led to "Resource Leaks" if a developer forgot to write the closing logic or if an error occurred during
        the closing process itself.
        With try-with-resources, any object that implements the java.lang.AutoCloseable interface
        (which FileOutputStream does) will be automatically closed at the end of the statement,
        regardless of whether the code finished successfully or threw an exception.
         */
        try(FileOutputStream fos3=new FileOutputStream("D:/Studies/Programming/Java/Practice/test3.txt")){
            String str="Hello Files Karim the King is here";
            byte[] b=str.getBytes();
            fos3.write(b,12,str.length()-12);
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}
