public class StringPractice {
    public static void main(String[] args)
    {
        /*String is  a built in class in java, to know its memebers cmd>> javap java.lang.String
        * when you create a string Object in java you create a reference to a place in memory
        * java doesn't allow address access by pointers like c, java has no pointers
        * when you write: String str="Hello"; str refers to the string Object "Hello" in memory
        * so the var str is a reference object, the string object "Hello" is allocated at the constant
        * pool data and not in the heap
        * if you create a string using the String constructor method
        * String str2=new String("Hello"); str2 is a reference to the string object "Hello" in the heap
        * str2 is not equal to str, str2 refers to a string in heap, str refers to a string in the constant
        * pool, though the content is the same the references are not equal
        * strings in java are immutable once created can't be modified however you can make the reference
        * point to another string in memory and the garbage collector will deal with the older string
        *if you create two String references in constant pool they will point to the same object
        * String str1="Hello";, String str2="Hello"; str1==str2 will give true
        * but if you create two objects in heap even if they have the same content the references will
        * be different
        * String str3=new String("Karim");
        String str4=new String("Karim");
        * str3==str4; will give false
        * */

        /*Note on Memory leakage
        Heap objects are automatically garbage collected, but external resources (files, sockets, etc.)
        may leak if not closed properly.
        notes in the text file

         */
        String str1="Karim";
        String str2="Karim";
        String str3=new String("Karim");
        String str4=new String("Karim");
        System.out.println("str1==str2 is: "+(str1==str2));
        System.out.println("str2==str3 is: "+(str2==str3));
        System.out.println("str3==str4 is: "+(str3==str4));


        /*String creation Methods*/
        /*1)Constant pool*/
        String greet="Hello";
        /*2)Using Constructors
        *public java.lang.String(); creates an empty string
        * public java.lang.String(java.lang.String) takes a string
        * public java.lang.String(char[]) takes an array of characters
        * public java.lang.String(char[],int,int);takes an array of characters and build a string
        * from starting index to number of chars
        * public java.lang.String(byte[]); takes an array of bytes
        * */
        String Empty=new String();
        String Name=new String("Karim Ahmed");
        char[] c={'E','a','r','t','h'};
        String Earth=new String(c);
        String Earth1=new String(c,2,2);
        byte[] arr={65,66,67,76};
        String byteString=new String(arr);
        System.out.println(Empty);
        System.out.println(Name);
        System.out.println(Earth);
        System.out.println(Earth1);
        System.out.println(byteString);





    }
}
