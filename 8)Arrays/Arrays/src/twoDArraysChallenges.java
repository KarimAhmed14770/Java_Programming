import java.lang.*;
import java.util.Scanner;

/*Challenges: Adding two Matrices,Multiplying two Matrices*/
class Matrix
{
    private int row_number;
    private int col_number;
    private int[][] values;

    public Matrix(int r,int c)
    {
        row_number=r;
        col_number=c;
        values=new int[r][c];
    }
    public void setRow_number(int r)
    {
        row_number=r;
    }

    public void setCol_number(int c)
    {
        col_number=c;
    }

    public void setValues(int [][] elements)
    {
        values=elements;
    }

    public int getRow_number()
    {
        return  row_number;
    }
    public int getCol_number()
    {
        return col_number;
    }
    public int[][] getValues()
    {
        return values;
    }

    public Matrix AddMatrices(Matrix M)
    {
        Matrix result=new Matrix(row_number,col_number);
        if(row_number==M.getRow_number() && col_number==M.getCol_number())
        {

            for(int i=0;i<row_number;i++)
            {
                for(int j=0;j<col_number;j++)
                {
                    result.values[i][j]=values[i][j]+M.values[i][j];
                }
            }
        }
        else
        {
            System.out.println("Can't add different size Matrices");
        }
        return result;
    }
    public Matrix Multiplication(Matrix M)
    {
        Matrix result= new Matrix(row_number,M.getCol_number());
        if(col_number==M.getRow_number())
        {
            for(int i=0;i<row_number;i++)
            {
                for(int j=0;j<M.getCol_number();j++)
                {
                    for(int r=0,c=0;r<col_number && c<M.getRow_number();r++,c++)
                    {
                        result.values[i][j]+=values[i][r]*M.values[c][j];
                    }
                }
            }
        }
        else
        {
            System.out.println("Multiplication Invalid");
        }
        return result;
    }
}



public class twoDArraysChallenges {
    public static Scanner sc=new Scanner(System.in);
    public static void readMatrix(Matrix M)
    {
        int[][] arr=new int[M.getRow_number()][M.getCol_number()];
        for(int i=0;i<M.getRow_number();i++)
        {
            for(int j=0;j<M.getCol_number();j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        M.setValues(arr);
    }
    public static void showValues(Matrix M)
    {
        for(int i=0;i< M.getValues().length;i++)
        {
            for(int j=0;j<M.getValues()[i].length;j++)
            {
                System.out.print(M.getValues()[i][j]+ " ");
            }
            System.out.println();
        }
    }

    static void main(String[] args)
    {

        System.out.println("Enter row number followed by column number");
        Matrix M1=new Matrix(sc.nextInt(),sc.nextInt());
        System.out.println("Enter the elements of the matrix in order");
        readMatrix(M1);
        showValues(M1);
        System.out.println();
        System.out.println();

        System.out.println("Enter row number followed by column number");
        Matrix M2=new Matrix(sc.nextInt(),sc.nextInt());
        System.out.println("Enter the elements of the matrix in order");
        readMatrix(M2);
        showValues(M2);
        showValues(M1.AddMatrices(M2));
        showValues(M1.Multiplication(M2));





    }
}
