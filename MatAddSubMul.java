import java.util.Scanner;
public class MatAddSubMul 
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter no. of rows: ");
int row=s.nextInt();
System.out.println("Enter no. of columns: ");
int col=s.nextInt();
int X[][]=new int[row][col];
int Y[][]=new int[row][col];
System.out.println("Enter first matrix- ");
for(int i=0;i<row;i++)
{
 for(int j=0;j<col;j++)
 {
  X[i][j]=s.nextInt();
 }
}
System.out.println("Enter second matrix-");
for(int i=0;i<row;i++)
{
 for(int j=0;j<col;j++)
 {
  Y[i][j]=s.nextInt();
 }
}
int Z[][]=new int[row][col];
for(int i=0;i<row;i++)
{
 for(int j=0;j<col;j++)
 {
  Z[i][j]=X[i][j]+Y[i][j];
 }
}
System.out.println("Addition of two matrices is: ");
for(int i=0;i<row;i++)
{
 for(int j=0;j<col;j++)
 {
  System.out.println(Z[i][j]+" ");
 }
System.out.println();
}
int W[][]=new int[row][col];
for(int i=0;i<row;i++)
{
 for(int j=0;j<col;j++)
 {
  W[i][j]=X[i][j]-Y[i][j];
 }
}
System.out.println("Subtraction of two matrices is: ");
for(int i=0;i<row;i++)
{
 for(int j=0;j<col;j++)
 {
  System.out.println(W[i][j]+" ");
 }
System.out.println();
}
int T[][]=new int[row][col];
for(int i=0;i<row;i++)
{
 for(int j=0;j<col;j++)
 {
  T[i][j]=T[i][j]+X[i][j]*Y[i][j];
 }
}
System.out.println("Multiples of two matrices: ");
for(int i=0;i<row;i++)
{
 for(int j=0;j<col;j++)
 {
  System.out.println(T[i][j]+" ");
 }
System.out.println();
}
s.close();
}
}