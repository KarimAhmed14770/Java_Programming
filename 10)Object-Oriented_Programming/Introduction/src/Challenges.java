import javax.lang.model.element.Name;
import java.lang.*;
import java.util.Scanner;

/*How to create an array of objects*/
/*in the challenge we are required to create 2 classes Student and subject*/

/*the plan:
before any code writing we should put the requirements and the plan
Subject class
a subject should have a name,code,maximum marks,Obtained Marks
name,code should never be changed when created
maximum marks may be changed at some cases, Obtained marks may change


Student:will have an ID that can't be changed,Name can't be changed,department and subjects list
department and subject lists can be changed
student name and id must be set on creation, department may be set on creation
but subjects list will be set later

 */

class Subject
{
    private String subCode;
    private String subName;
    private int maxMarks;
    private int marksObtained;

    Subject(String subCode,String subName)
    {
        this.subCode=subCode;
        this.subName=subName;
    }
    Subject(String subCode,String subName,int maxMarks)
    {
        this.subCode=subCode;
        this.subName=subName;
        this.maxMarks=maxMarks;
    }

    public void setMaxMarks(int maxMarks)
    {
        this.maxMarks=maxMarks;
    }
    public void setMarksObtained(int marksObtained)
    {
        this.marksObtained=marksObtained;
    }
    public String getSubCode()
    {
        return subCode;
    }
    public String getSubName()
    {
        return subName;
    }
    public int getMaxMarks()
    {
        return maxMarks;
    }
    public int getMarksObtained()
    {
        return marksObtained;
    }

    @Override
    public String toString()
    {
        /*this method returns a string representation of the object, it can be defined
        * for any object and when used it returns a string representation according to definition
        */
        return "Subject Code:"+this.subCode+"\nSubject name:"+subName+"\nMaximum Marks:"+maxMarks
                +"\nMarks Obtained:"+marksObtained;

    }

}

class Student
{
    private String id;
    private String name;
    private String department;
    private Subject[] subjects;
    Student(String id,String name)
    {
        this.id=id;
        this.name=name;
    }
    Student(String id,String name,String department)
    {
        this.id=id;
        this.name=name;
        this.department=department;
    }
    void setDepartment(String department)
    {
        this.department=department;
    }
    void setSubjects(Subject[] subjects)
    {
        this.subjects=new Subject[subjects.length];
        for(int i=0;i<this.subjects.length;i++)
        {
            this.subjects[i]=subjects[i];
        }
        //you can replace this with system .copy
        //System.arraycopy(subjects, 0, this.subjects, 0, this.subjects.length);
    }
    public String getName()
    {
        return name;
    }
    public String getId()
    {
        return id;
    }
    public String getDepartment()
    {
        return department;
    }
    public Subject[] getSubjects()
    {
        return subjects;
    }

    @Override
    public String toString()
    {
        String description="Name:"+name+"\nId:"+id+"\nDepartment:"+department+"\n\nSubjects Evaluation:\n\n";
        for(int i=0;i<subjects.length;i++)
        {
            description+=subjects[i].toString()+"\n\n";
        }
        return description;
    }

}


public class Challenges {
    public static void main(String[] args)
    {
        Subject test=new Subject("MCT334","Introduction to Mechatronics",100);
        test.setMarksObtained(83);
        Subject[] listOfSubjects=new Subject[5];
        listOfSubjects[0]=new Subject("MCT111","Control Systems",100);
        listOfSubjects[0].setMarksObtained(85);
        listOfSubjects[1]=new Subject("MCT112","Logic Design",100);
        listOfSubjects[1].setMarksObtained(80);
        listOfSubjects[2]=new Subject("MCT122","Power Electronics",100);
        listOfSubjects[2].setMarksObtained(79);
        listOfSubjects[3]=new Subject("MCT321","Autonomous Systems",100);
        listOfSubjects[3].setMarksObtained(90);
        listOfSubjects[4]=new Subject("MCT322","Mechatronics in Automotive",100);
        listOfSubjects[4].setMarksObtained(88);
        //System.out.println(test.toString());
        Student karim=new Student("1807657","Karim Ahmed Hamdy","Mechatronics Engineering");
        karim.setSubjects(listOfSubjects);
        System.out.println(karim.toString());

    }
}
