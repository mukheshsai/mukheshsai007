import java.util.Scanner;
class Table
{
public static void main(String arg[])
 {
  int n;
  System.out.println("Enter the number for table:");
  Scanner s=new Scanner(System.in);
  n=s.nextInt();
 for(int i=1;i<=10;i++)
  {
   System.out.println(n+"*"+i+"="+n*i);
  }
 }
}
