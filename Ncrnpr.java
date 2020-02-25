class Factorial
{
int n;
int fact(int num)
{
n=num;
for(int i=1;i<=n;i++)
f=f*i;
return f;
}
}
class Compute
public static void main(String args[])
{
int n,r,ncr,npr; 
n=6;r=5;
factorial f=new factorial();
ncr=f.fact(n)/(f.fact(r)*f.fact(n-r));
npr=f.fact(n)/(f.fact(n-r));
System.out.println("n is"+n+"r is"+r);
System.out.println("ncr="+ncr);
System.out.println("npr="+npr);
}
}