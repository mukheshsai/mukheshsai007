class PrimeFactors
{
public static void main(String arg[])
{
int number=124;
for(int i=2;i<number;i++)
{
while(number%i=0)
{
System.out.println(i+"number is");
number=number/i;
}
}
if(number>2)
{
System.out.println(number);
}
}
}