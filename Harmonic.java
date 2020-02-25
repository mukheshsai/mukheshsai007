class Harmonic
{
public static void main(String arg[])
{
 int n=50000;
 int sum1=0;
for(int i=0;i<=n;i++)
{
 sum1+=(1/i);
}
int sum2=0;
for(int i=n;i>0;i--)
{
 sum2+=(1/i);
}
if(sum1==sum2)
{
 System.out.println("Both sums are same");
}
else
{
 int d=sum1-sum2;
System.out.println(d+"is the difference value ");
  }
 }
}
