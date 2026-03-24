import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;



public class ArrayChallenges {
    static void arr_init(int[] arr)
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

    }
    static void print_arr(int [] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int sum_arr(int[] arr)
    {
        int sum=0;
        for(int x:arr)
        {
            sum+=x;
        }
        return  sum;
    }

    static int max_element(int[] arr)
    {
        int max=0;
        for(int x:arr)
        {
            if(x>=max)
            {
                max=x;
            }
        }
        return  max;
    }
    static int second_max_element(int[] arr)
    {
        int max1=arr[0];int max2=arr[0];
        for(int x:arr)
        {
            if(x>=max1 ||x>=max2)
            {
                if(x>=max1) {
                    max2 = max1;
                    max1 = x;
                }
                else
                {
                    max2=x;
                }
            }
        }
        return  max2;
    }
    static int search_arr(int[] arr,int element)
    {
        int index=0;
        boolean is_found=false;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==element)
            {
                is_found=true;
                index=i;
                break;
            }
        }
        if(!is_found)
        {
            index=-1;
        }
        return index;
    }
    static int[] rotateRight(int[] arr)
    {
        int[] new_arr=new int[arr.length];
        new_arr[0]=arr[arr.length-1];
        for(int i=1;i<=arr.length-1;i++)
        {
            new_arr[i]=arr[i-1];
        }
        return new_arr;
    }
    static void insert(int[] arr,int element,int index)//there must be empty space in array
    {
        int prev=0; int next=0;
        if(index<=arr.length)
        {
            prev=arr[index];
            for(int i=index;i<arr.length-1;i++)
            {

                next=arr[i+1];
                arr[i+1]=prev;
                prev=next;
            }
            arr[index]=element;
        }
        else
        {
            System.out.println("Index out of boundary");
        }
    }
    static void delete(int[] arr,int index)
    {
        int prev=0; int next=0;
        if(index<=arr.length)
        {
            prev=arr[index];
            for(int i=index;i<arr.length-1;i++)
            {
                arr[i]=arr[i+1];
            }
            arr[arr.length-1]=0;
        }
        else
        {
            System.out.println("Index out of boundary");
        }
    }
    public static void main(String[] args)
    {
        /*challenge 1 :take an array input from user with user defined size*/
        Scanner sc=new Scanner(System.in);
        byte size;
        int element=0;
        System.out.println("Enter the size of the array");
        size=sc.nextByte();
        System.out.println("Enter the array elements(Integers)");
        int[] arr=new int[size];
        arr_init(arr);
        print_arr(arr);

        System.out.println("Sum= "+sum_arr(arr));

        System.out.println("Max1= "+max_element(arr));

        System.out.println("Max2= "+second_max_element(arr));
        /*Searching for an element*/
        System.out.println("Enter the integer u want to find");
        element=sc.nextInt();
        System.out.println("Index= "+search_arr(arr,element));
        System.out.print("Right Rotation: ");
        print_arr(rotateRight(arr));
        insert(arr,20,5);
        print_arr(arr);
        delete(arr,3);
        print_arr(arr);


    }
}
