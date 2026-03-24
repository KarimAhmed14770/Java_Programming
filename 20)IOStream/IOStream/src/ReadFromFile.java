
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


/*file2*/


public class ReadFromFile {

   public static void main(String[] Args){
       try(FileInputStream fis=new FileInputStream("D:/Studies/Programming/Java/Practice/test.txt")){
           byte[] b=new byte[fis.available()];
           fis.read(b);//returns total number of bytes read, or -1 if no more data to read
           String str=new String(b);
           System.out.println(str);



       }catch(FileNotFoundException e){
           System.out.println(e);
       }
       catch (IOException e){
           System.out.println(e);
       }

       try(FileInputStream fis=new FileInputStream("D:/Studies/Programming/Java/Practice/test3.txt")){

       int x;
       while((x= fis.read())!=-1){ //returns the byte in int as in ASCII code
           System.out.print((char)x);
       }
       System.out.println();
   }catch(FileNotFoundException e){
           System.out.println(e);
       }
       catch (IOException e){
           System.out.println(e);
       }



}
}
