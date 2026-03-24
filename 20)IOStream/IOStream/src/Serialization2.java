/*second file in serialization*/


/* we don't want to write the integer member as strings we want to write them as integers
* to do this we need to use datai/p streams
* DataInputStream
* DataOutputStream
*
* they provide the functionality of reading and writing in a specific format
* this format might not be readable for a user or a programmer but it is valid for storing data and retrieving it
* */
import java.io.*;

class Student2{
    int rollNo;
    String Name;
    String dept;
    Student2(){
        rollNo=0;
        Name="";
        dept="";
    }
    Student2(int rollNo,String Name,String dept){
        this.rollNo=rollNo;
        this.Name=Name;
        this.dept=dept;
    }
    public String toString(){
        return "rollNo: "+rollNo+"\nName: "+Name+"\nDept: "+dept+"\n";
    }
}

public class Serialization2 {
    public static void  main(String[] args)throws Exception{
        FileOutputStream fos=new FileOutputStream("D:/Studies/Programming/Java/Practice/student2.txt");
        DataOutputStream dos=new DataOutputStream(fos);
        Student2 s=new Student2(10,"hassan","ECE");
        dos.writeInt(s.rollNo);
        dos.writeUTF(s.Name);
        dos.writeUTF(s.dept);
        dos.close();
        fos.close();


        Student2 s2=new Student2();
        FileInputStream fis=new FileInputStream("D:/Studies/Programming/Java/Practice/student2.txt");
        DataInputStream dis=new DataInputStream(fis);
        //s2.Name=dis.readUTF();// will raise exception, because the first element is integer
        s2.rollNo=dis.readInt();
        s2.Name= dis.readUTF();
        s2.dept=dis.readUTF();

        dis.close();
        fis.close();
        System.out.println(s2);

        /*what is the problem here?
        * the problem here is that although we managed to write and read in specific data format
        * we still need to write the object member by member, why we don't just store the whole object at once
        * and read the whole object at once, this would be much easier and better
        * and this is what is called serialization
        * */
    }
}

