class Palindrome
{
public static void main(String ar[])
{
int num=121,ri=0,re,oi;
oi=num;
while(num!=0)
{
re=num%10;
ri=ri*10+re;
num/=10;
}
if(oi==ri)
System.out.println(oi +"  is a palindrom");
else
System.out.println(oi  +"  is not a palindrom");
}
}