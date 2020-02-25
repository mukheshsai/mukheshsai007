class Armstrong
{
public static void main(String ar[])
{
int n=371,num1,re,r=0;
num1=n;
while(num1!=0)
{
re=num1%10;
r +=Math.pow(re,3);
num1/=10;
}
if(r==n)
System.out.println(n+"is a armstrong number");
else
System.out.println(n+"is a not armstrong number");
}
}