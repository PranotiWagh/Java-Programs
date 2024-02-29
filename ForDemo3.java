import java.util.Scanner;
class ForLoop3
{
    public static int fact(int n)
    {
        int product=1;
        for(int i=1;i<=n;i++)
        {
            product=product*i;
        }
        return product;      
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter number");
        int number=s.nextInt();
        int product=fact(number);
        System.out.println("Factorial of number is"+product);
    }
}