import java.lang.*;

/*In this section we explore some string methods and use them*/

/*cmd>javap java.lang.String to get the members of the string class*/

/*Note strings in java are immutable once created can't be modified,any function that operates
on a string and returns a string, it returns a different copy with the changes but it doesn't modify
the string itself*/
/*Most used Methods*
 public int length(); this method returns the length of a string and can take empty string
 public boolean isEmpty(); this method checks if the string is empty or not
 public java.lang.String toLowerCase(); this method returns a new string that is all in lower case
 public java.lang.String toUpperCase(); this methods returns a string that is all in upper case
 public java.lang.String trim(); removes all trailing or leading whitespaces in a string
 public java.lang.String strip(); removes all trailing and leading whitespaces in a string
 public java.lang.String stripLeading();
 public java.lang.String stripTrailing();
 public char charAt(int); returns the character at the given index, if you give an out of boundary
 index you will face an exception
 public java.lang.String substring(int); returns part of a string starting from a certain index
 public java.lang.String substring(int, int);returns part of the string starting from a given index
 and ending at a give index
 public java.lang.String replace(char, char); returns a string where old char replaced by new one
 public boolean startsWith(java.lang.String); checks if a string starts with a substring and returns boolean
 public boolean startsWith(java.lang.String, int);
 public boolean endsWith(java.lang.String);checks if a string ends with a substring and returns boolean
 public int indexOf(java.lang.String); gets the index of the first substring, it returns -1 if not found
 public int indexOf(java.lang.String, int);gets the index of the first substring with starting index
 public int indexOf(java.lang.String, int, int);gets the index from a starting and end index
 public int lastIndexOf(java.lang.String); gets the index of a substring backwards
 public boolean equals(java.lang.Object); checks the content of strings if they are qual it returns true
 public boolean equalsIgnoreCase(java.lang.String); ignores the case and check for equality
 public int compareTo(java.lang.String); it compares based on dictionary order, if the order of the first
 is smaller it returns -ve integer, if the order of the first is greater it returns =ve integer ,
 if equal it returns 0
public int compareToIgnoreCase(java.lang.String); comparison and ignores case
public boolean contains(java.lang.CharSequence); checks if a string contains a substring
  public static java.lang.String valueOf(boolean); convert a boolean to string
  public static java.lang.String valueOf(char);
  public static java.lang.String valueOf(int);convert int to string
  public static java.lang.String valueOf(long);
  public static java.lang.String valueOf(float);
  public static java.lang.String valueOf(double);
*/


class StringMethods{
    static public void main(String []args)
    {
        String Name="Karim Ahmed";
        String Empty="";
        System.out.println(Name.length());
        System.out.println(Empty.length());
        if(Empty.isEmpty())
        {
            System.out.println("String is Empty");
        }
        String fullName=new String("Karim Ahmed Hamdy");
        String fullNameLower=fullName.toLowerCase();
        String fullNameUpper=fullName.toUpperCase();
        System.out.println("fullName: "+fullName+"\nfullNameLower: "+fullNameLower+"\nfullNameUpper: "
        +fullNameUpper);
        String str="     Hello      ";
        System.out.println(str.trim());
        System.out.println(str.strip());
        System.out.println(fullName.charAt(2));
        System.out.println(fullName.substring("Karim ".length()));
        System.out.println(fullName.substring("Karim ".length(),14));
        System.out.println(fullName.replace('m','W'));

        String udemy_domain="https://www.udemy.com/";
        if(udemy_domain.startsWith("https://"))
        {
            System.out.println("it uses https protocol");
        }
        if(udemy_domain.endsWith(".com/"))
        {
            System.out.println("it is commercial");
        }
        System.out.println(fullName.indexOf("Ahmed"));
        System.out.println(fullName.indexOf("m",7));
        System.out.println(fullName.indexOf("m",7,12));
        System.out.println(fullName.lastIndexOf("m"));

        String carBrand="BMW";
        String carBrand2=new String("BMW");
        String carBrand3="bmW";
        System.out.println(carBrand.equals(carBrand2));
        System.out.println(carBrand.equalsIgnoreCase(carBrand3));

        String fruit1="apple";
        String fruit2="banana";
        String fruit3="Banana";
        System.out.println(fruit1.compareTo(fruit2));
        System.out.println(fruit2.compareTo(fruit3));
        System.out.println(fruit2.compareToIgnoreCase(fruit3));

        System.out.println(fullName.contains("Karim"));
        System.out.println(fullName.concat(" Mahmoud"));
        System.out.println(String.valueOf(20));








    }
}