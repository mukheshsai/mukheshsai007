import java.util .Scanner;
class SiCi
{
    public static void main (String arg[])
{
    double p,r,t,si,ci;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the amount:");
    p=sc.nextDouble();
    System.out.println("Enter the No.of years:");
    t=sc.nextDouble();
    System.out.println("Enter the Rate of  interest");
    r=sc.nextDouble();
    si=(p*t*r)/100;
    ci=p*Math.pow(1.0+r/100.0,t)-p;
    System.out.println("Simple Interest="+si);
    System.out.println("Compound Interest="+ci);
   }
}