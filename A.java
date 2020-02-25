import java.util.*;
public class A
{
public static void pyramidPattern(int n)
{ 
for (int i=0;i<n;i++)
for (int j=n-i;j>1;j--)
{
System.out.printf(" ");
}
for (int j=0;j<=i;j++);
{
System.out.print("*");
}
System.out.println();
}
}
public static void main(String args[])
{
int n=5;
pyramidpattern(n);
}
}