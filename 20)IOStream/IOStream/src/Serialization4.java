/*the last file in the serialization problem*/

/*we want to write an entire object or read an entire object from a file , so we will use
 * ObjectInputStream
 * ObjectOutputStream
 *
 * note that for an object to become serializable its class must implement serializable interface
 * and it must have a non parameterized constructor even if it is empty
 *
 * */

import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;



public class Serialization4 {
    public static void main() throws Exception{
        FileInputStream fis=new FileInputStream("D:/Studies/Programming/Java/Practice/student3.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Student3 s=new Student3();
        s=(Student3)ois.readObject();
        System.out.println(s);
        ois.close();
        fis.close();
    }
}
