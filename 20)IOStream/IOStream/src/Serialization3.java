/*the last file in the serialization problem*/
/*in this file we will write an object, and in another file we will read an object*/
/*we want to write an entire object or read an entire object from a file , so we will use
* ObjectInputStream
* ObjectOutputStream
*
* note that for an object to become serializable its class must implement serializable interface
* and it must have a non parameterized constructor even if it is empty
*
* every member of the object is serialized except for two members:
* static members
* transient members:In Java, the transient keyword is a powerful modifier used in the context of object
* serialization.When you mark a variable as transient, you are telling the Java Virtual Machine (JVM)
*  to skip that specific variable when converting an object into a byte stream.
*
*
* */

import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


class Student3 implements Serializable {
    static final int number_of_subjects=5;
    transient int grade;
    String name;
    int rollNo;
    String[] subjects=new String[number_of_subjects];
    float[] scores=new float[number_of_subjects];


    Student3(){
        name="";
        rollNo=0;
        for(int i=0;i<5;i++){
            subjects[i]="";
            scores[i]=0;
        }

    }

    @Override
    public String toString() {
        return "Name: "+name+"\nRollNo: "+rollNo+"\nSubjects:\n"+subjects[0]+": "+scores[0]+"\n"
                +subjects[1]+": "+scores[1]+"\n"
                +subjects[2]+": "+scores[2]+"\n"
                +subjects[3]+": "+scores[3]+"\n"
                +subjects[4]+": "+scores[4]+"\n";
    }
}

public class Serialization3 {
    public static void main() throws Exception{
        FileOutputStream fos=new FileOutputStream("D:/Studies/Programming/Java/Practice/student3.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);

        Student3 s=new Student3();
        s.name="Karim"; s.rollNo=1807657;
        s.subjects[0]="MCT"; s.subjects[1]="ECT"; s.subjects[2]="ARC";
        s.subjects[3]="CSE"; s.subjects[4]="SE";

        s.scores[0]=82.3f; s.scores[1]=85.8f; s.scores[2]=92f; s.scores[3]=96.8f; s.scores[4]=77.4f;
        s.grade=100;

        oos.writeObject(s);

        oos.close();
        fos.close();
    }
}
