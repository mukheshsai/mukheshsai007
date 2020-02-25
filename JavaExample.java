import java.util.Scanner;
public class JavaExample
{
public static void main(String arg[])
{
int marks[]=new int[6];
int i;
float total=0,avg;
Scanner Scanner=new Scanner(System.in);
for(i=0;i<6;i++)
{
System.out.println("Enter marks of subject"+(i+1)+";");
marks[i]=Scanner.nextInt();
total=total+marks[i];
}
Scanner.close();
avg=total/6;
System.out.print("Student Grade is:");
if(avg>=80)
{
System.out.print("A");
}
else if(avg>=60&&avg<80)
{
System.out.print("B");
}
else if(avg>=40&&avg<60)
{
System.out.print("C");
}
else
{
System.out.print("D");
}
}
}
