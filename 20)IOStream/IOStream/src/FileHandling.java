
/*file 8*/
import java.io.File;
import java.io.FileOutputStream;

/*File class is used for handling files and getting information about files*/


public class FileHandling {
    public static void main(String[] args)throws Exception{
        File dir=new File("D:/Studies/Programming/Java/Practice");//this is a directory
        File f=new File("D:/Studies/Programming/Java/Practice/test.txt");//this is a file

        System.out.println(dir.isDirectory());
        System.out.println(dir.isFile());
        System.out.println(f.isDirectory());
        System.out.println(f.isFile());
        System.out.println();

        String[] fileNames=dir.list();

        for(String x: fileNames){
            System.out.println(x);
        }

        File[] files=dir.listFiles();
        for(File x:files){
            System.out.print(x.getName() +" : ");
            System.out.println(x.getPath());
        }
        System.out.println();
        System.out.println(f.getParent());
        System.out.println(f.lastModified());
        //System.out.println(f.setReadOnly());

        FileOutputStream fos=new FileOutputStream(f);
        fos.write('a');//will raise exception because the file was set as read only
        fos.close();

        /*I have set the file as readonly and then commented this line of code
        when I go on desktop and open the file by notepad I can write, but when I\ try to write with java,
        exception raises
         */
        /*answer
        This is a common point of confusion when dealing with file permissions in Java.
        Even though you commented out the code, the attribute you set on the file persists within
        your operating system's file system.
        Here is why you are experiencing different behaviors between Notepad and Java:
1. The Persistence of File Attributes
When you executed f.setReadOnly(), Java sent a command to your OS (Windows, in this case) to flip the
"Read-only" bit on that specific file.
Commenting out the code simply prevents Java from sending that command again.
It does not undo the change. The file remains read-only until you explicitly change it back
(either via code using f.setWritable(true) or manually in File Explorer).

2. Why Notepad lets you "write"
Notepad and many modern text editors handle read-only files using a "Swap/Replace" strategy rather than a
direct stream:

The "Trick": When you hit save in Notepad, it often doesn't actually write to the original locked file.
Instead, it saves a temporary file and then tries to replace the original. If that fails,
Windows often prompts you to "Save As" a different name.

Permissions: Sometimes, if your user account has "Full Control" in Windows Security settings,
the application can bypass the simple "Read-only" attribute by briefly toggling it off to save and
then toggling it back on.
3. Why Java throws an Exception
The FileOutputStream class is a low-level API. When you call new FileOutputStream(f),
Java asks the OS for a direct "Write Access" handle to that file.
The Conflict: The OS sees the "Read-only" attribute is active.

The Result: The OS denies the request immediately. Since Java cannot open the stream,
it throws a FileNotFoundException (with an "Access is denied" message) or an IOException.
         */
    }
}
