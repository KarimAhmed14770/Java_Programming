
/*file5*/


/*Buffered streams are attached on another stream to provide a temporary memory
so that we can go forward and backwards in this memory and process it

Note that in file stream we can't move except in forward direction

 */
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;


public class BufferedStreams {

    public static void main(String[] Args) throws Exception{

        FileInputStream fis=new FileInputStream("test");
        BufferedInputStream bis=new BufferedInputStream(fis);
        int x;
        for (int i=0; i<10;i++){
            x=bis.read();
            System.out.print((char)x);
        }
        System.out.println();
        bis.mark(20);
        for (int i=0; i<10;i++){
            x=bis.read();
            System.out.print((char)x);
        }
        System.out.println();
        bis.reset();

        for (int i=0; i<6;i++){
            x=bis.read();
            System.out.print((char)x);
        }
        System.out.println();
        bis.close();
        fis.close();


    }
}
