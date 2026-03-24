/*file 9, 1 in the serialization problem*/

/*serialization is a solution to a problem
the problem is that we want to store an object in a file
 */
import java.io.*;

/*printstream contains the methods of print, println, it takes a parameter and print it as a string
* to the output stream it is attached to*/
class Student{
    int rollNo;
    String Name;
    String dept;
    Student(int rollNo,String Name,String dept){
        this.rollNo=rollNo;
        this.Name=Name;
        this.dept=dept;
    }

    public String toString(){
        return "rollNo: "+rollNo+"\nName: "+Name+"\nDept: "+dept+"\n";
    }
}

public class Serialization1 {
    public static void main(String[] args)throws Exception{
        /*note:when we say System.out.println()
        System is a class that has an object called out, out is a printStream object, and it is a static object*/
         FileOutputStream fos=new FileOutputStream("D:/Studies/Programming/Java/Practice/student1.txt");
         PrintStream ps=new PrintStream(fos);//now the print streams print on the fos that is attached to
        //the file
        Student s=new Student(10,"Karim","MCT");
        ps.println(s.rollNo);
        ps.println(s.Name);
        ps.println(s.dept);
         ps.close();
         fos.close();


        FileReader fr=new FileReader("D:/Studies/Programming/Java/Practice/student1.txt");
        BufferedReader br=new BufferedReader(fr);

        Student s2=new Student(0,"","");
        s2.rollNo=Integer.parseInt(br.readLine());
        s2.Name=br.readLine();
        s2.dept=br.readLine();
        System.out.println(s2);
        fr.close();
        br.close();

        /*what is the problem here?
         the problem is that printStream prints everything as a string in the text file, so when we try to
         read the rollno we are going to read it as a string
         and we must parse the rollno as an int when reading it
          */
    }
}
