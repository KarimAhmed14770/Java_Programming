import java.lang.*;
import java.util.*;

/*
* in this file we explain arrays in java
 an array is a collection of elements of the same data type
 * 1D array
 * array creation in java:
 * DataType[] arr_name=new Datatype[size];the brackets can be after datatype or variable name
 * DataType[] arr_name={elements seperated by comma};
 * arr_name[] the square brackets must be empty, and the arr_name is a reference to the array object
 * arrays are always objects in java and always created in heap even if u don't use new keyword
 * an array in java has a property(attribute) called length, it is a number that carries the size of the array
 * arr_name.length return this number
 * conclusion:arr_name is a reference to the array object in the heap which has a property called length
 * array elements can be accessed through indexing by square brackets
 */

/*2D arrays
creating a 2d array in java
DataType[][] arr_name=new Datatype[rows_size][cols_size];
what happens? arr_name becomes a reference to an array of references of rows_size elements,each
reference in the array of references points to an array object in  heap
 */


public class Arrays {

    public static void main(String[] args)
    {
        /*array creation methods*/
        /*1)using new keyword*/
        int[] arr =new int[10]; /*arr is a reference to an array object of size 10 in heap,this
        creates an array of 10 elements with values of zeroes */
        System.out.println(arr.length);
        /*2)initializing on creation*/
        float[] arr2={1.5f,2.3f,3.4f,80f,22.3f};//the array will be created in heap and its size
        //is the number of elements
        System.out.println(arr2.length);
        double arr3[]={12.5,23,20.3,11000.44,20931};
        /*create an empty array*/
        int []empty={};
        int[] empty2=new int[0];
        System.out.println(empty.length);
        System.out.println(empty2.length);


        /*using for each loop to print array elements*/
        for(float x :arr2)
        {
            System.out.print(x+" ");
        }
        System.out.println();
        for(double x :arr3)
        {
            System.out.print(x+" ");
        }
        System.out.println();
        /*using for loop to initialize an array*/
        for(int i=0;i< arr.length;i++)
        {
            arr[i]=i*2;
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        /*note when using for loop you can access each element in the array and modify it
        but for each loop if you modify x, nothing in the array is modified,x just holds an instance
        of the corresponding element of the array
         */
        for(int x:arr)
        {
            x+=2;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();


        /*2d arrays*/
        /*Creation*/
        int[][] twodArr=new int[3][4];//created the array
        /*initialize the array*/
        for(int i=0;i<twodArr.length;i++) //twodarr is a reference to an array of references of size 3
        {
            for(int j=0;j<twodArr[i].length;j++)//twodarr[i] is a reference to an array of elements of size 4
            {
                twodArr[i][j]=i+j;
            }
        }
        for(int i=0;i<twodArr.length;i++)
        {
            for(int j=0;j<twodArr[i].length;j++)
            {
                System.out.print(twodArr[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        int[][] twodArr1={{1,2,3,4},{5,6,7,8},{9,8,7,6}};//created and initialized the array
        /*using for each loop to display twodarr1*/
        for(int[] x:twodArr1)
        {
            for(int y :x)
            {
                System.out.print(y+ " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        /*how to create a jagged array(a 2d array that hold different size of columns)*/
        int[][] jagged=new int[3][];
        jagged[0]=new int[5];
        jagged[1]=new int[3];
        jagged[2]=new int[10];

        for(int i=0;i<jagged.length;i++)
        {
            for(int j=0;j<jagged[i].length;j++)
            {
                jagged[i][j]=i+j;
            }
        }
        for(int[] x :jagged)
        {
            for(int y:x)
            {
                System.out.print(y+ " ");
            }
            System.out.println();
        }



    }
}
