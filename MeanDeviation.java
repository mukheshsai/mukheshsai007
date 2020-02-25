import java.util.Scanner;  
class MeanDeviation  
{  
public static void main(String arg[])  
{  
  System.out.println("Enter 10 numbers to find standard deviation");  
  Scanner in=new Scanner(System.in);  
  double[] arr=new double [10];  
  double sum=0,mean=0;  
  for (int i=0;i<10;i++)  
{  
  System.out.println("Enter a number : ");  
  arr[i]=in.nextDouble();  
  sum+=arr[i];   
}  
 mean=sum/10;  
 sum=0;  
 System.out.println("Mean : "+mean);   
 double[] temp=new double[10];  
 for (int i=0;i<10;i++)   
{  
 temp[i]=Math.pow((arr[i]-mean),2);  
 sum+=temp[i];  
 }  
  mean=sum/10;  
  double deviation=Math.sqrt(mean);  
  System.out.println("Deviation : "+ deviation);  
 }  
}  