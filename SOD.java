import java.util.*;
class SOD
{
	public static void main(String args[])
	{
		long n,s;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter a number");
		n=sc.nextLong();
		s=sum(n);
		System.out.println("Sum of digits of a number is"+s);
	}
	static int sum(long num)
	{
		int sum=0;
		while(num!=0)
		{
			sum+=num%10;
			num/=10;
		}
		return sum;
	}
}