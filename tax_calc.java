import java.util.Scanner;
class tax_calc
{
public static void main(String arg[])
{
 int act_price;
 System.out.println("Enter actual price");
 Scanner s=new Scanner(System.in);
 act_price=s.nextInt();
 System.out.println("Enter sales tax");
 float st=s.nextFloat();
 float overall_cost=act_price+(act_price/st);
 System.out.println("Overall cost with sales tax is "+overall_cost);
 }
}