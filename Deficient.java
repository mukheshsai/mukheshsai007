
import java.util.Scanner;
class Deficient  
{   
static int divsum(int n)   
   {   
       int sum = 0;   
   for (int i = 1; i <= (Math.sqrt(n)); i++) {   
           if (n % i == 0) {   
                
    if (n / i == i) {   
                   sum = sum + i;   
                }   
               else   
                {   
                  sum = sum + i;   
                   sum = sum + (n / i);   
                }   
            }   
        }   
    
       return sum;   
    }   
    
      
static boolean isDef(int n)   
    {   
   return (divsum(n) < (2 * n));   
    }   
    
   public static void main(String args[])   
    {   
       System.out.println("Enter the number?");  
       Scanner sc = new Scanner(System.in);   
       int n = sc.nextInt();  
       if (isDef(n))   
          System.out.println("The number is deficient.");   
       else  
           System.out.println("The number is not deficient");    
    }   
}   