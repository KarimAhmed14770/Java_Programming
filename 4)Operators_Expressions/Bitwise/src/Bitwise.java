import java.lang.*;
import java.util.*;



public class Bitwise {
    public static void main(String[] args)
    {
        /*Bitwise Operators only operates on integer types
         * 1)AND &
         * 2)OR |
         * 3)NOT  ~
         * 4)XOR ^ both must be different to produce 1
         * 5) >> Right shift
         * 6) << Left shift
         * 7) >>> unsigned right shif
         * */
         byte x=10,y=6;
         int z;
         //x=0000 1010
         //y=0000 0110
         z=x &y; //z=00000010 which is 2 in decimal
         System.out.println(z);
         z=x|y;  //z=00001110 which is 14 in decimal
         System.out.println(z);
         z=~x; //z= 11110101  which is -11 in twos complement
        System.out.println(z);
        z=x^y;   //z=0000 1100  which is 12 in decimal
        System.out.println(z);

        z=x<<2;
        System.out.println(Integer.toBinaryString(z));

        /*Bit masking and merging*/
        int Gpio=0b11010101;
        //to set bit N gpio=gpio |(1<<N)
        Gpio=(Gpio |(1<<1));
        System.out.println(Integer.toBinaryString(Gpio));

        Gpio=0b11010101;
        //to clear a certain byte GPIO=GPIO &(~(1<<N))
        Gpio=Gpio&(~(1<<2));
        System.out.println(Integer.toBinaryString(Gpio));
        //toggle,read,bit info merging the
        /*How to toggle a bit*/
        Gpio=0b11010101; //want to toggle bit at position 2 only 1<<2 ^ xor will toggle
        Gpio=Gpio^(1<<6);
        System.out.println(Integer.toBinaryString(Gpio));

        Gpio=0b11010101;//to read a bit, & with 1
        int bit_value;
        bit_value=(Gpio&(1<<1))>>1;
        System.out.println(Integer.toBinaryString(bit_value));







    }
}
