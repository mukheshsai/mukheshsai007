class Sum
Static int get sum(int n)
{
int sum=0;
while(n!=0)
{
sum=sum+n%10;
n=n/10;
}
return sum;
}
public static void main(String arg[])
{
int n=685;
System.out.println(get sum(n));
sum(n);
}
}