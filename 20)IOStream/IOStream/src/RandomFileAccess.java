
/*file 7*/
import java.io.RandomAccessFile;
/*the random access file,makes us able to move with the file pointer in any direction
and we can open the file in read only,write only or rw,

 */

public class RandomFileAccess {
    public static void main(String[] args) throws Exception{
        RandomAccessFile rf=new RandomAccessFile("test","rw");
        System.out.println((char)rf.read());
        System.out.println((char)rf.read());
        System.out.println((char)rf.read());
        rf.write('D');
        rf.seek(15);//seek goes to an index from the beginning index of the file
        rf.write('Z');
        rf.skipBytes(5);
        System.out.println((char)rf.read());
        System.out.println(rf.getFilePointer());
        rf.seek(rf.getFilePointer()-10);
        rf.close();

    }
}
