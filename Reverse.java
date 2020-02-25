import java.util.*;
class Reverse
{
public static void main(String args[])
{
int n,s;
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
n=sc.nextInt();
s=sum(n);
System.out.println("reverse of a number is"+s);
}
static int sum(int num)
{
int sum=0;
while(num!=0)
{
sum=sum*10+num%10;
num/=10;
}
return sum; 
}
}