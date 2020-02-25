public class Fibonacci 
{
    public static void main(String[] args) 
{
        int n = 10, a = 0, b = 1;
        System.out.println("First " + n + " terms: ");
        for (int i = 1; i <= n; ++i)
        {
            System.out.println(a + " + ");
            int sum = a+b;
            a = b;
            b = sum;
        }
    }
}