import java.io.*;

/*file4*/

public class ByteStreamsAndCharArray {
    public static void main(String[] Args)throws Exception{
        byte[] b={'a','b','c','d','e','f','g','h','i','j'};
        char[] c={'k','l','m','n','o','p','q','r','s','t'};
        ByteArrayInputStream bis=new ByteArrayInputStream(b);
        CharArrayReader cr=new CharArrayReader(c);
        /*this is mimicking an input byte array, as if b or c are arrays coming from outside the program
        in real projects we may have an input bytearray coming from printers,other threads, other programs...etc
         */
        int x;
        while((x=bis.read())!=-1){
            System.out.print((char)x+" ");
        }
        System.out.println();
        bis.close();

        while((x=cr.read())!=-1){
            System.out.print((char)x+" ");
        }
        System.out.println();
        cr.close();

        ByteArrayOutputStream bos=new ByteArrayOutputStream(20);
        CharArrayWriter cw=new CharArrayWriter(20);
        for(int i=0;i<b.length;i++){
            bos.write(b[i]);
            bos.write(' ' );
        }
        for(int i=0;i<c.length;i++){
            cw.write(c[i]);
            cw.write(' ' );

        }

        FileOutputStream fos=new FileOutputStream("test");
        FileWriter fw=new FileWriter("test2");
        fos.write(bos.toByteArray());
        fw.write(cw.toCharArray());

        bos.close();
        cw.close();
        fos.close();
        fw.close();



    }
}
