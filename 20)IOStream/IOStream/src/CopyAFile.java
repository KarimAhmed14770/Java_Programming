

/*file3*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyAFile {

    public static void main(String[] Args){
        try(FileInputStream fis=new FileInputStream("D:/Studies/Programming/Java/Practice/test4.txt");
            FileOutputStream fos=new FileOutputStream("D:/Studies/Programming/Java/Practice/copied.txt"))
        {
            int x=0;
            while((x=fis.read())!=-1){
                if(x>=65 && x<=90){
                    x+=32;
                }
                fos.write(x);
            }

        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}
