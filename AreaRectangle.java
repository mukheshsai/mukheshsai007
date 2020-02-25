import java.util.*;
interface Calc
{
 void print();
}
class Rectangle implements Calc
{
public void print()
{
Scanner s=new Scanner(System.in);
int length;
length=s.nextInt();
int breadth;
breadth=s.nextInt();
int area=length*breadth;
System.out.println("Area of Rectangle:"+area);
}
}
class AreaRectangle
{
public static void main(String arg[])
{
Rectangle r=new Rectangle();
r.print();
}
}
